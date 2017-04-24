package operations.utils;

import operations.adapters.StackAdapter;
import operations.operationsImpl.IntegerQueue;
import operations.operationsImpl.IntegerStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Ekeocha-mac on 4/24/17.
 */
public class TestUtilities {

    @Test
    public void testEmptyIntegerQueueToString(){
        assertEquals("front [ ] back\t(empty queue)", Utilities.queueOperationsToString(new IntegerQueue()));
    }

    @Test
    public void testNonEmptyIntegerQueueToString(){
        IntegerQueue integerQueue = new IntegerQueue();
        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);

        assertEquals("front: 0 back: 2\n" +
                "front [ 1 2 3 ] back", integerQueue.toString());

        IntegerStack integerStack = new IntegerStack();
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);

        StackAdapter stackAdapter = new StackAdapter(integerStack);

        assertEquals("front: 0 back: 2\n" +
                "front [ 4 5 6 ] back", stackAdapter.toString());
    }
}
