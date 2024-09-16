//Fibonacci series
import java.util.*;

public class Que1 {

    public static int printFibo(int n){
      
       int a = 0;
       int b= 1;
       int c=0;
       if(n==0){
        return a;
       }
       for(int i=3; i<=n; i++){
        c = a+b;
        a = b; 
        b= c;
       }

       return c;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = printFibo(n);
    System.out.println(ans);
    
   } 


}
