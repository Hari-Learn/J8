package com.j8.interfacePac;

@FunctionalInterface
public interface Browser {
    void browse();
    default void playMedia(){
        System.out.println("By Default - Media player added");
    };
}
