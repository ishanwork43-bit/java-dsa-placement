
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("No of elements in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Element to be searched:");
        int target = sc.nextInt();

        int search = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                search = i;
                break;
            }
        }

        if (search != -1) {
            System.out.println("Element found at index: " + search);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
