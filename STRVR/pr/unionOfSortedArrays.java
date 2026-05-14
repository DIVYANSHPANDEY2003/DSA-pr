
// import java.util.*;

import java.util.ArrayList;

public class unionOfSortedArrays {
// //    ************ BRUTE FORCE APPROACH************

//     public static ArrayList<Integer> UnionOfArrays(int arr1[], int arr2[]) {
//         HashSet<Integer> set = new HashSet<>();

//         for (int nums : arr1) {
//             set.add(nums);
//         }

//         for (int nums : arr2) {
//             set.add(nums);
//         }
//         ArrayList<Integer> union = new ArrayList<>(set);
//         Collections.sort(union);
//         return union;


//     }

//     public static void main(String[] args) {
//         int arr1[] = {1, 2, 3, 4, 5, 6};
//         int arr2[] = {2, 3, 4, 5, 6, 7};
//         ArrayList<Integer> union = UnionOfArrays(arr1, arr2);
//         System.out.println("union: ");
//         for (int nums : union) {
//             System.out.println(nums + " ");
//         }

//     }

// *************OPTIMAL SOLUTION ---> Two Pointer Approach *********

public static void union(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            } else { // arr1[i] == arr2[j]
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < arr1.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        // Print result
        System.out.print("Union: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4, 5};
        int arr2[] = {2, 3, 5, 6, 7};

        union(arr1 ,arr2);
    }
}


