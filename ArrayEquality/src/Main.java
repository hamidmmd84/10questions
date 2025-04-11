import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Enter size of second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        if (size1 != size2){
            System.out.print("Error, the size of arrays is not equal!");
            return;
        }

        System.out.print("Enter elements of first array: ");
        for (int i=0 ; i<size1 ; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter elements of second array: ");
        for (int i=0 ; i<size2 ; i++){
            array2[i] = scanner.nextInt();
        }

        int matchedCount = 0;
        for (int i=0 ; i<size1 ; i++){
            for (int j=0 ; j<size2 ; j++){
                if (array1[i]==array2[j]){
                    matchedCount++;
                    break;
                }
            }
        }
        if (matchedCount==size1){
            System.out.print("The arrays are equal");
        }else {
            System.out.print("THe arrays are not equal");
        }
    }
}