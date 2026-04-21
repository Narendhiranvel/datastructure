package recursionAndBacktracking;

public class PrintTables {

    public static void multiplicationTable(int table, int multiplesUpto) {
        if (multiplesUpto == 0) {
            return;
        }
        int tableValue = table * multiplesUpto;
        multiplicationTable(table, multiplesUpto - 1);

        System.out.println(tableValue);
    }

    public static void main(String[] args) {
        int table = 5;
        int multiplesUpto = 10;

        multiplicationTable(table, multiplesUpto);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)
