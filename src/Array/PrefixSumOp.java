package Array;

//Prefix Sum for range queries
//Input: arr = [2,4,5,7,8], query = (1,3)
//Output: 4+5+7 = 16

public class PrefixSumOp {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println(query(prefix, 1, 3)); // 16
        System.out.println(query(prefix, 0, 4)); // 26
        System.out.println(query(prefix, 2, 2)); // 5
    }

    private static int query(int[] prefix, int L, int R) {
        if (L == 0) return prefix[R];
        return prefix[R] - prefix[L - 1];
    }
}

//Preprocessing: O(n) (build prefix array once).
//Time per query: O(1).
//Space: O(n).
