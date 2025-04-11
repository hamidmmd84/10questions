import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String result = "";
        for (int i=0 ; i<word.length() ; i++){
            char c = word.charAt(i);
            if (result.indexOf(c) == -1){
                result +=c;
            }
        }
        System.out.print("new word: " +result) ;
    }
}