import java.util.Scanner;

public class SecondLargestElement {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);

System.out.println("No of elements in array: ");
int n = sc.nextInt();

int arr[] = new int[n];

    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    int largest = arr[0];
    int secondlargest = arr[0];

    for(int i = 1 ; i<n ; i++){
        if(arr[i]>largest){
            secondlargest = largest;
            largest = arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]<largest){
            secondlargest = arr[i];
        }
    }
if(secondlargest==largest){
    System.out.println("second largest does not exist");
}
else{
    System.out.println("Second largest element is "+ secondlargest);
}



sc.close();
    }

}

