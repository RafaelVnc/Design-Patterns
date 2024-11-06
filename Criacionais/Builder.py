# Classe que representa o produto final, Hamburguer
class Hamburguer:
    def __init__(self):
        self.ingredients = []  # Lista para armazenar os ingredientes do hambúrguer

    def add_ingredient(self, ingredient):
        self.ingredients.append(ingredient)  # Adiciona um ingrediente ao hambúrguer

# Builder para criar diferentes tipos de Hamburguer com componentes opcionais
class HamburguerBuilder:
    def __init__(self):
        self.hamburguer = Hamburguer()  # Cria uma nova instância de Hamburguer

    def add_pao(self):
        self.hamburguer.add_ingredient("Pao")  # Adiciona pão
        return self  # Retorna o builder para facilitar o encadeamento

    def add_carne(self):
        self.hamburguer.add_ingredient("Carne")  # Adiciona carne
        return self

    def add_queijo(self):
        self.hamburguer.add_ingredient("Queijo")  # Adiciona queijo
        return self

    def add_alface(self):
        self.hamburguer.add_ingredient("Alface")  # Adiciona alface
        return self

    def build(self):
        return self.hamburguer  # Retorna o hambúrguer completo

# Usando o builder para construir um hambúrguer com diferentes ingredientes
builder = HamburguerBuilder()
hamburguer = builder.add_pao().add_carne().add_queijo().add_alface().build()
print(hamburguer.ingredients)
