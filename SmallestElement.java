import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

System.out.println("No of elements in array: ");
int n = sc.nextInt();

int arr[] = new int[n];

    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    int small = 10000000;

    for(int i = 0; i <n ; i++){
        if(arr[i]<small){
            small = arr[i];
        }
    }
System.out.println("Smallest Element in Java: "+ small);
sc.close();
    }
}
