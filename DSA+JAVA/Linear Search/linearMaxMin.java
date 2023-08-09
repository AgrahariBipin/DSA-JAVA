

class linearMaxMin{
    public static void main(String[] args){
        int[] arr={1,4,2,6,11,90,0};
       
        System.out.println("Maximum :"+max(arr));
        System.out.println("Minimum :"+min(arr));
    }

    static int max(int[] arr){
        int maxV=0;
        if(arr.length==0){
           return Integer.MAX_VALUE;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxV){
                 
                maxV=arr[i];
                
            }
        }
        return maxV;
    }

    static int min(int[] arr){
         int minV=0;
        if(arr.length==0){
           return Integer.MIN_VALUE;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minV){
                minV=arr[i];
            }
        }
        return minV;
    }
}