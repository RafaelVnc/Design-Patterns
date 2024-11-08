class Mediator:
    def notify(self, sender, event):
        pass  # Define a interface de notificação para o Mediador

class ConcreteMediator(Mediator):
    def __init__(self, component1, component2):
        self.component1 = component1
        self.component2 = component2
        # Cada componente conhece o mediador, promovendo o desacoplamento
        self.component1._mediator = self
        self.component2._mediator = self

    def notify(self, sender, event):
        # Implementa a lógica de comunicação entre componentes
        if event == "A":
            print("Mediator reage ao evento A e dispara o evento B")
            self.component2.do_b()
        elif event == "B":
            print("Mediator reage ao evento B e dispara o evento A")
            self.component1.do_a()

class Component1:
    def __init__(self, mediator=None):
        self._mediator = mediator  # Define o mediador para o componente

    def do_a(self):
        print("Componente 1 executa A.")
        # Notifica o mediador sobre o evento A
        self._mediator.notify(self, "A")

class Component2:
    def __init__(self, mediator=None):
        self._mediator = mediator  # Define o mediador para o componente

    def do_b(self):
        print("Componente 2 executa B.")
        # Notifica o mediador sobre o evento B
        self._mediator.notify(self, "B")

# Configuração do mediador
mediator = ConcreteMediator(Component1(), Component2())
mediator.component1.do_a()  # Inicia o fluxo com o evento A
