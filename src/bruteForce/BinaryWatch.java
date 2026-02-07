package bruteForce;
//https://leetcode.com/problems/binary-watch/

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    static class Solution {
        public List<String> readBinaryWatch(int turnedOn) {
            List<String> result = new ArrayList<>();

            for (int hour = 0; hour < 12; hour++) {
                for (int min = 0; min < 60; min++) {
                    int bits = Integer.bitCount(hour) + Integer.bitCount(min);
                    if (bits == turnedOn) {
                        result.add(hour + ":" + String.format("%02d", min));
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int turnedOn = 3; // sample input
        List<String> times = s.readBinaryWatch(turnedOn);

        System.out.println("Times with " + turnedOn + " LEDs on:");
        for (String time : times) {
            System.out.println(time);
        }
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
