import java.util.*;
public class incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your income : ");
        int a = sc.nextInt();
        if(a<=500000){
            System.out.println("0% tax on income less then 5L " );
           
        }
        else if(a>=500000 && a<=1000000 ){
            System.out.println("20% tax on income b/w 5L to 10L");
             System.out.println("Total tax is : " + (a*0.2f));
        }
        else{
            System.out.println("30% tax on income above 10L");
             System.out.println("Total tax is : " + (a*0.3f));
        }
    }
    
}
