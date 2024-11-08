package Comportamentais;

interface State {
    void handle();  // Método abstrato para implementação dos estados concretos
}

class ConcreteStateA implements State {
    public void handle() {
        System.out.println("Estado A: Executando ação");  // Comportamento específico para o estado A
    }
}

class ConcreteStateB implements State {
    public void handle() {
        System.out.println("Estado B: Executando ação");  // Comportamento específico para o estado B
    }
}

class Context {
    private State state;  // Armazena o estado atual

    public Context(State state) {
        this.state = state;  // Inicializa o estado do contexto
    }

    public void setState(State state) {
        this.state = state;  // Altera o estado do contexto
    }

    public void request() {
        state.handle();  // Executa a ação baseada no estado atual
    }
}

// Uso do padrão State
public class MainState {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();  // Estado A: Executando ação

        context.setState(new ConcreteStateB());
        context.request();  // Estado B: Executando ação
    }
}

