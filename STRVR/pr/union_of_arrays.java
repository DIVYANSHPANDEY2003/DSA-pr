import java.util.ArrayList;

public class union_of_arrays {

    public static int[] Union(int a1[], int a2[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int l1 = a1.length;
        int l2 = a2.length;
        int i = 0, j = 0;

        while (i < l1 && j < l2) {
            if (a1[i] < a2[j]) {
                if (res.isEmpty() || res.get(res.size() - 1) != a1[i]) {
                    res.add(a1[i]);
                }
                i++;
            } else if (a2[j] < a1[i]) {
                if (res.isEmpty() || res.get(res.size() - 1) != a2[j]) {
                    res.add(a2[j]);
                }
                j++;
            } else { 
                if (res.isEmpty() || res.get(res.size() - 1) != a1[i]) {
                    res.add(a1[i]);
                }
                i++;
                j++;
            }
        }

        
        while (i < l1) {
            if (res.isEmpty() || res.get(res.size() - 1) != a1[i]) {
                res.add(a1[i]);
            }
            i++;
        }

    
        while (j < l2) {
            if (res.isEmpty() || res.get(res.size() - 1) != a2[j]) {
                res.add(a2[j]);
            }
            j++;
        }

        
        int[] result = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            result[k] = res.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = { 2, 3, 4, 5, 5, 6 };
        int[] a2 = { 5, 6, 7, 8, 9, 10 };
        int[] union = Union(a1, a2);

        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
