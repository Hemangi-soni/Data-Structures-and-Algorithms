import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arr_size=input.nextInt();
        
        int arr[]=new int[arr_size];
        System.out.println("Enter the array elements:");
        for (int i=0; i<arr_size; i++){
            System.out.print("Element " + i+": ");
            arr[i]=input.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target=input.nextInt();
        int ans=linearSearch(arr, target);
        System.out.println("The target element "+target+" is at the index " + ans);

    }

    static int linearSearch(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        
        }  
        return -1;
    }
}

