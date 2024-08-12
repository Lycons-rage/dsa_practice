package stack;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(size)
    }

    public boolean push(int val) throws Exception {
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length*2];

            // copy the content of data to temp
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        super.push(val);
        return true;
    }
}
