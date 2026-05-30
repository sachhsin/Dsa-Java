import java.util.*;
public class gstq {
    public static void main(String args[]){
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the rate of Pencil : ");
        float pencil = var1.nextFloat();
        System.out.print("Enter the rate of Pen : ");
        float pen = var1.nextFloat();
        System.out.print("Enter the rate of eraser : ");
        float eraser = var1.nextFloat();
        float total = (pencil+eraser+pen);
        System.out.println("Total price of these three items : " + total);
        float newtotal = total + (0.18f*total);
        System.out.println("Total price with 18% gst : " + newtotal);
    }
    
}
