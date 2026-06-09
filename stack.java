import java.util.Stack;

public class stack {

    // A stack is LIFO data structure Last in First out
    // .push to add
    // .pop to remove and return value

    static Stack<String> stack = new Stack<>();
    public static void main(String[] args) {
        addMultiple("urmom");

        for (int i = 0; i < stack.capacity(); i++) {
            System.out.println(stack.pop());
        }
    }

    static void addMultiple (String s) {
        for(int i = 0; i < 5; i++) {
            stack.push(s);
        }
        System.out.println("All added to stack");
    }
}