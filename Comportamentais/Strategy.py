class Strategy:
    # Interface da estratégia
    def execute(self, data):
        pass

class ConcreteStrategyA(Strategy):
    # Estratégia concreta A
    def execute(self, data):
        print(f"Executando estratégia A no dado: {data}")

class ConcreteStrategyB(Strategy):
    # Estratégia concreta B
    def execute(self, data):
        print(f"Executando estratégia B no dado: {data}")

class Context:
    # Contexto que usa a estratégia
    def __init__(self, strategy: Strategy):
        self._strategy = strategy

    def set_strategy(self, strategy: Strategy):
        # Permite mudar a estratégia em tempo de execução
        self._strategy = strategy

    def do_something(self, data):
        # Executa a estratégia atual
        self._strategy.execute(data)

# Uso do Strategy
context = Context(ConcreteStrategyA())  # Inicia com Estratégia A
context.do_something("Informação")  # Executa estratégia A

context.set_strategy(ConcreteStrategyB())  # Muda para Estratégia B
context.do_something("Informação")  # Executa estratégia B
