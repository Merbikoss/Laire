package Laire;

import java.util.Scanner;

public class LCalc{
    Core core = new Core();
    private String version = "Alpha 1";
    private boolean isSecond;
    private String input1;
    private int input2;
    private int input3;
    private Scanner sc = new Scanner(System.in);
    private void Addition(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    private void Subtraction(int a, int b){
        int c = a-b;
        System.out.println(c);
    }
    private void Multiplication(int a, int b){
        int c = a*b;
        System.out.println(c);
    }
    private void Division(int a, int b){
        int c = a/b;
        System.out.println(c);
    }
    public void LCalcApp(){
        if (isSecond!=true) {
            isSecond=false;
        }
        System.out.println("Which operation? add for addition, sub for subtraction, mlt for multiplication and div for division.");
        if (isSecond==true) {
            sc.nextLine();
        }
        input1 = sc.nextLine();
        System.out.println("Enter the first number.");
        input2 = sc.nextInt();
        System.out.println("Enter the second number");
        input3 = sc.nextInt();
        if(input1.equals("add")){
            Addition(input2, input3);
        } else if(input1.equals("sub")){
            Subtraction(input2, input3);
        } else if(input1.equals("mlt")){
            Multiplication(input2, input3);
        } else if(input1.equals("div")){
            Division(input2, input3);
        }
        isSecond = true;
        System.out.println(core.ProgramDone);
    }

}

