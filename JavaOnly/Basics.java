import java.util.*;
public class Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type First number : ");
        
        int a = sc.nextInt();
        System.out.print("Type Second number : ");
     
        int b = sc.nextInt();
        System.out.println("Sum: " + (a+b));
        sc.close();
    }
}