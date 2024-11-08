package Comportamentais;

abstract class AbstractClass {
    // Método template que define o esqueleto do algoritmo
    public final void templateMethod() {
        stepOne();
        stepTwo();
        hook();  // Gancho opcional para subclasses
    }

    public void stepOne() {
        // Passo fixo para todas as subclasses
        System.out.println("Passo 1: fixo");
    }

    public abstract void stepTwo();  // Passo a ser implementado pelas subclasses

    public void hook() {
        // Gancho opcional que pode ser sobrescrito
    }
}

class ConcreteClassA extends AbstractClass {
    // Implementação do passo 2
    public void stepTwo() {
        System.out.println("Passo 2: implementado pela Classe A");
    }
}

class ConcreteClassB extends AbstractClass {
    // Implementação do passo 2 e do gancho
    public void stepTwo() {
        System.out.println("Passo 2: implementado pela Classe B");
    }

    public void hook() {
        System.out.println("Gancho implementado pela Classe B");
    }
}

// Uso do Template Method
public class TemplateMethod {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        AbstractClass b = new ConcreteClassB();

        a.templateMethod();
        // Saída: Passo 1: fixo
        // Passo 2: implementado pela Classe A

        b.templateMethod();
        // Saída: Passo 1: fixo
        // Passo 2: implementado pela Classe B
        // Gancho implementado pela Classe B
    }
}

