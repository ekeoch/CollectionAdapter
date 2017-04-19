/**
 * Created by Ekeocha-mac on 4/19/17.
 */
public interface QueueOperations {
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
}
