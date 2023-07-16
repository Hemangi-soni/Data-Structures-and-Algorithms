import java.util.Scanner;

public class floor {
    public static void main(String [] args){
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
        int ans=findFloor(array,target);
        System.out.println("Floor of the target number is at index: "+ans);
    }
    public static int findFloor(int [] arr,int target){
        if(target> arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
