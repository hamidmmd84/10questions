import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int candidateCount = 5;
        int voterCount = 25;

        int[] votes = new int[candidateCount];
        int blankVotes = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 5 to vote for a candidate.");
        System.out.print("Enter 0 submit a blank vote\n");

        for (int i=1 ; i<voterCount ; i++){
            System.out.print("Voter #"+i+ " vote(0 for blank): ");
            int vote =scanner.nextInt();

            if (vote >= 1 && vote <=candidateCount){
                votes[vote-1]++;
            } else if (vote==0) {
                blankVotes++;
            }else {
                System.out.print("Invalid vote!");
            }
        }
        System.out.println("Voting results");
        for (int i=0 ; i<candidateCount ; i++){
            System.out.println("Candidate " +(i + 1)+ ": "+votes[i]+ " votes");
        }
        System.out.print("Blank vote: "+blankVotes);

        int maxVote = -1;
        int winner = -1;
        boolean flag = false;

        for (int i=0 ; i<candidateCount ; i++){
            if (votes[i]>maxVote){
                maxVote=votes[i];
                winner=i+1;
            } else if (votes[i]==maxVote) {
                flag=true;
            }
        }
        System.out.println();
        if (flag || maxVote==0){
            System.out.print("No clear winner!");
        }else {
            System.out.println("Winner: candidate "+winner+ " with "+maxVote+" votes");
        }
    }
}