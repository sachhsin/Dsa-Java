public class palindrome {
    public static void main(String[] args) {
        int n = 128;
        int rev = 0;
        int original = n;
        while(n>0){
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n/10;
            }
            if(rev  == original){
                System.out.println("palindroem");            
            }
            else{
                System.out.println("not palindrome");
            }
           
            
        }
        
    }
    

