
import java.util.Scanner;
public class breakmultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your number : ");
            int n = sc.nextInt();
            if(n%10 == 0){
                break;
            }
            System.out.println((n) + "is not multiple of 10");
        }
        System.out.println("is multiple of 10");
        
            
}}
