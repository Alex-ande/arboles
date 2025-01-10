package Main.Ejercicio_03_listLeves;

import Main.Materia.Models.Node;

import java.util.*;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }

       
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); 
            List<Node> currentLevel = new ArrayList<>();

            
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll(); 
                currentLevel.add(currentNode); 

                
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }

          
            result.add(currentLevel);
        }

        return result; 
    }
}


