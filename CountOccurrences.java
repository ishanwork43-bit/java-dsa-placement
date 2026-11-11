 import java.util.Scanner;
public class CountOccurrences {
public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size: ");

        int n = sc.nextInt();
        int arr[] = new int [n];
        
        for(int i = 0 ; i<n ; i++){
             arr[i] = sc.nextInt();
        }

 System.out.println("Target Number");
    int target = sc.nextInt();
int count = 0 ;
    for(int i =0 ; i<n ; i++){
        if(arr[i]==target){
            count++;
        }
    }
System.out.println("Occurrences of target: " + count);
 sc.close();
}

}
