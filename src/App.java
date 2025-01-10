

import Main.Ejercicio_03_listLeves.ListLevels;
import Main.Materia.Controllers.ArbolBinario;
import Main.Materia.Controllers.ArbolRecorrido;

public class App {
    public static void main(String[] args) throws Exception {
     runArbolBinario();
       runEjercicio3();
    }

    public static void runEjercicio3 (){
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels(null);
        int [] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        for (int i = 0; i < valores.length; i++) {
            arbolBinario.insert(valores [i]);
        }
        arbolBinario.printTree();
        List = levels.ListLevels(arbolBinario.getRoot());

        
    }

    public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ArbolRecorrido arbolRecorrido = new ArbolRecorrido();
        int[] valores = { 40, 20, 60, 10, 30, 50, 70, 5, 15, 55 };
        
        for (int value : valores) 
            arbolBinario.insert(value);



            arbolBinario.printTree();
            System.out.print("arbol recorrido: ");
            arbolRecorrido.preorderIteratico(arbolBinario.getRoot());
            System.out.println();
            System.out.print("arbol recursivo: ");
            arbolRecorrido.preOrderRecursivo(arbolBinario.getRoot());
            System.out.println();
            System.out.println("posoder: ");
            arbolRecorrido.posOrderRecursivo(arbolBinario.getRoot());
            System.out.println();
            System.out.println("inorder");
            arbolRecorrido.inOrderRecursivo(arbolBinario.getRoot());
    }
}
