package com.j8.interfacePac;

public class Chrome implements Browser {
    @Override
    public void browse() {
        System.out.println("Chrome Browser");
    }

    @Override
    public void playMedia() {
        Browser.super.playMedia();
        System.out.println("From Chrome override methods");
    }

    public static void main(String[] args) {
        Chrome chromeObj = new Chrome();
        chromeObj.playMedia();
    }
}
