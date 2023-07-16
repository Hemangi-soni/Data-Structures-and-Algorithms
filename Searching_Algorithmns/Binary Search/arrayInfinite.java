public class arrayInfinite {
    
    
        public static void main(String [] args){
            int [] array={1,3,5,7,9,23,25,26,28,34,36,47,68,77,89,90,100}; 
            int target=25;
            int answer=ans(array,target);
    
            System.out.println(answer);
            
    
            
        }
        public static int ans(int [] arr,int target){
            int start=0;
            int end=1;
            while(target>arr[end]){
                int temp=end;
                end=end+(end-start+1)*2;
                start=temp+1;
            }
            int ans= binarySearch(arr,target,start,end);
            return ans;
            
            
        }
        public static int binarySearch(int []arr, int target, int start, int end){
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
        
    

