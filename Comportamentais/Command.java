package Comportamentais;

// Interface de comando
interface Comm {
    void execute();
}

class LightOnCommand implements Comm {
    public void execute() {
        System.out.println("A luz foi acesa!");
    }
}

class LightOffCommand implements Comm {
    public void execute() {
        System.out.println("A luz foi apagada!");
    }
}

class RemoteControl {
    public void submit(Comm command) {
        command.execute();
    }
}

// Utilização do comando
public class Command {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        control.submit(new LightOnCommand());
        control.submit(new LightOffCommand());
    }
}
