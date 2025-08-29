package com.xworkz.inheritance.browser.webbrowser;

import com.xworkz.inheritance.InheritanceRunner;

public class WebBrowser extends InheritanceRunner {

    public WebBrowser(){
        super();
        System.out.println("web browser const is invoked");
    }

    public boolean toBrowse(){
        System.out.println("Browse Information");
        return true;
    }
}
