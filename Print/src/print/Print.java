
package print;
import java.util.Scanner;


public class Print {

   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Create an array of the specified size
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the elements of the array
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Find out the even numbers from the array
        System.out.println("\nThe even numbers in the array are: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
      
    }
    
    

