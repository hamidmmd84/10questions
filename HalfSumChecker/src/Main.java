import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String numStr = Integer.toString(number);

        int length = numStr.length();

        int mid = length/2;

        int sumFirstHalf = 0;
        for (int i=0 ; i<mid ; i++){
            sumFirstHalf += numStr.charAt(i) - '0';
        }
        int sumSecondHalf = 0;
        for (int i=mid ; i<length ; i++){
            sumSecondHalf += numStr.charAt(i) - '0';
        }
        if (sumFirstHalf==sumSecondHalf){
            System.out.print("The sum of first and second half is equal");
        }else {
            System.out.println("The sum of first and second half is not equal");
        }

        scanner.close();
    }
}