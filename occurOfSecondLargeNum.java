import java.util.Scanner;

public class occurOfSecondLargeNum {
     public static int OccurOfSecLarNum(int arr[], int n){
      int num =0;
      int count = 0;
      for(int i=n-2; i>=0; i--){
        if(arr[i] != arr[i+1]){
            num = arr[i];
            break;
        }
      }

      for (int i = n-1; i >= 0; i--) {
          if (arr[i] == num) {
              count++;
          }
      }
      return count;

    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
   int ans =  OccurOfSecLarNum(arr, n);
   System.out.println(ans);
    
    
   } 
}
