package Laire.Apps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Preparement for a special day, switch to a new era.

import Laire.Core;

public class Notepad {
    private String inputCommand;
    private String inputWrite;
    private String inputName;
    private String inputNameHelper;
    Core core = new Core();
    private void CreateAndWrite() throws IOException{
        System.out.println("Enter the note name.");
        inputName = core.LaireScanner.nextLine();
        inputNameHelper = "LaireDirectory/" + inputName + ".txt";
        Path newFilePath = Paths.get(inputNameHelper);
        Files.createFile(newFilePath);
        System.out.println("Enter what you will write to it.");
        inputWrite = core.LaireScanner.nextLine();
        try (FileWriter writer = new FileWriter(inputNameHelper)) {
            writer.write(inputWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void Read() throws IOException{
        System.out.println("Enter the note name that you want to read.");
        inputName = core.LaireScanner.nextLine();
        inputNameHelper = "LaireDirectory/" + inputName + ".txt";
        int ch; 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader(inputNameHelper); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("No such file with that name."); 
        } 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
        fr.close();
    }
    public void NotepadApp() throws IOException {
        System.out.println("Create a note, or open a note? C for create, O for open.");
        inputCommand = core.LaireScanner.nextLine();
        if(inputCommand.equalsIgnoreCase("C")){
            CreateAndWrite();
        }
        else if(inputCommand.equalsIgnoreCase("O")){
            Read();
        }
        System.out.println(" " + core.ProgramDone);
    }
}
