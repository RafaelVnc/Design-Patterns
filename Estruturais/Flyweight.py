# Objeto Flyweight compartilhado
class TreeType:
    def __init__(self, name, color, texture):
        self.name = name
        self.color = color
        self.texture = texture

    def draw(self, x, y):
        print(f"Desenhando a árvore '{self.name}' na posição ({x}, {y}) com cor '{self.color}' e textura '{self.texture}'.")

# Fábrica de Flyweight
class TreeFactory:
    _tree_types = {}

    @classmethod
    def get_tree_type(cls, name, color, texture):
        if (name, color, texture) not in cls._tree_types:
            cls._tree_types[(name, color, texture)] = TreeType(name, color, texture)
        return cls._tree_types[(name, color, texture)]

# Uso do Flyweight
class Tree:
    def __init__(self, x, y, tree_type):
        self.x = x
        self.y = y
        self.tree_type = tree_type

    def draw(self):
        self.tree_type.draw(self.x, self.y)

# Exemplo de uso
tree1 = Tree(10, 20, TreeFactory.get_tree_type("Pine", "Green", "Smooth"))
tree2 = Tree(30, 40, TreeFactory.get_tree_type("Pine", "Green", "Smooth"))
tree3 = Tree(15, 25, TreeFactory.get_tree_type("Oak", "Brown", "Rough"))

tree1.draw()
tree2.draw()
tree3.draw()
