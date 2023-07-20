public class rotationcount {
    public static void main(String[] args){
        int [] arr={5,6,7,8,9,10,11,12,13,14,15,0,1,2,3,4};
        int ans=pivot(arr);
        System.out.println(ans+1);
    }
    static int pivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
