import java.util.HashMap;
import java.util.Map;

public class Set_Matrix_zeroes{
    //Leetcode Problem 73: Set Matrix Zeroes
    public void setZeroes(int[][] matrix) {
        //Using Brute Force Approach
        HashMap<Integer,Integer> rowmap= new HashMap<>();
        HashMap<Integer,Integer> colmap= new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(!rowmap.containsKey(i)){
                        rowmap.put(i,1);
                    }
                    else{
                        rowmap.put(i,rowmap.get(i)+1);
                    }
                    if(!colmap.containsKey(j)){
                        colmap.put(j,1);
                    }
                    else{
                        colmap.put(j,colmap.get(j)+1);
                    }
                    
                
                }
            }
        }
        for(Map.Entry e:rowmap.entrySet()){
            int i=(int)e.getKey();
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=0;
            }
        }
        for(Map.Entry e:colmap.entrySet()){
            int j=(int)e.getKey();
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=0;
            }
        }
        System.out.println( matrix);
    }
}
