package bruteForce;

//Prefix Sum for range queries
//Input: arr = [2,4,5,7,8], query = (1,3)
//Output: 4+5+7 = 16

public class PrefixSumBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8};

        System.out.println(query(arr, 1, 3)); // 16
        System.out.println(query(arr, 0, 4)); // 26
        System.out.println(query(arr, 2, 2)); // 5
    }

    private static int query(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}

//Time per query: O(n) (bad if many queries).
//Space: O(1).