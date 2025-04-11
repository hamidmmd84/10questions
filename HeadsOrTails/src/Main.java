import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a;
        int sh=0,kh=0;

        for (int i=0 ; i<1000 ; i++){
            a=random.nextInt(2);
            if (a==0){
                sh++;
            }else {
                kh++;
            }
        }
        System.out.println("heads: "+(double)sh/10);
        System.out.println("tails: "+(double)kh/10);
    }
}