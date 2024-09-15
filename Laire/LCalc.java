package Laire;

public class LCalc {
    Core core = new Core();
    private String version = "Alpha 1.0.1";
    private String input;
    int a;
    int b;
    private void AdditionOperation(){
        System.out.println("Input a number, program will add 2 to it.");
        int a = core.LaireScanner.nextInt();
        int b = 2;
        int resultAdd = a + b;
        System.out.println(resultAdd);
    }
    private void SubtractionOperation(){
        System.out.println("Input a number, program will subtract 2 from it.");
        int a = core.LaireScanner.nextInt();
        int b = 2;
        int resultSub = a - b;
        System.out.println(resultSub);
    }
    private void OperationNavigator(){
        input = core.LaireScanner.nextLine();
        if(input.equals("add")){
            AdditionOperation();
        } else if(input.equals("sub")){
            SubtractionOperation();
        } else{
            System.out.println("Invalid command, restart the program.");
        }
    }
    public void LCalcApp(){
        System.out.println("Welcome to Laire Calculator Version: " + version + ". Might contain limitations due to versions.");
        System.out.println("Meet Operation Navigator. Something like a terminal for the app. add for addition, sub for subtraction.");
        OperationNavigator();
        System.out.println(core.ProgramDone);
    }
}

