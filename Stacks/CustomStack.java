public class CustomStack{
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    
    int ptr=-1;
    
    public CustomStack(int size){
        this.data=new int[size];
    }
    
    
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public boolean isFull(){

        return ptr==data.length -1;//ptr is at last index
    }
    private boolean isEmpty(){
        return ptr== -1;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        // int removed=data[ptr];
        // ptr=ptr-1;
        return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return data[ptr];
    }


}