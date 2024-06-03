import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping...");
        System.out.println("A : "+a+" and B : "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping...");
        System.out.println("A : "+a+" and B : "+b);
    }
}
