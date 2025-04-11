import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int candidateCount = 5;
        int voterCount = 25;
        int[][] preference = new int[voterCount][candidateCount];
        int[] scores = new int[candidateCount];

        String[] candidateNames = {"A","B","C","D","E"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Borda voting system.(Scores from 5 to 1, higher preference = more points)");

        for (int i=0 ; i<voterCount ; i++){
            System.out.println("Voter # "+(i+1));
            for (int j=0 ; j<candidateCount ; j++){
                System.out.print("Rank for candidate " +candidateNames[j]+ " (1 to "+candidateCount+ "): ");
                preference[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        for (int i=0 ; i<voterCount ; i++){
            for (int j=0 ; j<candidateCount ; j++){
                int rank = preference[i][j];
                if (rank >= 1 && rank <= candidateCount){
                    scores[j] += (candidateCount-rank+1);
                }
            }
        }

        System.out.println("Borda count result");
        for (int i=0 ; i<candidateCount ; i++){
            System.out.println("Candidate "+candidateNames[i]+ ": "+scores[i]+ " points");
        }

        int maxScore = -1;
        int winnerIndex = -1;
        for (int i=0 ; i<candidateCount ; i++){
            if (scores[i]>maxScore){
                maxScore=scores[i];
                winnerIndex=i;
            }
        }
        System.out.println("\n The winner is: candidate "+candidateNames[winnerIndex]+ " with "+maxScore+ " points");
        scanner.close();
    }
}