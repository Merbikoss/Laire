package Laire.LOffice;

import java.util.ArrayList;
import java.util.Scanner;
import Laire.Main;

public class Presentode {
    Main mn = new Main();
    boolean Check = false;
    ArrayList<PresentationPage> pages = new ArrayList<>();
    private int PageAmount;
    Scanner LaireScanner = new Scanner(System.in);
    private void EditMode(){
        boolean Safety = true;
        Check = true;
        System.out.println("Please enter the amount of pages you will use in your presentation.");
        PageAmount = LaireScanner.nextInt();
        LaireScanner.nextLine();
        if(PageAmount>=500){
            Safety = false;
        }
        if(Safety == false){
            System.out.println("WARNING: Presentation might cause some issues on old hardware. Close the program to save some RAM.");
        }
        for (int i = 0; i<PageAmount; i++) {
            mn.clearTerm();
            int j = i+1;
            System.out.println("Enter the content of this presentation's "+ j + "th page.");
            String GetContent = LaireScanner.nextLine();
            PresentationPage page = new PresentationPage();
            page.setContent(GetContent);
            pages.add(page);
        }
        mn.clearTerm();
        if(Safety == false){
            System.out.println("Your presentation is unsafe.");
        } else{
            System.out.println("Proccess ended. You can view the presentation.");
        }
        
    }
    private void ViewMode(){
        System.out.println("Press Enter to Continue.");
        for(int i = 0; i<PageAmount; i++){
            String GetCommand = LaireScanner.nextLine();
            int j = i+1;
            if(GetCommand.isEmpty()){
                mn.clearTerm();
                System.out.println(pages.get(i).getContent());
                System.out.println("Page : "+j);
            }
        }
        System.out.println("Done! You can quit now.");
    }
    public void PresentodeApp(){
        System.out.println("Welcome to LOffice Presentode!");
        System.out.println("Write EDIT to create a presentation or write VIEW to view the presentation, and QUIT to quit.");
        while (true) {
            String input = LaireScanner.nextLine();
            if (input.equals("EDIT")) {
                EditMode();
            }
            else if (input.equals("VIEW")) {
                if (Check == false) {
                    System.out.println("You didn't create a presentation. Loading without creating might cause some issues and even might crash Laire. Be careful!");
                } else{
                    ViewMode();
                }
            }
            else if (input.equals("QUIT")) {
                break;
            }
        }
    }
}
