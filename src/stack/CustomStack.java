package stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
        //calling a constructor within a constructor
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val) throws Exception{
        if(isFull()){
            throw new Exception("Cannot insert in a Full Stack");
        }
        top++;
        data[top] = val;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot remove from an empty Stack");
        }
        return data[top--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty Stack");
        }
        return data[top];
    }

    boolean isFull(){
        return top == data.length-1;
    }

    boolean isEmpty(){
        return top == -1;
    }
}
