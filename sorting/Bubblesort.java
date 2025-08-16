package sorting;

public class Bubblesort {
    private static int[] array = {4,0,1,9,6,5,10};
    private static boolean flag;

    public static void sort(){
        int aux;
        for (int i = 0; i < array.length-1; i++) {
            flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]) {
                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j]=aux;
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("O vetor está ordenado");
                break;
            }
        }
        for (int numero : array) {
            System.out.print(numero + ", ");
        }
        
    }
}
