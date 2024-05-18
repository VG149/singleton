/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public final class Singleton {
    private static Singleton instance; // Instancia uma unica classe
    public String value; // Dados 

    private Singleton(String value) {
        // Emulação de inicialização lenta
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value; // Inicialização dos dados
    }

    // Metodo para obter a instancia única
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value); // Criação da instancia caso não exista
        }
        return instance; // Retorna a instancia unica
    }
}