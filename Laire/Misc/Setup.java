/*
    The Laire Project - 2025
    This piece of code belongs to The Laire Project.
    (Original programmer: Mertbikoss - Mert Coşkun)
*/

package Laire.Misc;

import java.io.IOException;
import Laire.Core;
import Laire.Misc.Novemma.Main;

public class Setup {
    private String Writed;
    private String LocalUsrn;
    private String LocalPwd;
    Core core = new Core();
    Laire.Main mnn = new Laire.Main();
    // Novemma is a lifesaver!
    Laire.Misc.Novemma.Main mn = new Main();
    Config conf = new Config();
    public void CheckSetup() throws IOException{
        String SecondLine = conf.readConf(3);
        String[] SLArray = mn.parse(SecondLine);
        if(SLArray[1].equals("FALSE")){
            SetupProccess();
        }
    }
    public void SetupProccess() throws IOException{
        mnn.clearTerm();
        System.out.println("O------ Laire Installer ------O\n");
        System.out.println("Welcome to Laire! The Installer will prepare your");
        System.out.println("Laire session automatically. Now let's do this.\nEnter the password you would like to use.");
        LocalPwd = core.LaireScanner.nextLine();
        mnn.clearTerm();
        System.out.println("Excellent! Now enter your new username.");
        LocalUsrn = core.LaireScanner.nextLine();
        conf.writeTo(1, conf.MasterFile, "PWD="+LocalPwd);
        conf.writeTo(2, conf.MasterFile, "USRN="+LocalUsrn);
        conf.writeTo(3, conf.MasterFile, "SETUP=TRUE");
    }
    public String getPassword() throws IOException{
        Config conf = new Config();
        String a = conf.readConf(1);
        String[] b = mn.parse(a);
        return b[1];
    }
    public String getUsername() throws IOException{
        Config conf = new Config();
        String a = conf.readConf(2);
        String[] b = mn.parse(a);
        return b[1];
    }
    public Setup() throws IOException{
    }
}
