package sorting;

public class InsertionSort {
    private static int[] array = {4,0,1,9,6,5,10};
    
    public static void insertionSort(){
        for (int j = 1; j < array.length; j++){
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
