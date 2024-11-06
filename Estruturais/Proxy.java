package Estruturais;

// Classe que representa o objeto real, neste caso o Banco de Dados.
class Database {
    private String data;

    public Database() {
        this.data = "Dados confidenciais do banco de dados";
    }

    public String readData() {
        System.out.println("Acessando o banco de dados...");
        return data;
    }
}

// Classe Proxy que controla o acesso ao banco de dados.
class DatabaseProxy {
    private String userRole;
    private Database realDatabase;  // Referência ao banco de dados real.

    public DatabaseProxy(String userRole) {
        this.userRole = userRole;  // Define o papel do usuário (admin, visitante, etc.)
    }

    public String readData() {
        // Verifica permissões antes de acessar o banco de dados real.
        if ("admin".equals(userRole)) {
            // Carrega o banco de dados real sob demanda, caso ainda não esteja carregado.
            if (realDatabase == null) {
                realDatabase = new Database();
            }
            return realDatabase.readData();
        } else {
            System.out.println("Acesso negado. Somente administradores podem acessar o banco de dados.");
            return null;
        }
    }
}

// Exemplo de uso
public class Proxy {
    public static void main(String[] args) {
        DatabaseProxy adminAccess = new DatabaseProxy("admin");
        System.out.println(adminAccess.readData());  // Acesso permitido e dados carregados.

        DatabaseProxy visitorAccess = new DatabaseProxy("visitor");
        System.out.println(visitorAccess.readData());  // Acesso negado devido a permissões insuficientes.
    }
}

