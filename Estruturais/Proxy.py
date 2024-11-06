# Classe que representa o objeto real, neste caso o Banco de Dados.
class Database:
    def __init__(self):
        self.data = "Dados confidenciais do banco de dados"
    
    def read_data(self):
        print("Acessando o banco de dados...")
        return self.data

# Classe Proxy que controla o acesso ao banco de dados.
class DatabaseProxy:
    def __init__(self, user_role):
        self.user_role = user_role  # Define o papel do usuário (admin, visitante, etc.)
        self._real_database = None  # Inicialmente, o banco de dados real não é carregado.

    def read_data(self):
        # Verifica permissões antes de acessar o banco de dados real.
        if self.user_role == "admin":
            # Carrega o banco de dados real sob demanda, caso ainda não esteja carregado.
            if self._real_database is None:
                self._real_database = Database()
            return self._real_database.read_data()
        else:
            print("Acesso negado. Somente administradores podem acessar o banco de dados.")
            return None

# Exemplo de uso
admin_access = DatabaseProxy("admin")
print(admin_access.read_data())  # Acesso permitido e dados carregados.

visitor_access = DatabaseProxy("visitor")
print(visitor_access.read_data())  # Acesso negado devido a permissões insuficientes.
