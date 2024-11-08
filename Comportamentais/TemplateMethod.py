class AbstractClass:
    # Método template que define o esqueleto do algoritmo
    def template_method(self):
        self.step_one()
        self.step_two()
        self.hook()  # Gancho opcional para subclasses

    def step_one(self):
        # Passo fixo para todas as subclasses
        print("Passo 1: fixo")

    def step_two(self):
        # Passo a ser implementado pelas subclasses
        pass

    def hook(self):
        # Gancho opcional que pode ser sobrescrito
        pass

class ConcreteClassA(AbstractClass):
    # Implementação do passo 2
    def step_two(self):
        print("Passo 2: implementado pela Classe A")

class ConcreteClassB(AbstractClass):
    # Implementação do passo 2 e do gancho
    def step_two(self):
        print("Passo 2: implementado pela Classe B")
    
    def hook(self):
        print("Gancho implementado pela Classe B")

# Uso do Template Method
a = ConcreteClassA()
b = ConcreteClassB()

a.template_method()
# Saída: Passo 1: fixo
# Passo 2: implementado pela Classe A

b.template_method()
# Saída: Passo 1: fixo
# Passo 2: implementado pela Classe B
# Gancho implementado pela Classe B
