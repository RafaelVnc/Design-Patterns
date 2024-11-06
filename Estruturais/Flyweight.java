package Estruturais;

import java.util.HashMap;
import java.util.Map;

// Objeto Flyweight compartilhado
class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Desenhando a árvore '" + name + "' na posição (" + x + ", " + y + ") com cor '" + color + "' e textura '" + texture + "'.");
    }
}

// Fábrica de Flyweight
class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + color + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
        }
        return treeTypes.get(key);
    }
}

// Uso do Flyweight
class Tree {
    private int x, y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(x, y);
    }
}

// Exemplo de uso
public class Flyweight {
    public static void main(String[] args) {
        Tree tree1 = new Tree(10, 20, TreeFactory.getTreeType("Pine", "Green", "Smooth"));
        Tree tree2 = new Tree(30, 40, TreeFactory.getTreeType("Pine", "Green", "Smooth"));
        Tree tree3 = new Tree(15, 25, TreeFactory.getTreeType("Oak", "Brown", "Rough"));

        tree1.draw();
        tree2.draw();
        tree3.draw();
    }
}

