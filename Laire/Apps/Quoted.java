package Laire.Apps;

import java.util.Random;

public class Quoted {
    private String a1 = "A room without books is like a body without a soul.";
    private String a2 = "You know you're in love when you can't fall asleep because reality is finally better than your dreams.";
    private String a3 = "You only live once, but if you do it right, once is enough.";
    private String a4 = "Be the change that you wish to see in the world";
    private String a5 = "In three words I can sum up everything I've learned about life: it goes on.";
    private String a6 = "If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.";
    private String a7 = "If you tell the truth, you don't have to remember anything.";
    private String a8 = "Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.";
    private String a9 = "A computer computes. But if you don't know how to make it compute, then you cannot hide your stupidity.";
    private String a10 = "Attitude is a choice. Happiness is a choice. Optimism is a choice. Kindness is a choice. Giving is a choice. Respect is a choice. Whatever choice you make makes you. Choose wisely";
    private String a11 = "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.";
    private String a12 = "A day without sunshine is like, you know, night.";

    private Random random = new Random();
    public void QuotedString(){
        int a = random.nextInt(13);
        if(a == 1){
            System.out.println(a1);
        } else if(a == 2){
            System.out.println(a2);
        } else if(a == 3){
            System.out.println(a3);
        }else if(a == 4){
            System.out.println(a4);
        }else if(a == 5){
            System.out.println(a5);
        }else if(a == 6){
            System.out.println(a6);
        }else if(a == 7){
            System.out.println(a7);
        }else if(a == 8){
            System.out.println(a8);
        }else if(a == 9){
            System.out.println(a9);
        }else if(a == 10){
            System.out.println(a10);
        }else if(a == 11){
            System.out.println(a11);
        }else if(a == 12){
            System.out.println(a12);
        }
    }

    public void QuotedApp() {
        System.out.println("A random quote appears!");
        QuotedString();        
    }
}
