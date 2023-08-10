public class BinarySearchDesc {
    public static void main(String[] args) {
        int[] arr = { 500, 50, 5, 1, 0, -7 };
        int target = 50;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {  //in descending array
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
           
            if (arr[mid] > target) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
