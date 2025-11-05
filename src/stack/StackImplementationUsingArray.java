package stack;

public class StackImplementationUsingArray {
    public int maxSize;
    public int[] stackArray;
    public int top;

    public StackImplementationUsingArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow!");
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void deleteStack() {
        top = -1;
        System.out.println("Stack has been deleted (logically).");
    }


    public static void main(String[] args) {
        StackImplementationUsingArray stack = new StackImplementationUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Size: " + stack.size());

        stack.deleteStack();
        System.out.println("Check stack isEmpty " + stack.isEmpty());

        stack.push(99);
        stack.push(201);
        stack.push(333);

        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Size: " + stack.size());
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
