public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr={1,4,8,10,11,90,200};  Ascending order array
        int[] arr = { 500, 50, 5, 1, 0, -7 };   //   Descending order array
        int target = 0;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {    // If array is empty it return -1
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        boolean isasc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            if (isasc) {     //Search when array is in ascending order
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {      //Search when array is in descending order
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
