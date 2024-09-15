package Laire.Terminal;

import java.io.IOException;

import Laire.AppManager;
import Laire.Core;
import Laire.Apps.Notepad;
import Laire.Apps.WhatDaHeck;

public class Terminal {
    Core core = new Core();
    AppManager aman = new AppManager();
    WhatDaHeck wdh = new WhatDaHeck();
    Notepad note = new Notepad();
    private void AppManagerCommand() throws IOException{
        aman.AppLauncher();
    }
    private void HelpCommand(){
        System.out.println("aman launches AppManager.");
        System.out.println("help launches Help Page of Laire.");
        System.out.println("quit for quitting this Laire session");
        System.out.println(wdh.CallName + " launches WhatDaHeck. (Something like AIDA64)");
        System.out.println("Laire Version : " + core.LaireVersion );
    }
    private String input;
    public void TerminalApp() throws IOException{
        HelpCommand();
        while (true){
            input = core.LaireScanner.nextLine();
            if(input.equals("aman")){
                AppManagerCommand();
            }
            else if(input.equals("help")){
                HelpCommand();
            }
            else if(input.equals("quit")){
                break;
            }
            else if(input.equals(wdh.CallName)){
                wdh.WhatDaHeckApp();
            }
            else if(input.equals("note")){
                note.NotepadApp();
            }
            else{
                System.out.println("Bad command, or unrecognized command. Check your spelling again please.");
            }
        }
    }
}
