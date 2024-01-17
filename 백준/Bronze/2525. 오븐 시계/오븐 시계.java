import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        if((B+C) < 60){
            System.out.println(A);
            System.out.println(B+C);
        }

        if((B+C) >= 60){
            int H = (B+C)/60;
            int M = (B+C)%60;
            if(A+H<24){
                System.out.println(A+H);
                System.out.println(M);
            }else{
                System.out.println(A+H-24);
                System.out.println(M);
            }
        }
    }
}
