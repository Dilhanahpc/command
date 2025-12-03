import ds.Stack;

public class Stacktest  {

    public static void main(String[] args) {
        Stack stack=new Stack();
        System.out.println(stack.empty());
        stack.push(10);
        System.out.println(stack.empty());
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();





    }
}
