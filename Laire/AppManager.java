package Laire;

import java.io.IOException;

import Laire.Apps.EightBall;
import Laire.Apps.Notepad;
import Laire.Apps.Passy;

// Used as app creation method class at Stage 2 of Experiment Series 1 Stage 2
public class AppManager {
    private String input;
    Core core = new Core();
    LCalc calc = new LCalc();
    EightBall eb = new EightBall();
    Notepad note = new Notepad();
    Passy passy = new Passy();
    private void AppPresenter(){
        System.out.println("Calculator = calc");
        System.out.println("8-Ball = 8ball");
        System.out.println("Notepad = note");
        System.out.println("Passy = " + passy.CallName);
    }
    public void AppLauncher() throws IOException{
        AppPresenter();
        input = core.LaireScanner.nextLine();
        if(input.equals("calc")){
            calc.LCalcApp();
        }
        else if(input.equals("8ball")){
            eb.EightBallApp();
        }
        else if(input.equals("note")){
            note.NotepadApp();
        }
        else if(input.equals(passy.CallName)){
            passy.PassyApp();
        }
        else{System.out.println("No application found using that given name.");}
        System.out.println("Closing AppManager Interface. Relaunch it via terminal.");
    }
    
    
}