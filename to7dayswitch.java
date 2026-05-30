import java.util.*;
public class to7dayswitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day in number : ");
        char number = sc.next().charAt(0);
        switch(number){
            case '1' : System.out.println("Sunday");
                        break;
            case '2' : System.out.println("Monday");
                        break;
            case '3' : System.out.println("Tuesdau");
                        break;
            case '4' : System.out.println("Wednesday");
                        break;
            case '5' : System.out.println("Thusrsday");
                        break;
            case '6' : System.out.println("Friday");
                        break;
            case '7' : System.out.println("Saturday");
                        break;
            default : System.out.println("haha anything");
        }
    }
    
}
