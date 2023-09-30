class BinarySearch{   //time complexity log2n
    public static void main(String[] args){
        int[] arr={1,4,8,10,11,90,200};
        int target=10;
        System.out.println(search(arr,target));
    }
    
    static int search(int[] arr,int target){     //for ascending array
        int start=0;
        int end=arr.length-1;

        if(arr.length==0){
            return -1;
        }
        while(start<=end){
            int mid=(start+end)/2;
           
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
      
