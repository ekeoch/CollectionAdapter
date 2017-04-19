import java.util.NoSuchElementException;

/**
 * Created by Ekeocha-mac on 4/19/17.
 */
public class StackAdapter implements QueueOperations {

    /**
     * Base IntegerStack from which Adapter reads
     */
    private IntegerStack integerStack;

    /**
     * Initialize the StackAdapter
     * @param integerStack
     */
    public StackAdapter(IntegerStack integerStack){
       this.integerStack = integerStack;
    }

    /**
     * retrieve and remove the first stack item
     * @return first int item
     * @throws NoSuchElementException
     */
    public int dequeue() {
        try{
            return integerStack.pop();
        } catch(NoSuchElementException e){
            throw new NoSuchElementException("The IntegerQueue is Empty!!");
        }
    }

    /**
     * Add item to the base stack
     * @param item
     */
    public void enqueue(int item) {
       integerStack.push(item);
    }

    /**
     * Check if base stack is empty
     * @return
     */
    public boolean isEmpty() {
        return true;
    }

    public int peek() {
        return 0;
    }
}
