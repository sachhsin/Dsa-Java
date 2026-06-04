public class armsstrong {
    public static void main(String[] args) {
        int n = 153;
        int sq = 0;
        int org = n;
        while(n>0){
            int lsd = n%10;
            sq = (lsd*lsd*lsd)+sq;
            n = n/10;
        }
        if(org == sq){
            System.out.println("armstrong");
        }else{
            System.out.println("not armsstrong");
        }
    }

}
