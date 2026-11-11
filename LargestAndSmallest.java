import java.util.Scanner;

public class LargestAndSmallest {
        public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);

System.out.println("No of elements in array: ");
int n = sc.nextInt();

int arr[] = new int[n];

    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    int largest = arr[0];

    for(int i = 0; i <n ; i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
    }
     int small = arr[0];

    for(int i = 0; i <n ; i++){
        if(arr[i]<small){
            small = arr[i];
        }
    }
System.out.println("Smallest Element in Java: "+ small);
System.out.println("Largest Element in Java: "+ largest);
sc.close();
    }

}
  
    
