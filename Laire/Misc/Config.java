/*
    The Laire Project - 2025
    This piece of code belongs to The Laire Project.
    (Original programmer: Mertbikoss - Mert Coşkun)
*/

package Laire.Misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Laire.Misc.Novemma.Main;

public class Config {
    // I mean the code is fine, isn't it?

    /*
     I have a project that is similar to JSON, but entirely for Java, called Cono.
     In method ParsePasswordCono, we read the config (cono) file where the password value is stored.
     */
    public static String MasterFile = "LaireDirectory/conf.cono";
    Laire.Misc.Novemma.Main mn = new Main();
    private static String ParseLine;
    private String[] Parse() throws IOException{
        String[] Parsed;
        try (BufferedReader br = new BufferedReader(new FileReader(MasterFile))) {
            ParseLine = br.readLine();
        } catch (IOException e) {
            System.out.println("Oh no! Error!");
        }
        Parsed = mn.parse(ParseLine);
        return Parsed;
    }
    public String PasswordHandler() throws IOException{
        String[] KEYVALS = Parse();
        String Password = KEYVALS[1];
        return Password;
    }
    public void createFile(String filename) throws IOException{
		Path p = Paths.get(filename);
		if(!Files.exists(p)) {
			Files.createFile(p);
		}
	}
	public String readFile(int line, String filename) throws IOException{
		Path path = Paths.get(filename);
		List<String> arrayList = new ArrayList<String>();
		arrayList = Files.readAllLines(path);
		return arrayList.get((line-1));
	}
    public String readConf(int line) throws IOException{
		return readFile(line, MasterFile);
	}
	public void writeTo(int line, String filename, String content) throws IOException{
		int lineoptimized = line - 1;
		Path path = Paths.get(filename);
		List<String> arrayList = new ArrayList<String>();
		arrayList = Files.readAllLines(path);
		int total = arrayList.size();
		if(lineoptimized == 0) {
			int a = 1;
			BufferedWriter bWriter = Files.newBufferedWriter(path);
			bWriter.write(content);
			bWriter.newLine();
			while(a > 0 && a < total) {
				bWriter.write(arrayList.get(a));
				bWriter.newLine();
				a++;
			}
			bWriter.close();
		}
		else if(lineoptimized > 0 && line < total) {
			int a = 0;
			int b = lineoptimized+1;
			BufferedWriter bWriter = Files.newBufferedWriter(path);
			while(a<(lineoptimized)) {
				bWriter.write(arrayList.get(a));
				bWriter.newLine();
				a++;
			}
			bWriter.write(content);
			bWriter.newLine();
			while(b<total-1) {
				bWriter.write(arrayList.get(b));
				bWriter.newLine();
				b++;
			}
			bWriter.write(arrayList.get(b));
			bWriter.close();
		}
		else if(lineoptimized==(total-1)) {
			int a = 0;
			BufferedWriter bWriter = Files.newBufferedWriter(path);
			while(a<(total-1)) {
				bWriter.write(arrayList.get(a));
				bWriter.newLine();
				a++;
			}
			bWriter.write(content);
			bWriter.close();
		}
		
	}
    public void writeConf(int line, String content) throws IOException{
        writeTo(line, MasterFile, content);
    }
	public static void writeOneString(String filename, String content) throws IOException {
		Path p = Paths.get(filename);
		BufferedWriter bWriter = Files.newBufferedWriter(p);
		bWriter.write(content);
		bWriter.close();
	}
    public Config() throws IOException {
        
    }
}
