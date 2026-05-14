public class LowerBoundAndUpperBound {

    // lowerBound: first index where arr[i] >= target
    public static int lowerBound(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length; // default if not found

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // upperBound: first index where arr[i] > target
    public static int upperBound(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length; // default if not found

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 8, 8, 10, 10, 11};

        int target = 4;

        int lb = lowerBound(arr, target);
        int ub = upperBound(arr, target);

        System.out.println("Lower Bound of " + target + " = " + lb);
        System.out.println("Upper Bound of " + target + " = " + ub);
    }
}
