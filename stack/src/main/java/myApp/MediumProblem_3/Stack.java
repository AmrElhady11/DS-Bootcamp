package myApp.MediumProblem_3;

public class Stack {
    private int top;
    private int[] stack;
    public Stack() {
        top = -1;
        stack = new int[10];
    }
    public Stack(int size) {
        top = -1;
        stack = new int[size];
    }

    private void increaseCapacity() {
        int[] newStack = new int[stack.length * 2];
        for(int i = 0; i < this.stack.length; i++)
            newStack[i] = this.stack[i];
        stack = newStack;
    }
    public void push(int data) {
    if(this.isFull())
        increaseCapacity();
    stack[++top] = data;
    }
    public int pop() {
        if(isEmpty())
            return -404;
        return stack[top--];
    }
    public int peek() {
        return stack[top];
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
    public boolean isFull(){
        if(top==stack.length-1)
            return true;
        return false;
    }
    public void print() {
        for(int x : stack)
            System.out.println(x);
    }
    public void insertAtBottom(int value){
        if(isEmpty()){
            push(value);
            return;
        }
        int x = pop();
        insertAtBottom(value);
        push(x);

    }

    public void revers(){
        if(isEmpty()){
            return;
        }
        int x = pop();
        revers();
        insertAtBottom(x);
    }


}
