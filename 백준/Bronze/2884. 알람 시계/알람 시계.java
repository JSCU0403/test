import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        if(m<45){
            if(h == 0){
                System.out.println(23);
            }else{
                System.out.println(h-1);
            }
            System.out.println(m+60-45);
        }else{
            System.out.println(h);
            System.out.println(m-45);
        }
    }
}
