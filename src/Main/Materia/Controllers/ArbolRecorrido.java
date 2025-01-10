package Main.Materia.Controllers;

import java.util.Stack;

import Main.Materia.Models.Node;

public class ArbolRecorrido {
    public void preorderIteratico(Node root) {
        // verificar si no esat vacio
        if (root == null) {
            return;
        }
        // pila para majer nodos del arbol durante el rrecorrido
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
       Node node = stack.pop();
       System.out.print(node.getValue()+", ");

       if (node.getRight() != null) {
        stack.push(node.getRight());
   
       }
       if (node.getLeft() != null) {
        stack.push(node.getLeft());
       }
        }
    }

    public void preOrderRecursivo (Node node){
if (node != null) {
    //imprimir el valor
    System.out.print(node.getValue()+", ");
    preOrderRecursivo(node.getLeft());
    preOrderRecursivo(node.getRight());
}
    }
    public void posOrderRecursivo (Node node){
        if (node != null) {
            //imprimir el valor
      
            posOrderRecursivo(node.getLeft());
            posOrderRecursivo(node.getRight());
            System.out.print(node.getValue()+", ");
        }
}
public void inOrderRecursivo (Node node){
    if (node != null) {
        //imprimir el valor
  
        inOrderRecursivo(node.getLeft());
        System.out.print(node.getValue()+", ");
        inOrderRecursivo(node.getRight());
       
    }
}

}
