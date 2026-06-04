public class break1 {
    public static void main(String[] args) {
        for(int i = 1;i<=123;i=i+2){
            if(i==7){
                break;
            }
            System.out.println(i);
        }
        System.out.println("out of the loop");
    }    
}
