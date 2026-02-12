package recursionAndBacktracking;
//https://www.geeksforgeeks.org/dsa/powet-set-lexicographic-order/

import java.util.*;

public class PowerSetLexicographic {

    public static void main(String[] args) {

        Solution sol = new Solution();
        String input = "abc";   // change input here
        List<String> result = sol.powerSet(input);

        // print result to verify your logic
        for (String s : result) {
            System.out.println(s);
        }
    }
}

class Solution {

    public List<String> powerSet(String s) {
        List<String> result = new ArrayList<>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        backtrack(arr, 0, new StringBuilder(""), result);
        return result;
    }

    public void backtrack(char[] arr, int start, StringBuilder current, List<String> result) {
        for (int i = start; i < arr.length; i++) {
            current.append(arr[i]);
            result.add(current.toString());
            System.out.println("i=" + i + " start=" + start + " current=" + current);
            backtrack(arr, i + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}

