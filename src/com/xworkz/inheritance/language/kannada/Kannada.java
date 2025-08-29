package com.xworkz.inheritance.language.kannada;

import com.xworkz.inheritance.language.language.Language;

public class Kannada extends Language {
    public Kannada() {
        super();
        System.out.println("kannada const is invoked\n");
    }

    @Override
    public boolean toSpeak(){
        System.out.println("Mother Tongue of Kannadigas\n");
        return true;
    }
}
