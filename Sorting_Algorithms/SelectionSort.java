import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        int [] arr=new int[]{12,15,43,23,4,67,64,2,1};
        int max=arr[0];
        int temp=0;
        int index=0;
        int k=arr.length-1;
        while(k>0){
            // System.out.println("k="+k);
            for(int i=0;i<=k;i++){
                if(arr[i]>max){
                    max=arr[i];
                    index=i;

                }
            }
            // System.out.println("max="+max);
            // System.out.println("index="+index);
            temp=arr[k];
            // System.out.println("temp="+temp);
            arr[k]=arr[index];
            arr[index]=temp;
            max=arr[0];
            index=0;
            // System.out.println(Arrays.toString(arr));
            k--;
        }
        
    System.out.println(Arrays.toString(arr));
    }
}
