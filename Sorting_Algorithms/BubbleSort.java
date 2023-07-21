import java.util.Arrays;
public class BubbleSort{

    public static void main(String[] args){
        int [] arr=new int[]{10,9,4,12,27,65,45,34};
        System.out.println(Arrays.toString(bubble(arr)));

    }
    static int [] bubble(int [] arr){
        boolean swapped=false;
        for(int i=0;i<arr.length-1;i++){

            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] = temp;

                    swapped=true;
                }
            }
            if(!swapped){
            break;
        }
        }
        
        return arr;
    }
}