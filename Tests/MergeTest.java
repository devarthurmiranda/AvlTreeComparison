package Tests;
import ArrayOpener.Opener;
import MergeSort.Merge;


public class MergeTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = Opener.openArchive("dados100_mil.txt");
        Merge.sort(array, 0, array.length - 1);
        System.out.println("Sorted array: ");
        Merge.printArray(array);
        long endTime = System.currentTimeMillis();
        System.out.println("\n\nExecution time for Merge Sort: " + (endTime - startTime) + "ms");
    }
    
}
