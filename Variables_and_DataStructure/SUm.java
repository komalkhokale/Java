import java.util.*;

public class SUm {
    public static void main(String[] args) {
        // int a = 22;
        // int b = 12;
        // int sum = a + b;

        // System.out.println(sum);

        // Scanner sc = new Scanner(System.in);

        // int a;
        // int b;

        // System.out.println("Enter first Number: ");
        // a = sc.nextInt();

        // System.out.println("Enter second Number: ");
        // b = sc.nextInt();

        // // int sum = a + b;
        // int pro = a * b;

        // System.out.println("The Sum is : " + pro);

        // Area of circle

        float pi = 3.14f  ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value of Radius to calculate the area of circle: ");

        float r = sc.nextFloat();

        float area = pi * r * r;

        System.out.println("Area of circle is: " + area);
    }
}
