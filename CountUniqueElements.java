import java.util.Scanner;

public class CountUniqueElements {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter Size of Array: ");

int n = sc.nextInt();
int arr[] = new int[n];

for(int i = 0 ; i<n ; i++){
    arr[i] = sc.nextInt();
}

int uniques = 0;

for(int i = 0 ; i<n ; i++){
    boolean unique = true;
    for(int j = i+1 ; j<n ; j++){
        if(arr[j]==arr[i]){
            unique = false;
            break;
        }
    }
    if(unique){
      uniques++;  
    }
}


System.out.println("No of Unique Numbers in Array: "+uniques);
sc.close();

    }
}
