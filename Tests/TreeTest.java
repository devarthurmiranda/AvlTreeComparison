package Tests;
import ArrayOpener.Opener;
import AvlTree.*;

public class TreeTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Avl tree = new Avl();
        int[] array = Opener.openArchive("dados100_mil.txt");

        for(int i = 0; i < array.length; i++){
            tree.root = tree.insert(tree.root, array[i]);
        }
        System.out.println("In-Order: ");
        tree.inOrder(tree.root);
        long endTime = System.currentTimeMillis();
        System.out.println("\n\nExecution time for AVL Tree: " + (endTime - startTime) + "ms");

    }
    
}
