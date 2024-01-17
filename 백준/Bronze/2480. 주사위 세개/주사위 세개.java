import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        int[] numbers = {A,B,C};

        if(A == B && B == C){
            System.out.println(10000+A*1000);
        }else if(A != B && B != C && A != C){
            int max=0;
            for(int i=0;i<=2;i++){
                if(numbers[i]>max){
                    max = numbers[i];
                }
            }
            System.out.println(max*100);
        }else if(A == B && B!= C){
            System.out.println(1000+A*100);
        }else if(A != B && B == C){
            System.out.println(1000+B*100);
        }else if((A == C && B != C)){
            System.out.println(1000+C*100);
        }


    }
}
