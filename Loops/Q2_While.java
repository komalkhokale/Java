import java.util.Scanner;

public class Q2_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int n = sc.nextInt();

        int sum = 0;
        int counter = 1;

        while(counter <= n){
            sum += counter;
            counter ++;
        }
        System.out.println("The Sum of " + n + " is: " + sum);
    }
}
