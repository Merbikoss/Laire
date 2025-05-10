package Laire.Apps;

import java.time.LocalDate;
import java.time.LocalTime;

public class Clock {
    public void App(){
        System.out.println("O##--------------------------------------##O");
        System.out.println("           --<# LAIRE CLOCK #>--\n");
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        System.out.println("     Current Local Date : "+ld);
        System.out.println("\n   - - - - - - - - - - - - - - - - - - - -");
        System.out.println("     Current Local Time : "+lt);
        System.out.println("\nO##--------------------------------------##O");
    }
}