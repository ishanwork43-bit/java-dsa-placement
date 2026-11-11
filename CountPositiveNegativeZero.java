import java.util.Scanner;

public class CountPositiveNegativeZero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size: ");

        int n = sc.nextInt();
        int arr[] = new int [n];
        
        for(int i = 0 ; i<n ; i++){
             arr[i] = sc.nextInt();
        }

      int positive = 0 ; 
      int negative = 0 ; 
      int zero = 0; 

    for(int i = 0 ; i<n ; i++){
        if(arr[i]>0){
            positive++;
        }
    }
     for(int i = 0 ; i<n ; i++){
        if(arr[i]<0){
            negative++;
        }
    }
         for(int i = 0 ; i<n ; i++){
        if(arr[i]==0){
            zero++;
        }
    }

    System.out.println("Count of Positive Number: "+ positive);
    System.out.println("Count of Negative Number: " + negative);
    System.out.println("Count of zeros: " + zero);
    sc.close();
        
    }
}
