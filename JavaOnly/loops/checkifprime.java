public class checkifprime {
    public static void main(String[] args) {
        int n = 13;
        int flag = 0;
        for(int i = 1; i<=n;i++){
            if(n%i == 0){
                flag++;
            }
        }
        System.out.println(flag);
        if(flag == 2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }
    
}
