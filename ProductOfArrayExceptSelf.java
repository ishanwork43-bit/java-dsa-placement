import java.util.*;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4};
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

       
        int leftProduct = 1;

        for (int i = 0; i < n; i++) {
            left[i] = leftProduct;
            leftProduct = leftProduct * arr[i];
        }

       
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            right[i] = rightProduct;
            rightProduct = rightProduct * arr[i];
        }

       
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }

        System.out.println(Arrays.toString(answer));
    }
}
