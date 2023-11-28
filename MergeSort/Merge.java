package MergeSort;

public class Merge { 
    public static int[] sort(int[] array, int left, int right){
        if(left < right){
            int middle = (left + right) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
        return array;
    }  
    public static int[] merge(int[] array, int left, int middle, int right){
        int[] leftArray = new int[middle - left + 1];
        int[] rightArray = new int[right - middle];
        
        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = array[left + i];
        }
        for(int i = 0; i < rightArray.length; i++){
            rightArray[i] = array[middle + i + 1];
        }
        
        int i = 0, j = 0;
        for(int k = left; k < right + 1; k++){
            if(i == leftArray.length){
                array[k] = rightArray[j];
                j++;
            } else if(j == rightArray.length){
                array[k] = leftArray[i];
                i++;
            } else if(leftArray[i] < rightArray[j]){
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
        }
        return array;
    }
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
