package Comportamentais;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);  // Método para notificação
}

class ConcreteObserver implements Observer {
    public void update(String message) {
        System.out.println("Notificação recebida: " + message);  // Exibe a notificação recebida
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();  // Lista para armazenar os observadores

    public void attach(Observer observer) {
        observers.add(observer);  // Adiciona um observador
    }

    public void detach(Observer observer) {
        observers.remove(observer);  // Remove um observador
    }

    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);  // Notifica todos os observadores
        }
    }
}

// Uso do padrão Observer
public class MainObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.attach(observer1);  // Anexa o primeiro observador
        subject.attach(observer2);  // Anexa o segundo observador

        subject.notify("Nova atualização!");  // Notifica todos os observadores anexados
    }
}

