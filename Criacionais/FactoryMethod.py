from abc import ABC, abstractmethod

# Interface Pao define o método para criação do pão
class Pao(ABC):
    @abstractmethod
    def criar_pao(self):
        pass

# Subclasse concreta que implementa o pão francês
class PaoFrances(Pao):
    def criar_pao(self):
        return "Pão Francês"

# Subclasse concreta que implementa o pão integral
class PaoIntegral(Pao):
    def criar_pao(self):
        return "Pão Integral"

# Fábrica que cria o pão de acordo com o tipo especificado
def fabrica_pao(tipo):
    if tipo == "frances":
        return PaoFrances()
    elif tipo == "integral":
        return PaoIntegral()
    else:
        raise ValueError("Tipo de pão desconhecido")  # Tratamento de erro para tipos inválidos

# Criando um pão francês
pao = fabrica_pao("frances")
print(pao.criar_pao())  # Saída: "Pão Francês"
