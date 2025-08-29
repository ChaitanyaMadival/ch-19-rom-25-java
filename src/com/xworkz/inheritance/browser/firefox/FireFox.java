package com.xworkz.inheritance.browser.firefox;

import com.xworkz.inheritance.browser.webbrowser.WebBrowser;

public class FireFox extends WebBrowser {

    public FireFox(){
        super();
        System.out.println("firefox constructor is invoked \n");
    }
    @Override
    public boolean toBrowse(){
        System.out.println("Browse Information about Ronald\n");
        return true;
    }
}
