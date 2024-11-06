package Estruturais;

// Classe Alvo: Define a interface específica do domínio
class Alvo {
    public String requisicao() {
        return "Alvo: O comportamento padrão do alvo.";
    }
}

// Classe Adaptado: Contém o comportamento útil, mas com uma interface incompatível
class Adaptado {
    public String requisicaoEspecifica() {
        return ".eetpadA eht fo roivaheb laicepS";
    }
}

// Classe Adaptador: Torna a interface do Adaptado compatível com a interface do Alvo
class Adaptador extends Alvo {
    private Adaptado adaptado;

    public Adaptador() {
        adaptado = new Adaptado();
    }

    @Override
    public String requisicao() {
        // Tradução do comportamento do Adaptado
        return "Adaptador: (TRADUZIDO) " + new StringBuilder(adaptado.requisicaoEspecifica()).reverse().toString();
    }
}

// Classe Cliente
public class Adapter {
    public static void codigoCliente(Alvo alvo) {
        // O código cliente suporta todas as classes que seguem a interface Alvo
        System.out.print(alvo.requisicao());
    }

    public static void main(String[] args) {
        // Cliente: Eu posso trabalhar bem com objetos do Alvo
        System.out.println("Cliente: Eu posso trabalhar bem com objetos do Alvo:");
        Alvo alvo = new Alvo();
        codigoCliente(alvo);
        System.out.println("\n");

        // Cliente: A classe Adaptado tem uma interface estranha
        Adaptado adaptado = new Adaptado();
        System.out.println("Cliente: A classe Adaptado tem uma interface estranha. "
                + "Veja, eu não entendo isso:");
        System.out.println("Adaptado: " + adaptado.requisicaoEspecifica() + "\n");

        // Cliente: Mas eu posso trabalhar com isso através do Adaptador
        System.out.println("Cliente: Mas eu posso trabalhar com isso através do Adaptador:");
        Adaptador adaptador = new Adaptador();
        codigoCliente(adaptador);
    }
}
