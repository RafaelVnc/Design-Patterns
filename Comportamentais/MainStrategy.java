package Comportamentais;

interface Strategy {
    // Interface da estratégia
    void execute(String data);
}

class ConcreteStrategyA implements Strategy {
    public void execute(String data) {
        // Estratégia concreta A
        System.out.println("Executando estratégia A no dado: " + data);
    }
}

class ConcreteStrategyB implements Strategy {
    public void execute(String data) {
        // Estratégia concreta B
        System.out.println("Executando estratégia B no dado: " + data);
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        // Permite alterar a estratégia em tempo de execução
        this.strategy = strategy;
    }

    public void doSomething(String data) {
        // Executa a estratégia atual
        strategy.execute(data);
    }
}

// Uso do Strategy
public class MainStrategy {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());  // Inicia com Estratégia A
        context.doSomething("Informação");  // Executa estratégia A

        context.setStrategy(new ConcreteStrategyB());  // Muda para Estratégia B
        context.doSomething("Informação");  // Executa estratégia B
    }
}

