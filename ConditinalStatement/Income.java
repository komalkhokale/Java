import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your income: ");
        int income = sc.nextInt();

        int tax = 0;

        if (income < 500000) {
            tax = 0;
            System.out.println("You have 0% Tax");
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);
            System.out.println("You have 20% tax :" +tax);
        }
        else{
            tax = (int) (income * 0.3);
            System.out.println("You have 30% tax :" + tax);
        }
    }
}
