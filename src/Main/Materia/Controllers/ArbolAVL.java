package Main.Materia.Controllers;

import Main.Materia.Models.Node;

public class ArbolAVL {
    private Node root;

    public void insert(int value) {
        System.out.println("nodo a insertar " + value);
        root = insert(root, value);
    }

    private Node insert(Node nodo, int value) {
        if (nodo == null) {
            Node newNode = new Node(value);
            newNode.setHeight(1);
            return newNode;
        }
        if (value < nodo.getValue()) {
            nodo.setLeft(insert(nodo.getLeft(), value));
        } else if (value > nodo.getValue()) {
        nodo.setRight(insert(nodo.getRight(), value));
        } else {
            return nodo;
        }
        nodo.setHeight(1 + Math.max(height(nodo.getLeft()), height(nodo.getRight())));
        // obtener el blance o factor de equlibrio del nodo ancestro
        int balance = getBlance(nodo);

    System.out.println("- Nodo actual: " + nodo.getValue());
    System.out.println("  Altura del nodo: "+ nodo.getValue()+"Es" + nodo.getHeight());
    System.out.println("  Equilibrio del nodo: "+ nodo.getValue()+"Es" + balance);

        // caso izquierda
        if (balance > 1 && value < nodo.getLeft().getValue()) {
            return rightRotate(nodo);
        }
        // caso derecha
        if (balance < -1 && value > nodo.getRight().getValue()) {
    return leftRotate(nodo);
        }
        // caso izquieda derecha
        if (balance > 1 && value > nodo.getLeft().getValue()) {
    nodo.setLeft(leftRotate(nodo.getLeft()));
    return rightRotate(nodo);
        }
        // caso dercha izquierda
        if (balance < -1 && value < nodo.getRight().getValue()) {
nodo.setRight(rightRotate(nodo.getRight()));
return leftRotate(nodo);
        }

        // devolvemos sin cambios cambios

        return nodo;
    }
    private Node rightRotate (Node y){
        Node x = y.getLeft();
        Node temp = x.getRight();
        System.out.println("rotamos derecha el nodo :"+ y.getValue());
        // realizamos rotaciones 
        x.setRight(y);
        y.setLeft(temp);
        // actualisar la altura
        y.setHeight(Math.max(height(y.getLeft()),height(y.getRight())));
        x.setHeight(Math.max(height(x.getLeft()),height(x.getRight())));
        System.out.println("nueva raiz despues de la rotacion"+x.getValue()+ "balance"+getBlance(y));
        return x;
    }
    private Node leftRotate (Node x) {
        Node y = x.getRight();
        Node temp = y.getLeft();
        // imprimir informacion antes de la rotacion
        System.out.println("left rotate on node"+ x.getValue()+"balance"+ getBlance(x));
        // realisar rotacion
        y.setLeft(x);
        x.setRight(temp);
        // actualisar alturas
        x.setHeight(Math.max(height(x.getLeft()),height(x.getRight())));
        y.setHeight(Math.max(height(y.getLeft()),height(y.getRight())));
        System.out.println("nueva rais de la rotacion"+y.getValue());
return y;
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    private int getBlance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    public void printTree() {
        printTree(root, " ", true);

    }

    private void printTree(Node node, String prefix, boolean isleft) {
        if (node != null) {
            System.out.println(prefix + (isleft ? "├── " : "└── ") + node.getValue());
            if (node.getLeft() != null || node.getRight() != null) {
                if (node.getLeft() != null) {
                    printTree(node.getLeft(), prefix + (isleft ? "  " : "   "), true);
                } else {
                    System.out.println(prefix + (isleft ? "| " : "├──null "));
                }
                if (node.getRight() != null) {
                    printTree(node.getRight(), prefix + (isleft ? "  " : "   "), false);
                } else {
                    System.out.println(prefix + (isleft ? "| " : "├──null "));
                }
            }
        }

    }

}
