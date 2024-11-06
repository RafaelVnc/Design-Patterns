# Pizza base
class Pizza:
    def descricao(self):
        return "Pizza simples"

# Decorador base
class DecoradorPizza(Pizza):
    def __init__(self, pizza):
        self.pizza = pizza

    def descricao(self):
        return self.pizza.descricao()

# Decorador que adiciona queijo extra
class QueijoExtra(DecoradorPizza):
    def descricao(self):
        return self.pizza.descricao() + " com queijo extra"

# Decorador que adiciona cogumelos
class Cogumelos(DecoradorPizza):
    def descricao(self):
        return self.pizza.descricao() + " com cogumelos"

# Exemplo de uso
pizza = Pizza()
pizza_com_queijo = QueijoExtra(pizza)
pizza_com_queijo_e_cogumelos = Cogumelos(pizza_com_queijo)
print(pizza_com_queijo_e_cogumelos.descricao())  # Pizza simples com queijo extra com cogumelos
