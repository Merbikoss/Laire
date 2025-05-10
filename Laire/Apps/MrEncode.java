package Laire.Apps;
import java.util.Scanner;
import Laire.Core;
public class MrEncode {
    private Scanner scan = new Scanner(System.in);
    private String input;
    private String input2;
    private void Encode(String a){
        char[] DividedPassword = a.toCharArray();
            System.out.print("This is your text - ");
            for (char c : DividedPassword) {
                c += 5;
                System.out.print(c);
            }
            System.out.println("\nEncrypted your text!");
    }
    private void Decode(String a){
        char[] DividedPassword = a.toCharArray();
        System.out.print("This is your text - ");
            for (char c : DividedPassword) {
                c -= 5;
                System.out.print(c);
            }
            System.out.println("\nDecoded your encrypted text!");
    }
    public void MrEncodeApp(){
        Core core = new Core();
        System.out.println("Enter the text.");
        input = scan.nextLine();
        System.out.println("E for Encoding, D for Decoding the text.");
        input2 = scan.nextLine();
        if(input2.equals("E")){
            Encode(input);
        }
        else if(input2.equals("D")){
            Decode(input);
        }
        else{
            System.out.println("Unrecognized, launch again. " + core.ProgramDone);
        }
        System.out.println(core.ProgramDone);
    }
}
