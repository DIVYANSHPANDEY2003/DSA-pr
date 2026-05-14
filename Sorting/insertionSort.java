public class insertionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSortOfArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 78, 22, 11, 5, 4, 6, 55, 3, 28 };
        insertionSortOfArray(arr);
        printArray(arr);
    }
}
