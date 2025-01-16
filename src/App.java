

import Main.Materia.Ejercicio_01_insert.InsertBSTTest;
import Main.Ejercicio_03_listLeves.ListLevels;
import Main.Materia.Ejercicio_02_invert.invertBinaryTree;
import Main.Materia.Ejercicio_04_depth.Depth;
import Main.Materia.Controllers.ArbolAVL;
import Main.Materia.Models.Node;
import java.util.*;

public class App {
    public static void main(String[] args) {
        runEjercicio01();
        runEjercicio02();
        runEjercicio03();
        runEjercicio04();
        runArbolAvl();
    }

    private static void runEjercicio01() {
        System.out.println("Ejercicio 01: Insertar en un Árbol Binario de Búsqueda");
        InsertBSTTest bst = new InsertBSTTest();
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        for (int valor : valores) {
            bst.insert(valor);
        }
        bst.printTree();
    }

    private static void runEjercicio02() {
        System.out.println("Ejercicio 02: Invertir un Árbol Binario");
        InsertBSTTest bst = new InsertBSTTest();
        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        for (int valor : valores) {
            bst.insert(valor);
        }
        System.out.println("Árbol original:");
        bst.printTree();
        invertBinaryTree invert = new invertBinaryTree();
        Node invertedRoot = invert.invertTree(bst.getRoot());
        bst.printTree();
    }

    private static void runEjercicio03() {
        System.out.println("Ejercicio 03: Listar Niveles en Listas Enlazadas");
        InsertBSTTest bst = new InsertBSTTest();
        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        for (int valor : valores) {
            bst.insert(valor);
        }
        ListLevels listLevels = new ListLevels();
        List<List<Node>> niveles = listLevels.listLevels(bst.getRoot());
        for (int i = 0; i < niveles.size(); i++) {
            System.out.print("Nivel " + (i + 1) + ": ");
            for (Node nodo : niveles.get(i)) {
                System.out.print(nodo.getValue() + " -> ");
            }
            System.out.println("null");
        }
    }

    private static void runEjercicio04() {
        System.out.println("Ejercicio 04: Calcular la Profundidad Máxima");
        InsertBSTTest bst = new InsertBSTTest();
        int[] valores = {4, 2, 7, 1, 3};
        for (int valor : valores) {
            bst.insert(valor);
        }
        Depth depth = new Depth();
        System.out.println("Profundidad máxima: " + depth.maxDepth(bst.getRoot()));
    }

    private static void runArbolAvl() {
        System.out.println("Árbol AVL:");
        ArbolAVL arbolAVL = new ArbolAVL();
        int[] valores = {10, 20, 15, 24, 9, 21, 23, 50, 25};
        for (int valor : valores) {
            arbolAVL.insert(valor);
            arbolAVL.printTree();
        }
    }
}
