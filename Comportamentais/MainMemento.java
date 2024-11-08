package Comportamentais;

class Memento {
    private final String state;  // Armazena o estado do objeto no memento

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;  // Retorna o estado armazenado no memento
    }
}

class Originator {
    private String state;  // Estado atual do objeto

    public void setState(String state) {
        System.out.println("Estado definido para: " + state);
        this.state = state;  // Define o estado do objeto
    }

    public Memento saveStateToMemento() {
        return new Memento(state);  // Cria um memento para salvar o estado atual
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();  // Restaura o estado a partir do memento
        System.out.println("Estado restaurado para: " + state);
    }
}

// Uso do padrão Memento
public class MainMemento {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("Estado1");  // Define um estado
        Memento memento = originator.saveStateToMemento();  // Salva o estado atual no memento
        originator.setState("Estado2");  // Altera o estado

        originator.getStateFromMemento(memento);  // Restaura o estado anterior a partir do memento
    }
}

