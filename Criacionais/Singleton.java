package Criacionais;

public class Singleton {
    private static Singleton instance = null; // Armazena a única instância da classe

    private Singleton() {
        // Construtor privado impede a criação de instâncias fora da classe
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Cria a instância se for a primeira vez
        }
        return instance; // Retorna a instância única
    }

    public void showMessage() {
        System.out.println("Singleton Pattern Example");
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        singleton1.showMessage();
        System.out.println(singleton1 == singleton2); // True, ambas são a mesma instância
    }
}
