import java.util.ArrayList;

public class interSection_ofArrays {
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else { // arr1[i] == arr2[j]
                // Avoid duplicates
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4, 5};
        int arr2[] = {2, 2, 3, 5, 6};

        ArrayList<Integer> ans = intersection(arr1, arr2);

        System.out.print("Intersection: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}