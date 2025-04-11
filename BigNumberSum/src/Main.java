import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String num1 = scanner.nextLine();
        System.out.print("Enter second number: ");
        String num2 = scanner.nextLine();

        while (num1.length() < num2.length()){
            num1 = "0" + num1;
        }
        while (num2.length() < num1.length()){
            num2 = "0" + num2;
        }

        int len = num1.length();
        int[] result = new int[len+1];
        int carry = 0;

        for (int i=len-1 ; i>=0 ; i--){
            int digit1 = num1.charAt(i)-'0';
            int digit2 = num2.charAt(i)-'0';
            int sum = digit1+digit2+carry;
            result[i+1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;

        System.out.print("Sum: ");
        boolean started=false;
        for (int digit : result){
            if (digit != 0 || started){
                System.out.print(digit);
                started=true;
            }
        }
        if (!started){
            System.out.print("0");
        }

        System.out.println();
    }
}