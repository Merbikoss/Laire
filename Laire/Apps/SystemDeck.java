package Laire.Apps;

import java.io.IOException;
import java.util.Scanner;

import Laire.Core;

public class SystemDeck{
    private String NewPassword;
    private void setNewPassword() throws IOException {
        Laire.Misc.Config conf = new Laire.Misc.Config();
        Core core = new Core();
        NewPassword = core.LaireScanner.nextLine();
        conf.writeTo(1, conf.MasterFile, "PWD="+NewPassword);
    }
    public void Deck() throws IOException {
        Laire.Misc.Config conf = new Laire.Misc.Config();
        Core core = new Core();
        String PasswordRecover = conf.readConf(1);
        // DEV'S NOTE : You don't need to know about this, go figure it out.
        boolean a;
        System.out.println("-----   Welcome to System Deck! Here, you rule this Laire Session.  -----");
        System.out.println("\nYou have 2 choices.\n1 - Change your Password\n2 - Reset your Laire Session.\n3 - Change Username");
        System.out.println("Enter 1 for the first, enter 2 for second and enter 3 for third.");
        System.out.println("Warning: Please be careful, high power comes with high responsibility.\n---------------------------------------------\n");
        int NumberGetter = core.LaireScanner.nextInt();
        if (NumberGetter==1) {
            System.out.println("Enter the password please :");
            setNewPassword();
            System.out.println("Settings are being applied...");
            a = true;
        } else if (NumberGetter==2) {
            conf.writeTo(3, conf.MasterFile, "SETUP=FALSE");
            a = true;
        } else if(NumberGetter==3){
            System.out.println("Enter the new username that you would like.");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            conf.writeTo(2, conf.MasterFile, "USRN="+input);
            a = true;
        } else{
            System.out.println("Uh, that is not an option? Please open the program again");
            a = false;
        }
        if(a == true){
            System.out.println("The changes are applied. You can quit this session and reboot your session.");
        } else{
            System.out.println("No changes were applied, probably program have failed.");
        }
    }
}
