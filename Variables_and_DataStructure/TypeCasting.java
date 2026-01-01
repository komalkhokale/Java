public class TypeCasting {
    public static void main(String[] args) {

        // This is type conversion
        // This is correct
        // int a = 25;
        // long b = a;

        // This is wrong
        // long a = 3;
        // int b = a;

        // This is Type Casting forcefully do it loss data

        // int marks = (int)(90.899f);
        // System.out.println(marks);

        // char ch = 'k';
        // char ch2 = 'l';
        // int num = ch;
        // int num2 = ch2;
        // System.out.println(num);
        // System.out.println(num2);

        // Type promotion

        // char a = 'a';
        // char b = 'b';

        // System.out.println((int)(a));
        // System.out.println((int)(b));

        // System.out.println(b-a);

        // short a = 32;
        // byte b = 43;
        // char c = 'c';

        // byte bt = (byte)(a + b + c);
        // System.out.println(bt);

        int a = 10; 
        float b = 32.90f;
        long c =32;
        double d = 232;
        double ans = a + b + c + d;
        System.out.println(ans);
    } 
}
