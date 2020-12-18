import java.util.Stack;

public class Stacks {
    public static void main(String[] args){

        //------- LIFO MANNER ------//
        Stack<Integer> stack= new Stack<>();

        stack.add(4);
        stack.push(56);
        stack.push(24);
        stack.add(76);

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        //Element at top of stack has got the index value one
        System.out.println(stack.search(24));

        System.out.println(stack);
    }
}
