class linearSearch{
    public static void main(String[] args){
        int[] arr={1,4,2,6,11,-1,90};
        int terget=4;
        System.out.println("Index :"+search(arr,terget));
        System.out.println("Exists :"+search2(arr,4));
    }

    //Search and return the index of the element 
    static int search(int[] arr,int target){
        if(arr.length==0){
           return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //Check if the element is present in the array or not
    static boolean search2(int[] arr,int target){
        if(arr.length==0){
           return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
