import java.util.*;
public class sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int m = sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) { 
            arr[i] = sc.nextInt();
        }/* 
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m-i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Ascending array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m-i-1 ; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Decending array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }*/
        boolean count = false;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Dulicate element is : "+arr[i]);
                    count = true;
                    break;
                }
            }
        }
        if(!count){
            System.out.println("No duplicate elements found");
        }
        sc.close();
    }
}