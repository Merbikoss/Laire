package Laire.Apps;

import java.util.Random;

public class RandomCurseGenerator {
    private String[] First = new String[10];
    private String[] Second = new String[10];
    // Storage variable
    private int One;
    private int Two;
    private void Init(){
        // Initializing
        First[0] = "Stupid";
        First[1] = "Ugly";
        First[2] = "Dumb";
        First[3] = "Underdeveloped";
        First[4] = "Brainless";
        First[5] = "Exposed";
        First[6] = "Mad";
        First[7] = "Loud";
        First[8] = "Lier";
        First[9] = "Assholeling";
        Second[0] = "Dog";
        Second[1] = "Fuckety";
        Second[2] = "Scammer";
        Second[3] = "Rat";
        Second[4] = "Commie";
        Second[5] = "Cappie";
        Second[6] = "Shitiful";
        Second[7] = "Toilet";
        Second[8] = "Grunk";
        Second[9] = "Golddiger";
    }
    public void App(){
        Init();
        System.out.println("Welcome to Random Curse (Cuss) Generator!");
        System.out.println("Your randomly generated curse is coming:");
        Random rand = new Random();
        One = rand.nextInt(10);
        Two = rand.nextInt(10);
        System.out.println(First[One]+" "+Second[Two]);
    }
}