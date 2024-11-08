package Comportamentais;

// Interface Mediator que define o método de notificação
interface Mediator {
    void notify(Object sender, String event);
}

// Implementação concreta do mediador
class ConcreteMediator implements Mediator {
    private Component1 component1;
    private Component2 component2;

    public ConcreteMediator(Component1 component1, Component2 component2) {
        this.component1 = component1;
        this.component2 = component2;
        // Define o mediador para ambos os componentes
        this.component1.setMediator(this);
        this.component2.setMediator(this);
    }

    public void notify(Object sender, String event) {
        // Reage ao evento e aciona as ações dos componentes
        if ("A".equals(event)) {
            System.out.println("Mediator reage ao evento A e dispara o evento B");
            component2.doB();
        } else if ("B".equals(event)) {
            System.out.println("Mediator reage ao evento B e dispara o evento A");
            component1.doA();
        }
    }
}

// Componente 1 que interage através do mediador
class Component1 {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;  // Define o mediador para o componente
    }

    public void doA() {
        System.out.println("Componente 1 executa A.");
        // Notifica o mediador sobre o evento A
        if (mediator != null) {
            mediator.notify(this, "A");
        }
    }
}

// Componente 2 que interage através do mediador
class Component2 {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;  // Define o mediador para o componente
    }

    public void doB() {
        System.out.println("Componente 2 executa B.");
        // Notifica o mediador sobre o evento B
        if (mediator != null) {
            mediator.notify(this, "B");
        }
    }
}

// Configuração do mediador e inicialização do fluxo de eventos
public class MainMediator {
    public static void main(String[] args) {
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        ConcreteMediator mediator = new ConcreteMediator(component1, component2);

        component1.doA();  // Inicia o fluxo com o evento A
    }
}
