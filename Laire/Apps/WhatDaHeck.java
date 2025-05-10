package Laire.Apps;

import Laire.Core;
import Laire.Main;

public class WhatDaHeck {
    private String version = "1.3";
    public String CallName = "laida";
    public void WhatDaHeckApp(){
        Core core = new Core();
        System.out.println("------------------------------------"+"\n"+"        --- LAIDA 1.2 ---"+"\n");
        System.out.println(core.LaireVersion);
        System.out.println("Laida Version " + version);
        System.out.println("Keys (LKAS) Enabled: "+Main.keysEnabled);
    }
}
