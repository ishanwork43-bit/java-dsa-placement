import java.util.Scanner;

public class LongestConsecutiveIncreasingStreak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Longest Increasing Streak: " + maxCount);

        sc.close();
    }
}