package entendendo_algoritmos;

public class Recursion {

    public static int factorial(int number){
        if (number == 0) {
            return 1;
        }
        if (number == 1) {
            return 1;
        }
        return number * factorial(number-1);
    }

    public static int sumOfNumbers(int[] numbers){
        int halfArray = numbers.length/2;
        int[] newArray1 = new int[halfArray];
        int[] newArray2 = new int[numbers.length - halfArray];
        for(int i = 0; i< newArray1.length; i++){
            newArray1[i] = numbers[i];
        }
        for(int i = 0; i< newArray2.length; i++){
            newArray2[i] = numbers[halfArray + i];
        }
        if (numbers.length == 1 ) {
            return numbers[0];
        }
        return sumOfNumbers(newArray1) + sumOfNumbers(newArray2);
    }
    
}
