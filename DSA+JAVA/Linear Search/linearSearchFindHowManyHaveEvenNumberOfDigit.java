
class linearSearchFindHowManyHaveEvenNumberOfDigit {
    public static void main(String[] args) {
        int[] arr = { 1, 42, 611, -8, 9000, 85 };
        System.out.println(find(arr));
    }

    static int find(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i];
            }
            int digits = digit(arr[i]);
            if (even(digits)) {
                n++;
            }
        }
        return n;
    }

    static int digit(int num) {
        int count = 0;
        while (num > 0) {

            num = num / 10;
            count++;
        }
        return count;
    }

    static boolean even(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

}
