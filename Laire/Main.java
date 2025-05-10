package Laire;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.time.Clock;
import java.util.Scanner;

import Laire.Misc.ActivationKey;
import Laire.Misc.Config;
import Laire.Misc.Setup;

public class Main {
    public static boolean keysEnabled = true;
    public static boolean keyActive = false;
    public static void Activate() throws IOException {
        Scanner scan = new Scanner(System.in);
        Config conf = new Config();
        ActivationKey ak = new ActivationKey();
        if(conf.readFile(1, "LaireDirectory/key.cono").equals("ACTIVE=FALSE")){
            // LKAS code
            System.out.println("Welcome to this Laire Session. This Laire session, enabled key system.");
            System.out.println("Please activate your keys.");
            System.out.println("The Laire Key Activation Service (LKAS) will open.");
            System.out.println("Enter the first chunk of your key.");
            String p1 = scan.nextLine();
            System.out.println("Enter the second chunk of your key.");
            String p2 = scan.nextLine();
            System.out.println("Enter the third chunk of your key.");
            String p3 = scan.nextLine();
            boolean pass = ak.Check(p1, p2, p3);
            if (pass==true) {
                System.out.println("Key activated, you may now start using the program.");
                conf.writeOneString("LaireDirectory/key.cono", "ACTIVE=TRUE");
                keyActive=true;
            } else if(pass==false){
                keyActive=false;
                System.out.println("The key is invalid. Please enter a valid key.");
            }
        } else if (conf.readFile(1, "LaireDirectory/key.cono").equals("ACTIVE=TRUE")) { keyActive=true; }
    }
    public static void clearTerm(){
        System.out.print("\033[H");
        System.out.print("\033[2J");
    }
    private static void CheckFiles() throws IOException{
        Config conf = new Config();
        String confStr = "LaireDirectory/conf.cono";
        String keyStr = "LaireDirectory/key.cono";
        Path confP = Paths.get(confStr);
        Path keyP = Paths.get(keyStr);
        Path dirP = Paths.get("LaireDirectory");
        Path lmP = Paths.get("LaireDirectory/lmoney.cono");
        if(Files.notExists(dirP)){
            Files.createDirectory(dirP);
        }
        if(Files.notExists(keyP)){
            Files.createFile(keyP);
            conf.writeOneString(keyStr, "ACTIVE=FALSE");
        }
        if(Files.notExists(confP)){
            Files.createFile(confP);
            conf.writeOneString(confStr, "PWD=mert\nUSRN=Error\nSETUP=FALSE");
        }
        if(Files.notExists(lmP)){
            Files.createFile(lmP);
            conf.writeOneString("LaireDirectory/lmoney.cono", "hello\n0\nFALSE");
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("This is a clear trap. If you can read this, and this message doesn't disappear,");
        System.out.println("something is wrong with your Laire. Try launching again. If still this problem");
        System.out.println("isn't resolved, please install a new copy of Laire.");
        if(keysEnabled==true){
            clearTerm();
            CheckFiles();
            Activate();
        }
        if(keysEnabled==true && keyActive==true){
            clearTerm();
            CheckFiles();
            Setup st = new Setup();
            st.CheckSetup();
            clearTerm();
            LoginManager lm = new LoginManager();
            Core core = new Core();
            System.out.println("Welcome to Laire " + core.LaireVersion + ". Developed by Mertbikoss, and is free software under GPL.");
            lm.Login();
            clearTerm();
        }
        else if (keysEnabled==false) {
            clearTerm();
            CheckFiles();
            Setup st = new Setup();
            st.CheckSetup();
            clearTerm();
            LoginManager lm = new LoginManager();
            Core core = new Core();
            System.out.println("Welcome to Laire " + core.LaireVersion + ". Developed by Mertbikoss, and is free software under GPL.");
            lm.Login();
            clearTerm();
        }
    }
}
