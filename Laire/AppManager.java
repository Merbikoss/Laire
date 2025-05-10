package Laire;

import java.io.IOException;

import Laire.Apps.Clock;
import Laire.Apps.Credits;
import Laire.Apps.EightBall;
import Laire.Apps.GoldenApp;
import Laire.Apps.LMoney;
import Laire.Apps.MrEncode;
import Laire.Apps.Notepad;
import Laire.Apps.Passy;
import Laire.Apps.Quoted;
import Laire.Apps.RandomCurseGenerator;
import Laire.Apps.SystemDeck;
import Laire.LOffice.Formy;
import Laire.LOffice.Presentode;

// Used as app creation method class at Stage 2 of Experiment Series 1 Stage 2
public class AppManager {
    private String input;
    Main mn = new Main();
    Credits cred = new Credits();
    Quoted quo = new Quoted();
    MrEncode enc = new MrEncode();
    LCalc calc = new LCalc();
    Core core = new Core();
    EightBall eb = new EightBall();
    Notepad note = new Notepad();
    Passy passy = new Passy();
    SystemDeck sd = new SystemDeck();
    LMoney lm = new LMoney();
    Presentode prs = new Presentode();
    GoldenApp gapp = new GoldenApp();
    Formy form = new Formy();
    RandomCurseGenerator rcg = new RandomCurseGenerator();
    
    private void AppPresenter(){
        System.out.println("------- Select Application ------");
        System.out.println("|  Calculator = calc            |");
        System.out.println("|  8-Ball = 8ball               |");
        System.out.println("|  Notepad = note               |");
        System.out.println("|  Passy = passy                |");
        System.out.println("|  MrEncode = enc               |");
        System.out.println("|  Quoted = quo                 |");
        System.out.println("|  Credits = cred               |");
        System.out.println("|  SystemDeck = sd              |");
        System.out.println("|  LMoney = lm                  |");
        System.out.println("|  LOffice Presentode = prs     |");
        System.out.println("|  LOffice Formy = form         |");
        System.out.println("|  Random Curse Generator = rcg |");
        System.out.println("|  Clock = cl                   |");
        System.out.println("|  Boredom = brd                |");
        System.out.println("---------------------------------");
        if(core.GoldenVersion==true){
            System.out.println("#         Golden App            #");
            System.out.println("| Golden App = gapp             |");
            System.out.println("#-------------------------------#");
        }
    }
    public void AppLauncher() throws IOException{
        AppPresenter();
        input = core.LaireScanner.nextLine();
        mn.clearTerm();
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
        else if(input.equals("enc")){
            enc.MrEncodeApp();
            
        }
        else if(input.equals("quo")){
            quo.QuotedApp();
        }
        else if (input.equals("cred")) {
            cred.CreditsApp();
        }
        else if(input.equals("sd")){
            sd.Deck();
        }
        else if (input.equals("lm")) {
            lm.ControlPanel();
        }
        else if(input.equals("prs")){
            prs.PresentodeApp();
        }
        else if(input.equals("gapp")){
            gapp.GoldenVoid();
        }
        else if (input.equals("rcg")){
            rcg.App();
        }
        else if(input.equals("form")){
            form.App();
        }
        else if(input.equals("cl")){
            Clock clock = new Clock();
            clock.App();
        }
        else if (input.equals("brd")) {
            Laire.Apps.Boredom.App();
        }
        // Inefficient code. Could be replaced with a better one.
        // One liners are not the best. Not because they are annoying, it's because
        // my code line number DECREASES. 
        else{
            System.out.println("No application found using that given name.");
        }
        System.out.println("Closing AppManager Interface. Relaunch it via terminal.");
    }
    
    
}