# Classe Element base que aceita um visitante
class Element:
    def accept(self, visitor):
        pass  # Método que permite que o visitante realize uma operação no elemento

# Elemento específico A
class ConcreteElementA(Element):
    def accept(self, visitor):
        visitor.visit_concrete_element_a(self)  # Chama o método específico do visitante para o Elemento A

# Elemento específico B
class ConcreteElementB(Element):
    def accept(self, visitor):
        visitor.visit_concrete_element_b(self)  # Chama o método específico do visitante para o Elemento B

# Interface Visitor com métodos para cada tipo de elemento
class Visitor:
    def visit_concrete_element_a(self, element):
        pass  # Visita um ConcreteElementA

    def visit_concrete_element_b(self, element):
        pass  # Visita um ConcreteElementB

# Visitante específico 1 que implementa as operações para os elementos
class ConcreteVisitor1(Visitor):
    def visit_concrete_element_a(self, element):
        print("Visitor 1 visitou Elemento A")  # Operação realizada no Elemento A

    def visit_concrete_element_b(self, element):
        print("Visitor 1 visitou Elemento B")  # Operação realizada no Elemento B

# Visitante específico 2 que implementa as operações para os elementos
class ConcreteVisitor2(Visitor):
    def visit_concrete_element_a(self, element):
        print("Visitor 2 visitou Elemento A")  # Operação realizada no Elemento A

    def visit_concrete_element_b(self, element):
        print("Visitor 2 visitou Elemento B")  # Operação realizada no Elemento B

# Uso do padrão Visitor
elements = [ConcreteElementA(), ConcreteElementB()]  # Lista de elementos
visitor1 = ConcreteVisitor1()  # Visitante 1
visitor2 = ConcreteVisitor2()  # Visitante 2

# Para cada elemento, aplicamos ambos os visitantes
for element in elements:
    element.accept(visitor1)  # Visitor 1 visita os elementos
    element.accept(visitor2)  # Visitor 2 visita os mesmos elementos
