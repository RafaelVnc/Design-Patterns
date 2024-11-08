class State:
    def handle(self):
        pass  # Método abstrato para implementação dos estados concretos

class ConcreteStateA(State):
    def handle(self):
        print("Estado A: Executando ação")  # Comportamento específico para o estado A

class ConcreteStateB(State):
    def handle(self):
        print("Estado B: Executando ação")  # Comportamento específico para o estado B

class Context:
    def __init__(self, state):
        self._state = state  # Armazena o estado atual

    def set_state(self, state):
        self._state = state  # Altera o estado do contexto

    def request(self):
        self._state.handle()  # Executa a ação baseada no estado atual

# Uso do padrão State
context = Context(ConcreteStateA())
context.request()  # Estado A: Executando ação

context.set_state(ConcreteStateB())
context.request()  # Estado B: Executando ação
