package operations;

/**
 * Created by Ekeocha-mac on 4/19/17.
 */
public interface StackOperations {

    /**
     * Empty operations.operationsImpl.IntegerStack Message
     */
    static final String INTEGER_STACK_EMPTY_MESSAGE = "The operations.operationsImpl.IntegerStack is Empty!!";

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
