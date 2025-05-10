/*
    The Laire Project - 2025
    This piece of code belongs to The Laire Project.
    (Original programmer: Mertbikoss - Mert Coşkun)
*/

package Laire.Apps;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

import Laire.Core;
import Laire.Misc.Config;

public class LMoney{
    private String file = "LaireDirectory/lmoney.cono";
    private String input;
    private String ipt;
    private int balance;
    private boolean isAccountCreated;
    private String writed;
    Core core = new Core();
    private void CheckExist() throws IOException{
        Config conf = new Config();
        if (conf.readFile(3, file).equals("TRUE")) {
            isAccountCreated = true;
        } else if (conf.readFile(3, file).equals("FALSE")){
            isAccountCreated = false;
        }
    }

    private void CheckBalance() throws IOException{
        Config conf = new Config();
        balance = Integer.parseInt(conf.readFile(2, file));
    }

    private void CreateAccount() throws IOException{
        // Private strings for storing user input.
        Scanner lscan = new Scanner(System.in);
        Config conf = new Config();
        System.out.println("Let's create your account!");
        System.out.println("Enter your account name please.");
        ipt = lscan.nextLine();
        System.out.println("Working on, please wait...");
        System.out.println("Since you created your account, you are awarded 50 LCoins.");
        balance = balance + 50;
        isAccountCreated = true;
        writed = ipt+"\n"+balance;
        conf.writeOneString(file, writed+"\n"+"TRUE");
    }
    public void ControlPanel() throws IOException{
        Config conf = new Config();
        File filecheck = new File(file);
        CheckExist();
        CheckBalance();
        if(filecheck.exists()==false){
            filecheck.createNewFile();
            conf.writeOneString(file, ""+"\n"+"0"+"\n"+"FALSE");
        }
        System.out.println("Welcome to LMoney! Here you can do business!");
        System.out.println("bal for checking your balance.");
        System.out.println("cacc for creating an account.");
        if (isAccountCreated == false) {
            System.out.println("You currently do not have an account.");
        }
        System.out.println("quit for quitting.");
        while (true) {
            input = core.LaireScanner.nextLine();
            if (input.equals("bal")) {
                System.out.println(balance);
                if(balance == 0){
                    System.out.println("You don't have any money on your balance.");
                }
            }
            else if(input.equals("quit")){
                break;
            }
            else if (input.equals("cacc")) {
                CreateAccount();
            }
        }
    }
}
