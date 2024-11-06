package Criacionais;

import java.util.ArrayList;
import java.util.List;

// Classe que representa o produto final, Hamburguer
class Hamburguer {
    private List<String> ingredientes = new ArrayList<>();

    public void addIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
}

// Builder para criar diferentes tipos de Hamburguer com componentes opcionais
class HamburguerBuilder {
    private Hamburguer burger = new Hamburguer();

    public HamburguerBuilder  addPao() {
        burger.addIngrediente("Pão");
        return this;
    }

    public HamburguerBuilder  addCarne() {
        burger.addIngrediente("Carne");
        return this;
    }

    public HamburguerBuilder  addQueijo() {
        burger.addIngrediente("Queijo");
        return this;
    }

    public HamburguerBuilder  addAlface() {
        burger.addIngrediente("Alface");
        return this;
    }

    public Hamburguer build() {
        return burger;
    }
}

// Usando o builder para construir um hambúrguer com diferentes ingredientes
public class Builder {
    public static void main(String[] args) {
        Hamburguer burger = new HamburguerBuilder ()
            .addPao()
            .addCarne()
            .addQueijo()
            .addAlface()
            .build();

        System.out.println(burger.getIngredientes()); // ['Pão', 'Carne', 'Queijo', 'Alface']
    }
}

