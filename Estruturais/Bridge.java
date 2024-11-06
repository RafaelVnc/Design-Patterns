package Estruturais;

// Interface do dispositivo
interface Dispositivo {
    void ligar();
    void desligar();
}

// Implementação do dispositivo TV
class TV implements Dispositivo {
    public void ligar() {
        System.out.println("TV ligada");
    }

    public void desligar() {
        System.out.println("TV desligada");
    }
}

// Controle remoto que usa qualquer dispositivo que implemente a interface Dispositivo
class ControleRemoto {
    private Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligar() {
        dispositivo.ligar();
    }

    public void desligar() {
        dispositivo.desligar();
    }
}

public class Bridge {
    public static void main(String[] args) {
        Dispositivo tv = new TV();
        ControleRemoto controle = new ControleRemoto(tv);
        controle.ligar();  // TV ligada
        controle.desligar();  // TV desligada
    }
}

