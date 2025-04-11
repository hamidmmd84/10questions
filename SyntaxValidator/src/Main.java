import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        String opened = "";
        boolean isBalanced = true;

        for (char ch : input.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                opened += ch;
            } else if (ch == ')' || ch == '}' || ch == ']'){
                if (opened.length() == 0){
                    isBalanced=false;
                    break;
                }
                char last = opened.charAt(opened.length()-1);

                if ((ch == ')' && last == '(') || (ch == '}' && last== '{') || (ch == ']' && last == '[')){
                    opened = opened.substring(0, opened.length()-1);
                }else {
                    isBalanced=false;
                    break;
                }
            }
        }
        if (opened.length() != 0){
            isBalanced=false;
        }

        if (isBalanced){
            System.out.print("The string is balanced!");
        }else{
            System.out.println("The string is not balanced!");
        }
    }
}