from abc import ABC, abstractmethod

# Definindo a interface para um sofá
class Sofa(ABC):
    @abstractmethod
    def get_type(self):
        pass

# Definindo a interface para uma mesa
class Mesa(ABC):
    @abstractmethod
    def get_type(self):
        pass

# Implementação concreta de um sofá moderno
class SofaModerno(Sofa):
    def get_type(self):
        return "Sofá Moderno"

# Implementação concreta de uma mesa moderna
class MesaModerna(Mesa):
    def get_type(self):
        return "Mesa Moderna"

# Implementação concreta de um sofá clássico
class SofaClassico(Sofa):
    def get_type(self):
        return "Sofá Clássico"

# Implementação concreta de uma mesa clássica
class MesaClassica(Mesa):
    def get_type(self):
        return "Mesa Clássica"

# Fábrica que cria móveis no estilo moderno
class FabricaModerna:
    def criar_sofa(self):
        return SofaModerno()
    
    def criar_mesa(self):
        return MesaModerna()

# Fábrica que cria móveis no estilo clássico
class FabricaClassica:
    def criar_sofa(self):
        return SofaClassico()
    
    def criar_mesa(self):
        return MesaClassica()

# Usando a fábrica moderna para criar móveis
fabrica = FabricaModerna()
sofa = fabrica.criar_sofa()
mesa = fabrica.criar_mesa()
print(sofa.get_type())  # "Sofá Moderno"
print(mesa.get_type())  # "Mesa Moderna"


