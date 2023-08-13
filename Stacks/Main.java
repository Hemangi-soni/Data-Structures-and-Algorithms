public class Main {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack();
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
