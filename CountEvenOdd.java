import java.util.Scanner;

public class CountEvenOdd {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size: ");

        int n = sc.nextInt();
        int arr[] = new int [n];
        
        for(int i = 0 ; i<n ; i++){
             arr[i] = sc.nextInt();
        }

      int even = 0 ; 
      int odd = 0 ; 
       

    for(int i = 0 ; i<n ; i++){
        if(arr[i]%2==0){
            even++;
        }
    }
     for(int i = 0 ; i<n ; i++){
        if(arr[i]%2!=0){
            odd++;
        }
    }
       
    

    System.out.println("Count of Evem Number: "+ even);
    System.out.println("Count of Odd Number: " + odd);

        sc.close();
    }
}
