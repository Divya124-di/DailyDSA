import java.util.Scanner;

public class convertNumIntoBinary {

    public static void convertBinary(String num){
       int decimal = Integer.parseInt(num);    // convert string into integer
      // String s = String.valueOf(int i);       int to string conversion
       String ans = "";
       int sum =0;
       while(decimal>0){
        //   ans = (decimal&1)+ ans;
        //   decimal = decimal>>1;

        // ans = (decimal%2) + ans;
        // decimal = decimal/2;

        sum += (decimal % 2);
        decimal = decimal/2;

       }
       System.out.println(sum);
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = sc.nextLine();
        //String binary = Integer.toBinaryString(num);  -- converts int num into String binary
        convertBinary(num);
    }
}
