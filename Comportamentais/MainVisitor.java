package Comportamentais;

// Interface Element que define o método accept para receber um visitante
interface Element {
    void accept(Visitor visitor);  // Método que permite que o visitante realize uma operação no elemento
}

// ConcreteElementA que implementa a operação accept
class ConcreteElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);  // Chama o método do visitante específico para o Elemento A
    }
}

// ConcreteElementB que implementa a operação accept
class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);  // Chama o método do visitante específico para o Elemento B
    }
}

// Interface Visitor com métodos para cada tipo de Elemento
interface Visitor {
    void visitConcreteElementA(ConcreteElementA element);  // Visita um ConcreteElementA
    void visitConcreteElementB(ConcreteElementB element);  // Visita um ConcreteElementB
}

// Visitante específico 1 que implementa os métodos de visitação
class ConcreteVisitor1 implements Visitor {
    public void visitConcreteElementA(ConcreteElementA element) {
        System.out.println("Visitor 1 visitou Elemento A");  // Operação realizada no Elemento A
    }

    public void visitConcreteElementB(ConcreteElementB element) {
        System.out.println("Visitor 1 visitou Elemento B");  // Operação realizada no Elemento B
    }
}

// Visitante específico 2 que implementa os métodos de visitação
class ConcreteVisitor2 implements Visitor {
    public void visitConcreteElementA(ConcreteElementA element) {
        System.out.println("Visitor 2 visitou Elemento A");  // Operação realizada no Elemento A
    }

    public void visitConcreteElementB(ConcreteElementB element) {
        System.out.println("Visitor 2 visitou Elemento B");  // Operação realizada no Elemento B
    }
}

// Uso do padrão Visitor
public class MainVisitor {
    public static void main(String[] args) {
        // Lista de elementos
        Element[] elements = {new ConcreteElementA(), new ConcreteElementB()};
        
        // Visitantes
        Visitor visitor1 = new ConcreteVisitor1();  // Criando visitante 1
        Visitor visitor2 = new ConcreteVisitor2();  // Criando visitante 2

        // Para cada elemento, ambos os visitantes são aplicados
        for (Element element : elements) {
            element.accept(visitor1);  // Visitor 1 visita os elementos
            element.accept(visitor2);  // Visitor 2 visita os mesmos elementos
        }
    }
}

