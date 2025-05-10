package Laire.Terminal;

import java.io.IOException;

import Laire.AppManager;
import Laire.Core;
import Laire.Main;
import Laire.Apps.Notepad;
import Laire.Apps.WhatDaHeck;
import Laire.Misc.Dev;

public class Terminal {
    Core core = new Core();
    AppManager aman = new AppManager();
    WhatDaHeck wdh = new WhatDaHeck();
    Notepad note = new Notepad();
    Main mn = new Main();
    private void AppManagerCommand() throws IOException{
        aman.AppLauncher();
    }
    private void HelpCommand(){
        System.out.println("clear clears the terminal.");
        System.out.println("aman launches AppManager.");
        System.out.println("help launches Help Page of Laire.");
        System.out.println("quit for quitting this Laire session");
        System.out.println("Laire Version : " + core.LaireVersion );
    }
    private String input;
    public void TerminalApp() throws IOException{
        System.out.println("O==================O");
        System.out.println("|                  |");
        System.out.println("|      LAIRE       |");
        System.out.println("|     Welcome!     |");
        System.out.println("|                  |");
        System.out.println("O==================O\n");
        HelpCommand();
        System.out.print("> ");
        while (true){
            input = core.LaireScanner.nextLine();
            mn.clearTerm();
            if(input.equals("aman")){
                AppManagerCommand();
                System.out.print("> ");
            }
            else if(input.equals("help")){
                HelpCommand();
                System.out.print("> ");
            }
            else if(input.equals("quit")){
                System.out.println("Quitting Laire... Please wait. (The time might change based on your computer's speed.)");
                break;
            }
            else if(input.equals(wdh.CallName)){
                wdh.WhatDaHeckApp();
                System.out.print("> ");
            }
            else if(input.equals("note")){
                note.NotepadApp();
                System.out.print("> ");
            }
            else if(input.equals("clear")){
                mn.clearTerm();
                System.out.print("> ");
            }
            else if(input.equals("dev")){
                Dev d = new Dev();
                d.App();
                System.out.print("> ");
            }
            else{
                System.out.println("Bad command, or unrecognized command. Check your spelling again please.");
                System.out.print("> ");
            }
        }
    }
}