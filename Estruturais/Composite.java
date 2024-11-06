package Estruturais;

import java.util.ArrayList;
import java.util.List;

// Componente
interface Componente {
    void operar();
}

// Folha
class Folha implements Componente {
    public void operar() {
        System.out.println("Folha operando");
    }
}

// Galho
class Galho implements Componente {
    private List<Componente> componentes = new ArrayList<>();

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    public void operar() {
        System.out.println("Galho operando");
        for (Componente componente : componentes) {
            componente.operar();
        }
    }
}

public class Composite {
    public static void main(String[] args) {
        Galho galho1 = new Galho();
        Folha folha1 = new Folha();
        galho1.adicionar(folha1);

        Galho galho2 = new Galho();
        Folha folha2 = new Folha();
        galho2.adicionar(folha2);

        Galho galhoPrincipal = new Galho();
        galhoPrincipal.adicionar(galho1);
        galhoPrincipal.adicionar(galho2);

        galhoPrincipal.operar();  // Galho operando, Folha operando (para cada folha)
    }
}

