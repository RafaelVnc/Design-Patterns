# Definindo uma classe base para manipuladores
class Handler:
    def __init__(self, successor=None):
        self.successor = successor  # Próximo manipulador na cadeia

    def handle_request(self, request):
        if self.successor:
            self.successor.handle_request(request)

# Implementando manipuladores específicos
class LowLevelHandler(Handler):
    def handle_request(self, request):
        if request < 10:
            print(f"LowLevelHandler: Processando o pedido {request}")
        else:
            print("LowLevelHandler: Passando para o próximo.")
            super().handle_request(request)

class HighLevelHandler(Handler):
    def handle_request(self, request):
        if request >= 10:
            print(f"HighLevelHandler: Processando o pedido {request}")
        else:
            print("HighLevelHandler: Não pode processar.")

# Configuração da cadeia de responsabilidade
handler = LowLevelHandler(HighLevelHandler())
handler.handle_request(5)  # Espera-se que seja processado pelo LowLevelHandler
handler.handle_request(20)  # Espera-se que seja processado pelo HighLevelHandler
