package Laire;

import java.io.IOException;

import Laire.Apps.Notepad;
import Laire.Terminal.Terminal;

public class Main {
    static Terminal term = new Terminal();
    static AppManager appManager = new AppManager();
    static Notepad note = new Notepad();
    public static void main(String[] args) throws IOException {
        term.TerminalApp();
    }
}
