public class reveseofnumber {
    public static void main(String[] args) {
        int n =  123456789;
        int lastdigit;
        while(n>0){
            lastdigit = n%10;
            n = n/10;
            System.out.print(lastdigit);

        }
    }    
}
