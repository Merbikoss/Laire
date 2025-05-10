package Laire.Misc.Novemma;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scan =  new Scanner(System.in);
    public static String[] parse(String input) throws IOException {
        String[] KeyVal = input.split("=");
        String Key;
        String Value;
        KeyVal kv = new KeyVal();
        kv.setKeyVal(KeyVal[0], KeyVal[1]);
        String a = kv.getKey();
        String b = kv.getValue();
        String[] returned = {a, b};
        
        return returned;
    }
}
