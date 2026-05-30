import java.util.*;
public class evenodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no : ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("Even number ");
        }
        else{
            System.out.println("odd number");
        }
    }
}