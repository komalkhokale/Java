public class Q2_For_ReverseNum {
    public static void main(String[] args) {
        int n = 123;

        // for(int i=n; i>0; i++){
        //     int lastDigit  = n % 10;
        //     System.out.println(lastDigit);
        //     n = n / 10;
        // }

        while (n > 0) {
            int lastDigit =  n % 10;
            System.out.print (lastDigit);
            n = n / 10;
        }
    }
}
