public class saveinrevse {
    public static void main(String[] args) {
        long n = 1234567809;
        long rev = 0;
        while(n>0){
            long lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n/10;
        }
        System.out.println(rev);
    }   
}
