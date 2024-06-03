import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name : ");
            String name = sc.next();
            System.out.println("Your name is : "+name);


            System.out.print("Enter your surname : ");
            String Surname = sc.next();
            System.out.println("Your Surname is : "+Surname);

    }
}
