package recursionAndBacktracking;

public class PrintTheNumbers {
    public static void main(String[] args) {
        recursiveMethod(5);
    }
    private static void recursiveMethod(int n){
        if(n<1){
            System.out.println("n is less than 1");
        } else{
            recursiveMethod(n -1);
            System.out.println(n);
        }
    }
}
