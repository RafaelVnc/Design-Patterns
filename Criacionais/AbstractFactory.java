package Criacionais;

// Definindo a interface para um sofá
interface Sofa {
    String getTipo();
}

// Definindo a interface para uma mesa
interface Mesa {
    String getTipo();
}

// Implementação concreta de um sofá moderno
class SofaModerno implements Sofa {
    public String getTipo() {
        return "Sofá Moderno";
    }
}

// Implementação concreta de uma mesa moderna
class MesaModerna implements Mesa {
    public String getTipo() {
        return "Mesa Moderna";
    }
}

// Implementação concreta de um sofá clássico
class SofaClassico implements Sofa {
    public String getTipo() {
        return "Sofá Clássico";
    }
}

// Implementação concreta de uma mesa clássica
class MesaClassica implements Mesa {
    public String getTipo() {
        return "Mesa Clássica";
    }
}

// Fábrica que cria móveis no estilo moderno
interface FabricaDeMoveis {
    Sofa criarSofa();
    Mesa criarMesa();
}

// Fábrica moderna
class FabricaModerna implements FabricaDeMoveis {
    public Sofa criarSofa() {
        return new SofaModerno();
    }

    public Mesa criarMesa() {
        return new MesaModerna();
    }
}

// Fábrica clássica
class FabricaClassica implements FabricaDeMoveis {
    public Sofa criarSofa() {
        return new SofaClassico();
    }

    public Mesa criarMesa() {
        return new MesaClassica();
    }
}

// Usando a fábrica moderna para criar móveis
public class AbstractFactory {
    public static void main(String[] args) {
        FabricaDeMoveis fabrica = new FabricaModerna();
        Sofa sofa = fabrica.criarSofa();
        Mesa mesa = fabrica.criarMesa();
        
        System.out.println(sofa.getTipo());  // "Sofá Moderno"
        System.out.println(mesa.getTipo());  // "Mesa Moderna"
    }
}
