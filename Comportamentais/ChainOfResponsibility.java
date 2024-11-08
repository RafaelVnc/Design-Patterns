package Comportamentais;

// Definindo uma classe abstrata para manipuladores
abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}

// Implementando manipuladores específicos
class LowLevelHandler extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request < 10) {
            System.out.println("LowLevelHandler: Processando o pedido " + request);
        } else {
            System.out.println("LowLevelHandler: Passando para o próximo.");
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}

class HighLevelHandler extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10) {
            System.out.println("HighLevelHandler: Processando o pedido " + request);
        } else {
            System.out.println("HighLevelHandler: Não pode processar.");
        }
    }
}

// Configuração da cadeia de responsabilidade
public class ChainOfResponsibility {
    public static void main(String[] args) {
        Handler lowLevelHandler = new LowLevelHandler();
        Handler highLevelHandler = new HighLevelHandler();
        lowLevelHandler.setSuccessor(highLevelHandler);

        lowLevelHandler.handleRequest(5);  // Processado pelo LowLevelHandler
        lowLevelHandler.handleRequest(20); // Processado pelo HighLevelHandler
    }
}

