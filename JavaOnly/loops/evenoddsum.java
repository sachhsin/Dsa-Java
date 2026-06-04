public class evenoddsum {
    public static void main(String[] args) {
        int n = 1122;
        int evsum = 0;
        int oddsum = 0;
        while(n>0){
            int lastdigit = n%10;
            if(lastdigit%2 == 0){
                evsum+=lastdigit;
                
            }else{
                if(lastdigit%2 != 0){
                    oddsum+=lastdigit;
                }
            }n = n/10;

        }System.out.println("Even integer sum is : " + evsum);
        System.out.println("odd integer sum is : " + oddsum);
    }
    
}
