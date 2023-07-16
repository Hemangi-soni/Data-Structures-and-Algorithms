import java.util.Scanner;
public class ceiling {
    public static void main(String args[])throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=input.nextInt();
        int[] array=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            array[i]=input.nextInt();
        }
        System.out.println("Enter target element:");
        int target=input.nextInt();
        int ans=findceiling(array,target);
        System.out.println("Ceiling of the target number is at index: "+ans);
        
    }
    public static int findceiling(int[] array,int target){
        if(target >array[array.length-1]){
            return -1;
        }

        int start=0;
        int end =array.length-1;


       
        while(start<=end){
            int mid=start+(end-start)/2;
            
            
            if(target<array[mid]){
                end=mid-1;

            }
            else if(target>array[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
