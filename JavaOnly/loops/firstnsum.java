
import java.util.Scanner;

public class firstnsum{
    public static void main(String[] args) {
        int i =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(i <= n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}