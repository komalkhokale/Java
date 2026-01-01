import java.util.*;

public class PracticeQuestions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Question 1: In a program, input 3 numbers : A, B and C. You have to output
        // the average of these 3 numbers

        // System.out.println("Enter a first number: ");
        // int a = sc.nextInt();

        // System.out.println("Enter a Second Number: ");
        // int b = sc.nextInt();

        // System.out.println("Enter a Third Number: ");
        // int c = sc.nextInt();

        // int avg = (a + b + c) / 3;

        // System.out.println("The Average of this numbers: " + avg);

        // Question 2: In a program, input the side of a square. You have to output the
        // area of the square

        // System.out.println("Enter a side of square: ");

        // int side = sc.nextInt();

        // int area = side * side;

        // System.out.println("The area of square is: " + area);

        // int $ = 24;
        // System.out.println($);

        // Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        // an eraser. You have to output the total cost of the items back to the user as their bill.
        // (Add on : You can also try adding 18% gst tax to the items in the bill.

        System.out.println("Enter a price of pen: ");
        float pen = sc.nextFloat();

        System.out.println("Enter a price of pencil: ");
        float pencil = sc.nextFloat();

        System.out.println("Enter a price of eraser: ");
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;

        System.out.println("Your Total price is: " + total);

        float newTotal = 0.18f + total;

        System.out.println("After adding the 18% of GST Your total price is: " + newTotal);

    }
}
