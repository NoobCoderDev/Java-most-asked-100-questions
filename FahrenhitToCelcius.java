import java.util.Scanner;

public class FahrenhitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenhit (F) to convert in Celcius (C) :  ");
        float f = sc.nextFloat();

        double C = (5.0 / 9.0) * (f - 32);
        System.out.println("Celcius is : "+C+" C.");
        
    }
}
