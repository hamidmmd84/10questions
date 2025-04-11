import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the elements of array: ");
        for (int i=0 ; i<size ; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the first value: ");
        int val1 = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int val2 = scanner.nextInt();

        int minDistance = 9999999;
        int lastIndex1 = -1;
        int lasIndex2 = -1;

        for (int i=0 ; i<size ; i++){
            if (array[i]==val1){
                lastIndex1=i;
                if (lasIndex2 != -1){
                    int distance = Math.abs(lastIndex1-lasIndex2);
                    if (distance<minDistance){
                        minDistance=distance;
                    }
                }
            }else if (array[i]==val2){
                lasIndex2=i;
                if (lastIndex1 !=-1){
                    int distance = Math.abs(lastIndex1-lasIndex2);
                    if (distance<minDistance){
                        minDistance=distance;
                    }
                }
            }
        }
        if (minDistance==9999999){
            System.out.print("One of the value is not in array");
        }else {
            System.out.println("The minimum distance between "+val1+" and "+val2+" in the array is: "+minDistance);
        }
    }
}