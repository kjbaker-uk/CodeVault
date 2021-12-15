
/**
 *
 * @author Dilshan
 */
public class stacks {
    
    public static void main(String ar[]){
        
        StackX myStack = new StackX(10);
        myStack.push(10);
        myStack.push(50);
        myStack.push(12);
        myStack.push(70);
        
        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
            System.out.println("");
        }
    }
}
class StackX {
    
    private double[] stackArray;
    private int maxSize;
    private int top;
    
    public StackX(int s){
      maxSize = s;
      stackArray = new double[maxSize];
      top = -1;
    }
    
    public void push(double j){
        if(top == (maxSize-1)){
            System.out.println("Stack Is Full");
        }
        else{
            top = top + 1;
            stackArray[top] = j;
        }
    }
    
    public double pop(){
        if(top == -1){
            System.out.println("Stack Is Empty");
            return 999; 
        }
        else{
           return stackArray[top--];
        }
    }
    
    public double peek(){
        if(top == -1){
            System.out.println("Stack Is Empty");
            return 999; 
        }
        else{
            return stackArray[top];
        }
    }
    
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull(){
        if(top == maxSize-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}