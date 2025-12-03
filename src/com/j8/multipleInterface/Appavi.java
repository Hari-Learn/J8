package com.j8.multipleInterface;

public class Appavi implements Ithagapar,IEx {
    //Here is diamond problem, compiler confused abt which one to take for implementation.
    // So we have to overide the joinCollege method otherwise use super keyword
    public void joinCollege(){
        Ithagapar.super.joinCollege();
        IEx.super.joinCollege();
        System.out.println("I will take my own desicion..");
    }
    public static void main(String[] args) {
        System.out.println("Gotcha");
        Ithagapar obj = new Appavi();
        obj.joinCollege();
    }
}
