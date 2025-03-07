package myApp;


import myApp.MediumProblem_2.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        //////////////////////////Medium problem #2 push to the bottom///////////////
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.insertAtBottom(22);
        System.out.println("=====================================");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            ////////////////////////////////////////////////////////////////////////////////////////////



        }}
}