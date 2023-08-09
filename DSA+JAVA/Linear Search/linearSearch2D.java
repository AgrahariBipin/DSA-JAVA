
import java.util.*;

class linearSearch2D{
    public static void main(String[] args){
        int[][]arr={
            {1,34,6,0},
            {25,45,7},
            {2,56}
        };
        int target=7;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(search2(arr,56));
    }
    static int[] search(int[][]arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    
                    return new int[]{row,col};
                   
                }
            }
        }
        return new int[] {-1,-1};
    }
    static boolean search2(int[][]arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }
}