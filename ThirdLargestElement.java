
import java.util.Scanner;

public class ThirdLargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[0];
        int thirdLargest = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondLargest && arr[i] < largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }

            else if (arr[i] > thirdLargest && arr[i] < secondLargest) {
                thirdLargest = arr[i];
            }
        }

        if (largest == secondLargest || secondLargest == thirdLargest) {
            System.out.println("Third largest does not exist");
        } else {
            System.out.println("Third Largest Element: " + thirdLargest);
        }

        sc.close();
    }
}
