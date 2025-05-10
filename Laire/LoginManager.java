package Laire;
import java.io.IOException;
import Laire.Terminal.Terminal;
import Laire.Misc.Config;
import Laire.Misc.Setup;
public class LoginManager {
    public LoginManager() throws IOException{
        // A core for Laire to work. Do not remove the code.
    }
    Config pwd = new Config();
    Terminal term = new Terminal();
    Core core = new Core();
    Setup st = new Setup();
    private String A;
    public String Password = pwd.PasswordHandler();
    private int a;
    public void Login() throws IOException{
        a = 3;
        try {
            System.out.println("\n\n\n=======================================================");
            System.out.println("|               Welcome "+ st.getUsername() + "!");
            System.out.println("o------------------------------------------------------o");
            System.out.println("|                                                      |");
            System.out.println("|Enter the password please. Or enter quit for quitting.|");
            System.out.println("|                                                      |");
            System.out.println("o------------------------------------------------------o");
            A = core.LaireScanner.nextLine();
            while(a > 0){
            if(A.equals(Password)){
                Main mn = new Main();
                mn.clearTerm();
                term.TerminalApp();
                a = 0;
                break;
            }
            else if(A.equalsIgnoreCase("quit")){
                System.out.println("Goodbye! See you later!");
                break;
            }
            else if(!A.equals(Password)){
                if(A.equals("quit")){
                    // Originally put for debugging purposes, now useless.
                    System.out.println("Yeah mate.");
                }
                else{
                    // Limiting force logins.
                    --a;
                    System.out.println("Try again.");
                    A = core.LaireScanner.nextLine();
                }
            }
            if(a < 1){
                // The text could be removed, but the break code mustn't.
                System.out.println("Login Manager closing because of multiple incorrect attempts.");
                break;
            }
        }
    }
        
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
        System.out.println("    LAIRE ERROR - 1     ");
        System.out.println("    conf.cono file may be corrupted. Please reset your session   ");
    }
    }
}
                                                       