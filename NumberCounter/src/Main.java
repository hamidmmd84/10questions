import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter the elements of array: ");
        for (int i=0 ; i<size ; i++){
            numbers[i] = scanner.nextInt();
        }
        for (int i=0 ; i<size ; i++){
            boolean isCounted = false;
            for (int j=0 ; j<i ; j++){
                if (numbers[i]==numbers[j]){
                    isCounted=true;
                    break;
                }
            }

            if (!isCounted){
                int count = 1;
                for (int j=i+1 ; j<size ; j++){
                    if (numbers[i]==numbers[j]){
                        count++;
                    }
                }
                System.out.println("number  "+numbers[i]+ " repeated "+count+ " times");
            }
        }
        scanner.close();
    }
}