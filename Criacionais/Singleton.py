class Singleton:
    _instance = None  # Armazena a única instância da classe

    def __new__(cls):
        # Se _instance é None, cria uma nova instância
        if cls._instance is None:
            cls._instance = super(Singleton, cls).__new__(cls)
        return cls._instance  # Retorna a instância existente ou recém-criada

# Testando o Singleton
s1 = Singleton()
s2 = Singleton()
print(s1 == s2)  # True, pois ambos apontam para a mesma instância (Singleton)
