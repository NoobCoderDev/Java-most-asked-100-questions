import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        
        System.out.print("Enter second number : ");
        int y = sc.nextInt();

        int add = x+y;
        System.out.println("Addition of two numbers is : "+add);
    }
}
