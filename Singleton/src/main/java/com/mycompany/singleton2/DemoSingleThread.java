/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO"); // Obtem a instancia com valor "Foo"
        Singleton anotherSingleton = Singleton.getInstance("BAR"); // Obtem a instancia com valor "BAR"
        System.out.println(singleton.value); // Imprime o valor singleton
        System.out.println(anotherSingleton.value); // Imprime o valor anotherSingleton
    }
}
