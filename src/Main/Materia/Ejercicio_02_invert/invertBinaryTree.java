package Main.Materia.Ejercicio_02_invert;

import Main.Materia.Models.Node;

public class invertBinaryTree {
    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root.getLeft();
        root.setLeft(invertTree(root.getRight()));
        root.setRight(invertTree(temp));
        return root;
    }
}

