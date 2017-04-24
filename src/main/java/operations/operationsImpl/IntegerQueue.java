package operations.operationsImpl;

import operations.QueueOperations;
import operations.utils.Utilities;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Ekeocha-mac on 4/19/17.
 */
public class IntegerQueue implements QueueOperations {

    /**
     * Base linkedList to contain IntegerQueue
     */
    private LinkedList<Integer> linkedList;

    /**
     * Initialize IntegerQueue
     */
    public IntegerQueue(){
        this.linkedList = new LinkedList<Integer>();
    }

    /**
     * Removes and returns the first item on the Queue
     * @return the first item on the Queue. Throws RuntimeException if the Queue is empty
     * @throws NoSuchElementException
     */
    public int dequeue() {
        try{
            return linkedList.removeFirst();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(INTEGER_QUEUE_EMPTY_MESSAGE);
        }
    }

    /**
     * Add item to the base of the IntegerQueue/LinkedList
     * @param item
     */
    public void enqueue(int item) {
        linkedList.add(item);
    }

    /**
     * Checks if the base list is empty
     * @return true if empty
     */
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    /**
     * returns the first item of the Queue without removing it
     * @return the first item on the Queue
     */
    public int peek() {
        if(isEmpty()) throw new NoSuchElementException(INTEGER_QUEUE_EMPTY_MESSAGE);
        return linkedList.peek();
    }

    /**
     * Gets the size of the Queue
     * @return  int
     */
    public int size(){
       return linkedList.size();
    }

    /**
     * Gets the item at the specified index
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    public int get(int index) throws IndexOutOfBoundsException{
       return linkedList.get(index);
    }

    @Override
    public String toString() {
        return Utilities.queueOperationsToString(this);
    }
}
