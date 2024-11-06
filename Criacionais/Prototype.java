package Criacionais;

// Classe que representa o protótipo Carro
class Carro implements Cloneable {
    private String modelo;
    private int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método clone, permite copiar a instância de Carro
    @Override
    public Carro clone() throws CloneNotSupportedException {
        return (Carro) super.clone();
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}

// Testando o padrão Prototype
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Carro carro1 = new Carro("Sedan", 2020);
        Carro carro2 = carro1.clone(); // Clonando o carro
        
        System.out.println(carro1.getModelo() + " - " + carro2.getModelo()); // Ambos têm o mesmo modelo
    }
}

