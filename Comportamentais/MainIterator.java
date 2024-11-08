package Comportamentais;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Classe que representa a coleção de elementos
class ConcreteCollection implements Iterable<Integer> {
    private List<Integer> items = new ArrayList<>();  // Lista interna para armazenar itens

    public void addItem(int item) {
        items.add(item);  // Adiciona um item à coleção
    }

    @Override
    public Iterator<Integer> iterator() {
        // Retorna o iterador da lista, ocultando a estrutura interna
        return items.iterator();
    }
}

// Uso do iterador
public class MainIterator {
    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection();
        collection.addItem(1);
        collection.addItem(2);
        collection.addItem(3);
        
        // Itera sobre os itens da coleção usando o iterador
        for (int item : collection) {
            System.out.println(item);  // Saída: 1, 2, 3
        }
    }
}
