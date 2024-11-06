package Estruturais;

// Interface Pizza
interface Pizza {
    String descricao();
}

// Pizza simples
class PizzaSimples implements Pizza {
    public String descricao() {
        return "Pizza simples";
    }
}

// Decorador base
class DecoradorPizza implements Pizza {
    protected Pizza pizza;

    public DecoradorPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String descricao() {
        return pizza.descricao();
    }
}

// Decorador queijo extra
class QueijoExtra extends DecoradorPizza {
    public QueijoExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String descricao() {
        return pizza.descricao() + " com queijo extra";
    }
}

// Decorador cogumelos
class Cogumelos extends DecoradorPizza {
    public Cogumelos(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String descricao() {
        return pizza.descricao() + " com cogumelos";
    }
}

// Exemplo de uso
public class Decorator {
    public static void main(String[] args) {
        Pizza pizza = new PizzaSimples();
        Pizza pizzaComQueijo = new QueijoExtra(pizza);
        Pizza pizzaComQueijoECogumelos = new Cogumelos(pizzaComQueijo);

        System.out.println(pizzaComQueijoECogumelos.descricao());  // Pizza simples com queijo extra com cogumelos
    }
}


