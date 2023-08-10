public class FloorCeiling {
    public static void main(String[] args) {
        int[] arr={1,5,8,9,20,40};
        int target=10;
        System.out.println(ceiling(arr,target));
        System.out.println(floor(arr,target));
    }

    static int ceiling(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }

     static int floor(int[] arr,int target){
        if(target<arr[0]){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
