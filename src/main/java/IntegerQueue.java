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
            return linkedList.getFirst();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("The IntegerQueue is Empty!!");
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
        return linkedList.peek();
    }

    @Override
    public String toString() {
        return "IntegerQueue{" +
                "linkedList=" + linkedList +
                '}';
    }
}
