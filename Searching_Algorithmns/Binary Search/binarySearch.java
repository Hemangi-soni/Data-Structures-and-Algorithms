import java.util.Scanner;
public class binarySearch{
    public static void main (String[] args) throws Exception{
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size=input.nextInt();
        System.out.println("Enter the array elements : ");
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target=input.nextInt();
        boolean order=checkorder(arr);
        
        int ans=binarysearch(arr, target,order);
            
    
        System.out.println("The target element is found at the index : "+ans);

    }
    public static boolean checkorder(int[] arr) {
        boolean result=false;
        if(arr[0]<arr[arr.length-1] || arr[0]==arr[arr.length-1]){
           result=true; 
        }
        
        return result;

    }
    public static int binarysearch(int []array, int target, boolean order){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[start]==array[end]){
                return mid;
            }
            if(array[mid]==target){
                return mid;
            }
            if(order){
                if(target>array[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>array[mid]){
                    end=mid-1;
                    
                }
                else{
                    start=mid+1;
                }
            }
            
            
            
        }
        return -1;


        

    }
}