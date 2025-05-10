package Laire.Apps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

// Preparement for a special day, switch to a new era.

import Laire.Core;

public class Notepad {
    private String inputCommand;
    private String inputWrite;
    private String inputName;
    private String inputNameHelper;
    Core core = new Core();
    private void CreateAndWrite() throws IOException{
        // Create and write to a note.
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
        // Read a note.
        System.out.println("Enter the note name that you want to read.");
        inputName = core.LaireScanner.nextLine();
        inputNameHelper = "LaireDirectory/" + inputName + ".txt";
        System.out.println("Reading file : " + inputNameHelper);
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
    private void DeleteNote(){
        // Delete a note.
        System.out.println("Enter the note name that you want to delete.");
        inputName = core.LaireScanner.nextLine();
        inputNameHelper = "LaireDirectory/" + inputName + ".txt";
        File file = new File(inputNameHelper);
        file.delete();
    }
    private void Edit() throws IOException{
        // Read a note.
        System.out.println("Enter the note name that you want to edit.");
        inputName = core.LaireScanner.nextLine();
        inputNameHelper = "LaireDirectory/" + inputName + ".txt";
        System.out.println("Previous content of : " + inputNameHelper);
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
        System.out.println("Enter the new content.");
        inputWrite = core.LaireScanner.nextLine();
        try (FileWriter writer = new FileWriter(inputNameHelper)) {
            writer.write(inputWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void NotepadApp() throws IOException {
        System.out.println("Create, Open, Delete or Edit? C for create, O for open, D for delete, E for edit.");
        inputCommand = core.LaireScanner.nextLine();
        if(inputCommand.equalsIgnoreCase("C")){
            CreateAndWrite();
        }
        else if(inputCommand.equalsIgnoreCase("O")){
            Read();
        }
        else if(inputCommand.equalsIgnoreCase("D")){
            DeleteNote();
        }
        else if(inputCommand.equalsIgnoreCase("E")){
            Edit();
        }
        System.out.println(" " + core.ProgramDone);
    }
}
