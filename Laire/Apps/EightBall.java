package Laire.Apps;

import Laire.Core;

public class EightBall {
    private int RandomAnswer;
    Core core = new Core();
    public void EightBallApp(){
        System.out.println("Ask a question, and open this app! (Answers are truly random not really pseudorandom but you get it!)");
        RandomAnswer = core.LaireRandom.nextInt(10);
        if(RandomAnswer == 1){
            System.out.println("Yes.");
        }
        else if(RandomAnswer == 2){
            System.out.println("No.");
        }
        else if(RandomAnswer == 3){
            System.out.println("Maybe.");
        }
        else if(RandomAnswer == 4){
            System.out.println("Laziness destroys.");
        }
        else if(RandomAnswer == 5){
            System.out.println("Not my day today.");
        }
        else if(RandomAnswer == 6){
            System.out.println("You are lucky.");
        }
        else if(RandomAnswer == 7){
            System.out.println("Only in your dreams, maybe...");
        }
        else if(RandomAnswer == 8){
            System.out.println("Hmm... It depends.");
        }
        else{
            System.out.println("I'm not feeling lucky right now.");
        }
        // Sorry, beginner code. Just direct coding.
    }
}
