class Memento:
    def __init__(self, state):
        self._state = state  # Armazena o estado do objeto no memento

    def get_state(self):
        return self._state  # Retorna o estado armazenado no memento

class Originator:
    def __init__(self):
        self._state = ""  # Estado inicial do objeto

    def set_state(self, state):
        print(f"Estado definido para: {state}")
        self._state = state  # Define o estado atual do objeto

    def save_state_to_memento(self):
        return Memento(self._state)  # Cria um memento para salvar o estado atual

    def get_state_from_memento(self, memento):
        self._state = memento.get_state()  # Restaura o estado do memento
        print(f"Estado restaurado para: {self._state}")

# Uso do padrão Memento
originator = Originator()
originator.set_state("Estado1")  # Define um estado
memento = originator.save_state_to_memento()  # Salva o estado atual no memento
originator.set_state("Estado2")  # Altera o estado

originator.get_state_from_memento(memento)  # Restaura o estado anterior a partir do memento
