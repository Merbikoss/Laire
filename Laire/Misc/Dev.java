package Laire.Misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Dev {
    private String input;
    public void App() throws IOException{
        System.out.println("[]000###==> Welcome to Laire Developer Tools <==###000[]\n");
        System.out.println("1) Generate Keys");
        System.out.println("2) Wipe LaireDirectory (Might break your Laire session or Laire itself)");
        System.out.println("3) Deactivate Key");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        switch (input) {
            case "1":
            System.out.println("Laire Developer Tool - Developer's Activation Key Generator");
            ActivationKey ak = new ActivationKey();
            ak.Generate();
            System.out.println(ak.KeyGen.get(0)+"-"+ak.KeyGen.get(1)+"-"+ak.KeyGen.get(2));
            System.out.println("Done.");
            break;
            case "2":
            Path p = Paths.get("LaireDirectory");
            Object[] a = Files.list(p).toArray();
            for(Object aa : a){
                Path path = Paths.get(aa.toString());
                Files.delete(path);
            }
            Files.delete(p);
            System.out.println("Done.");
            case "3":
            Config conf = new Config();
            conf.writeTo(1, "LaireDirectory/key.cono", "ACTIVE=FALSE");
            break;
        }
    }
}