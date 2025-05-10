package Laire.LOffice;

import java.util.ArrayList;
import java.util.Scanner;

import Laire.Core;
import Laire.Main;

// Unstable Code, Please Do Not Publish or Use.

public class Formy {
    private ArrayList<String> TextAskArray = new ArrayList<>();
    private ArrayList<String> TextAnswerArray = new ArrayList<>();
    private ArrayList<String> MultiAsk = new ArrayList<>();
    private ArrayList<String> MultiChoices = new ArrayList<>();
    private ArrayList<String> MultiAnswer = new ArrayList<>();
    private int AmountInput;
    private String input;
    private String TextInput;
    private String TextAnswer;
    private Scanner scan = new Scanner(System.in);
    Core core = new Core();
    private void Help(){
        System.out.println("create to create a form");
        System.out.println("ask to ask the form");
        System.out.println("answer to get the answers of the form");
        System.out.println("help to show commands (this)");
        System.out.println("quit to quit");
    }
    private void GetInput(){
        // Uhh, isn't LOffice meant to be proprietary?
        System.out.println("What type of form do you want to create?");
        System.out.println("1 - Text Form | 2 - Multi-Choice Form ");
        input = core.LaireScanner.nextLine();
        if (input.equals("1")) {
            TextForm();
        }
        else if (input.equals("2")) {
            MultiForm();
        }
    }
    private void TextForm(){
        int LoopHelper = 0;
        System.out.println("Enter the total number of questions you will ask.");
        AmountInput = core.LaireScanner.nextInt();
        core.LaireScanner.nextLine();
        while (LoopHelper<AmountInput) {
            System.out.println("Enter the "+(LoopHelper+1)+"th question please.");
            TextInput = core.LaireScanner.nextLine();
            TextAskArray.add(TextInput);
            LoopHelper++;
        }
        Main.clearTerm();
    }
    private void MultiForm(){
        String b;
        System.out.println("Enter the total number of questions you will ask.");
        AmountInput = core.LaireScanner.nextInt();
        int a = 0;
        core.LaireScanner.nextLine();
        while (a<AmountInput) {
            System.out.println("Enter the "+(a+1)+"th question please.");
            TextInput = core.LaireScanner.nextLine();
            MultiAsk.add(TextInput);
            System.out.println("Enter the choices.");
            b = core.LaireScanner.nextLine();
            MultiChoices.add(b);
            a++;
            Main.clearTerm();
        }
    }
    private void Ask(){
        Main.clearTerm();
        if(input.equals("1")){
            int LoopHelper = 0;
            while (LoopHelper<AmountInput) {
                System.out.println(TextAskArray.get(LoopHelper));
                System.out.print("> ");
                TextAnswer = core.LaireScanner.nextLine();
                TextAnswerArray.add(TextAnswer);
                LoopHelper++;
                Main.clearTerm();
            }
        }
        else if(input.equals("2")){
            String answer;
            int LoopHelper = 0;
            while (LoopHelper<AmountInput) {
                System.out.println(MultiAsk.get(LoopHelper));
                System.out.println("\n"+"Here are the choices:");
                System.out.println(MultiChoices.get(LoopHelper)+"\n");
                System.out.print("> ");
                answer = core.LaireScanner.nextLine();
                MultiAnswer.add(answer);
                LoopHelper++;
                Main.clearTerm();
            }
        }
    }
    private void Answers(){
        if(input.equals("1")){
            int LoopHelper = 0;
            while(LoopHelper<AmountInput){
                System.out.println("--------------------------\n"+(LoopHelper+1)+"th Question Answer\n");
                System.out.println(TextAnswerArray.get(LoopHelper));
                System.out.println("\nPress enter to continue");
                core.LaireScanner.nextLine();
                LoopHelper++;
                Main.clearTerm();
            }
        }
    }
    public void App(){
        Main mn = new Main();
        System.out.println("Welcome to LOffice Formy.");
        System.out.println("\n"+"Write help to get a commands list.");
        while (true) {
            String a = scan.nextLine();
            switch (a) {
                case "create": mn.clearTerm(); GetInput(); break;
                case "ask": mn.clearTerm(); Ask(); System.out.println("Questions are asked, you can get the answers now."); break;
                case "help": mn.clearTerm(); Help(); break;
                case "answer": mn.clearTerm(); Answers(); break;
                default: System.out.println("Unrecognized command."); break;
            }
            if(a.equals("quit")){
                mn.clearTerm();
                break;
            }
        }
    }
}