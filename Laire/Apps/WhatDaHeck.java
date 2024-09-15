package Laire.Apps;

import Laire.Core;

public class WhatDaHeck {
    private String version = "1.0";
    public String CallName = "wdh";
    public void WhatDaHeckApp(){
        Core core = new Core();
        System.out.println(core.LaireVersion);
        System.out.println("WhatDaHeck Version " + version);
        System.out.println("If you are seeing this message, everything is okay with your Laire session.");
    }
}
