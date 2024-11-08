class Subject:
    def __init__(self):
        self._observers = []  # Lista para armazenar os observadores

    def attach(self, observer):
        self._observers.append(observer)  # Adiciona um observador

    def detach(self, observer):
        self._observers.remove(observer)  # Remove um observador

    def notify(self, message):
        for observer in self._observers:
            observer.update(message)  # Notifica todos os observadores

class Observer:
    def update(self, message):
        pass  # Método a ser implementado pelos observadores concretos

class ConcreteObserver(Observer):
    def update(self, message):
        print(f"Notificação recebida: {message}")  # Imprime a notificação recebida

# Uso do padrão Observer
subject = Subject()
observer1 = ConcreteObserver()
observer2 = ConcreteObserver()

subject.attach(observer1)  # Anexa o primeiro observador
subject.attach(observer2)  # Anexa o segundo observador

subject.notify("Nova atualização!")  # Notifica todos os observadores anexados
