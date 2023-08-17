
public class frstAndLastOccurance{

    public static void main(String args[]){

        int[] arr= {1,4,5,5,5,7,9};
        int target=5;
       int[] a={-1,-1};
       a=an(arr,target);
       for(int i=0;i<2;i++){
        System.out.println(a[i]);
        }
      }
      
      
      static int[] an(int[] arr,int target){
          int[] ans={-1,-1};
          ans[0]=bin2(arr,target,1);
          ans[1]=bin2(arr,target,0);
          
          return ans;
      }
      
      static int bin2(int[] arr,int target,int isstart){
         
        int ans=-1;
          int start=0;
          int ends=arr.length-1;
          while(start<=ends){
              int mid=(start+ends)/2;
              if(arr[mid]<target){
                  start=mid+1;
              }
              else if(arr[mid]>target){
                  ends=mid-1;
              }
              else{
                  ans=mid;
                  if(isstart==1){
                      ends=mid-1;
                                        
                      
                      }
                  else{
                      start=mid+1;
                      
                  }
              }
          }
          
          return ans;
      }
      
}
