package Laire.Apps;

import Laire.Core;

public class Passy {
    Core core = new Core();
    public String CallName = "passy";
    private int a;
    private String input;
    private void PasswordGen(){
        System.out.println("Only numbers supported for the sake of simplicity");
        // And to reduce the development time of Stage 5 Laire.
        // And maybe because I'm just too noob for that.
        a = core.LaireRandom.nextInt(99999);
        System.out.println(a);
        System.out.println(core.ProgramDone);
    }
    public void PassyApp(){
        System.out.println("Do you want to generate a password? Y for Yes, N for no.");
        input = core.LaireScanner.nextLine();
        if(input.equals("Y")){
            PasswordGen();
        }
        else{
            System.out.println(core.ProgramDone);
        }
    }
}
