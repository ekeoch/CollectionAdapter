package operations.adapters;

import operations.QueueOperations;
import operations.operationsImpl.IntegerStack;
import operations.utils.Utilities;

import java.util.NoSuchElementException;


/**
 * Created by Ekeocha-mac on 4/19/17.
 */
public class StackAdapter implements QueueOperations {

    /**
     * Base operations.operationsImpl.IntegerStack from which Adapter reads
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
            return integerStack.get(0, true);
        } catch(IndexOutOfBoundsException e){
            throw new NoSuchElementException(INTEGER_QUEUE_EMPTY_MESSAGE);
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
        return integerStack.isEmpty();
    }

    /**
     * return the bottom item in the stack without removing it
     * @return
     */
    public int peek() {

        try{
            return integerStack.get(0,false);
        }catch(IndexOutOfBoundsException e){
            throw new NoSuchElementException(INTEGER_QUEUE_EMPTY_MESSAGE);
        }

    }

    /**
     * Gets the size of the Queue
     * @return  int
     */
    public int size(){
        return integerStack.size();
    }

    /**
     * Gets the item at the specified index
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    public int get(int index) throws IndexOutOfBoundsException{
        return integerStack.get(index, false);
    }

    @Override
    public String toString() {
        return Utilities.queueOperationsToString(this);
    }
}
