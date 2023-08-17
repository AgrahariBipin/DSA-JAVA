
public class infiniteArray {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 8, 12, 45 };
        int target = 1;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp=end;
            end=end+(end-start+1)*2;
            start=temp;
            
        }
        int a=binary( start, end, arr,target);
        return a;
    }

    static int binary(int start,int end,int[] arr,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]<target){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        
        
        return -1;
    }
}