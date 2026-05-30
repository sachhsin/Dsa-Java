import java.util.*;
public class largestof3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        if(a>=b && a>=c){ //yha se ye pta chl gya ki aa largest nhi h 
            System.out.println("First is greatest of all");
        }
        else if(b>=c){//yha pr b or c ke bich di dekh rhe h kyo pta pd gya h ki a chota h 
            System.out.println("second is greatest of all ");
        }
        else{
            System.out.println("third is greatest of all");
        }
    }
    
}
