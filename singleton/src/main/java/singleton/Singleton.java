/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Singleton {

    // Variável final para armazenar os dados associados à instância única
    private final String data;

    // Variável estática volátil para armazenar a única instância da classe Singleton
    private static volatile Singleton instance;

    // Construtor privado para evitar a criação de instâncias fora da classe
    private Singleton(String data) {
        this.data = data;
    }

    // Método estático para obter a instância única da classe Singleton
    public static Singleton getInstance(String data) {
        // Armazena temporariamente a instância em uma variável local
        Singleton result = instance;
        // Verifica se a instância já existe
        if (result == null) {
            // Bloco sincronizado para garantir que apenas um thread crie a instância
            synchronized (Singleton.class) {
                // Verifica novamente se a instância foi criada enquanto o thread estava esperando pelo bloqueio
                result = instance;
                if (result == null) {
                    // Se ainda não houver uma instância, cria uma nova e atribui à variável instance
                    instance = result = new Singleton(data);
                }
            }
        }
        // Retorna a instância única
        return result;
    }

    // Método para acessar os dados da instância Singleton
    public String getData() {
        return data;
    }
}