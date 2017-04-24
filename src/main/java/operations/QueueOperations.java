package operations;

/**
 * Created by Ekeocha-mac on 4/19/17.
 */
public interface QueueOperations {

    /**
     * Empty IntegerQueue Message
     */
    static final String INTEGER_QUEUE_EMPTY_MESSAGE = "The IntegerQueue is Empty!!";

    /**
     * Remove an element from the Queue
     * @return int
     */
    public int dequeue();

    /**
     * Place an element in the Queue
     * @param item
     */
    public void enqueue(int item);

    /**
     * Check if the Queue is empty
     * @return boolean
     */
    public boolean isEmpty();

    /**
     * Return the element at the head of the Queue
     * @return int
     */
    public int peek();

    /**
     * Gets size of Queue
     * @return
     */
    public int size();

    /**
     * Gets item at specified index
     * @param index
     * @return
     */
    public int get(int index);
}
