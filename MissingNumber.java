
import java.util.Scanner;
public class MissingNumber {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("No of elements in array: ");
        int n = sc.nextInt();
 
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
     int y = arr.length;
int expsum = y*(y+1)/2;

int sum = 0;
     for(int i = 0 ; i<n ; i++){
         sum = arr[i]+ sum;
     }
int missno = expsum - sum;
 System.out.println(missno);
     sc.close();
    }
}