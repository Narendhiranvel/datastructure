package recursion;

public class CallTheRecursiveMethods {
    public static void main(String[] args) {
        firstMethod();
    }
    private static void firstMethod(){
        secondMethod();
        System.out.println("I am the first method");
    }
    private static void secondMethod(){
        thirdMethod();
        System.out.println("I am second method");
    }
    private static void thirdMethod(){
        fourthMethod();
        System.out.println("I am third method");
    }
    private static void fourthMethod(){
        System.out.println("I am fourth method");
    }
}

