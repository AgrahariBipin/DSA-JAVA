public class NextGreatestInString {
    public static void main(String[] args) {
        char[] arr={'a','e','t','v','w'};
        char target='z';
        System.out.println(NextGreatest(arr,target));
    }

    static char NextGreatest(char[]arr,char target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start%arr.length];
    }
}
