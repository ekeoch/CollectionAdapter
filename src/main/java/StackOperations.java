/**
 * Created by Ekeocha-mac on 4/19/17.
 */
public interface StackOperations {
    /**
     * Push an item onto the Stack
     * @param item
     */
    public void push(int item);

    /**
     * Pop an item off the Stack
     * @return int
     */
    public int pop();

    /**
     * Return the top item on the Stack
     * @return int
     */
    public int peek();

    /**
     * Return true if the Stack is empty, otherwise false
     * @return
     */
    public boolean isEmpty();
}
