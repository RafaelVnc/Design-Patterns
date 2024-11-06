package Criacionais;

// Interface Pao define o método para criação do pão
interface Pao {
    String criarPao();
}

// Subclasse concreta que implementa o pão francês
class PaoFrances implements Pao {
    public String criarPao() {
        return "Pão Francês";
    }
}

// Subclasse concreta que implementa o pão integral
class PaoIntegral implements Pao {
    public String criarPao() {
        return "Pão Integral";
    }
}

// Fábrica que cria o pão de acordo com o tipo especificado
public class FactoryMethod {
    public static Pao criarPao(String tipo) {
        if (tipo.equals("frances")) {
            return new PaoFrances();
        } else if (tipo.equals("integral")) {
            return new PaoIntegral();
        } else {
            throw new IllegalArgumentException("Tipo de pão desconhecido");
        }
    }

    public static void main(String[] args) {
        Pao pao = FactoryMethod.criarPao("frances");
        System.out.println(pao.criarPao()); // Saída: "Pão Francês"
    }
}
