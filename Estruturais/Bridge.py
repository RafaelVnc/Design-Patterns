# Interface do dispositivo que pode ser ligado e desligado
class Dispositivo:
    def ligar(self):
        pass

    def desligar(self):
        pass

# Implementação do dispositivo TV
class TV(Dispositivo):
    def ligar(self):
        print("TV ligada")

    def desligar(self):
        print("TV desligada")

# Controle remoto universal (abstração)
class ControleRemoto:
    def __init__(self, dispositivo):
        self.dispositivo = dispositivo

    def ligar(self):
        self.dispositivo.ligar()

    def desligar(self):
        self.dispositivo.desligar()

# Exemplo de uso
tv = TV()
controle = ControleRemoto(tv)
controle.ligar()  # TV ligada
controle.desligar()  # TV desligada
