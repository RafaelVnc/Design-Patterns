import copy

# Classe que representa o protótipo Carro
class Carro:
    def __init__(self, modelo, ano):
        self.modelo = modelo  # Modelo do carro
        self.ano = ano        # Ano do carro

    def clone(self):
        # Retorna uma cópia profunda do objeto Carro, permitindo a criação de um novo carro com os mesmos atributos
        return copy.deepcopy(self)

# Criando um carro protótipo
carro1 = Carro("Sedan", 2020)
# Clonando o carro protótipo para criar um novo carro
carro2 = carro1.clone()
print(carro1.modelo, carro2.modelo)  # Ambos têm o mesmo modelo e ano
