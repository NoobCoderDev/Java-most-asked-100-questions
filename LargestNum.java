import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter value at Index "+i+" : ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=0;i<size;i++){
                if(max < arr[i]){
                    int temp = arr[i];
                    arr[i] = max;
                    max = temp;
                }
        }
        System.out.println("Largest Number is : "+max);

    }
}
