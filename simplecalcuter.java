import java.util.*;
public class simplecalcuter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter operater : ");
        char operater = sc.next().charAt(0);
        switch(operater) {
            case '+' : System.out.println(a+b);
                    break;
            case '-' : System.out.println(a-b);
                    break;
            case '*' : System.out.println(a*b);
                    break;
            default : System.out.println("something is wrong"); 
        }

    }
}
