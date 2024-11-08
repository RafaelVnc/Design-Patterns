class ConcreteIterator:
    def __init__(self, collection):
        self._collection = collection  # Atribui a coleção à variável interna
        self._index = 0  # Inicializa o índice para rastrear o próximo item

    def __next__(self):
        # Verifica se ainda há elementos na coleção
        if self._index < len(self._collection):
            item = self._collection[self._index]  # Obtém o item atual
            self._index += 1  # Avança para o próximo item
            return item
        else:
            # Lança uma exceção quando todos os itens foram percorridos
            raise StopIteration

class ConcreteCollection:
    def __init__(self):
        self._items = []  # Cria uma lista interna para armazenar itens

    def add_item(self, item):
        self._items.append(item)  # Adiciona um item à coleção

    def __iter__(self):
        # Retorna um iterador que percorre os itens da coleção
        return ConcreteIterator(self._items)

# Uso do iterador
collection = ConcreteCollection()
collection.add_item(1)
collection.add_item(2)
collection.add_item(3)
for item in collection:
    print(item)  # Saída: 1, 2, 3
