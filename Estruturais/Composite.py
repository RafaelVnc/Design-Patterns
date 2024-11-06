# Componente básico
class Componente:
    def operar(self):
        pass

# Folha (um item indivisível)
class Folha(Componente):
    def operar(self):
        print("Folha operando")

# Galho (pode conter outros componentes)
class Galho(Componente):
    def __init__(self):
        self.componentes = []

    def adicionar(self, componente):
        self.componentes.append(componente)

    def operar(self):
        print("Galho operando")
        for componente in self.componentes:
            componente.operar()

# Exemplo de uso: uma árvore com galhos e folhas
galho1 = Galho()
folha1 = Folha()
galho1.adicionar(folha1)

galho2 = Galho()
folha2 = Folha()
galho2.adicionar(folha2)

galhoPrincipal = Galho()
galhoPrincipal.adicionar(galho1)
galhoPrincipal.adicionar(galho2)

galhoPrincipal.operar()
