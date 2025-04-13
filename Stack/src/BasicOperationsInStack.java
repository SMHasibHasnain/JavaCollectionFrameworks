import java.util.Stack;

public class BasicOperationsInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.push(6));
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        
        System.out.println(stack);
        System.out.println(stack.search(2));

    }
}
