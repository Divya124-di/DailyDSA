import java.util.Scanner;

public class secondLargest {

public static int Secondlargest(int arr[], int n){
    int lar = arr[0];
    int secLar = -1;
    for(int i=0; i<n; i++){
        if(arr[i]>lar){
            secLar = lar;
            lar = arr[i];
        }else if(arr[i]>secLar && arr[i]!=lar){
       secLar = arr[i];
        }
    }
    return secLar;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
        System.out.println(Secondlargest(arr, n));

    }
}
