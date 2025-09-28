package Array;

//Equilibrium Index (left sum = right sum)
//Input: [1,7,3,6,5,6]
//Output: Index = 3

public class EquilibriumIndexOp {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int equilibriumIndex = -1;
        int totalSum = 0;
        int leftSum = 0;

        for (int sum : arr) {
            totalSum += sum;
        }

        System.out.println("Total sum Value of array " + totalSum);

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }
            leftSum += arr[i];
        }
        if (equilibriumIndex == -1) {
            System.out.println("No equilibrium index found");
        } else {
            System.out.println("Equilibrium Index: " + equilibriumIndex);
        }
    }
}
