package operations.adapters;

import operations.operationsImpl.IntegerStack;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekeocha-mac on 4/20/17.
 */
public class TestIntegerStackAdapter {
    private StackAdapter stackAdapter;

    @Before
    public void SetUp(){
        stackAdapter = new StackAdapter(new IntegerStack());
    }


    @Test(expected = NoSuchElementException.class)
    public void testPeekEmptyQueueException(){
        stackAdapter.peek();
    }

    @Test
    public void testPeekEmptyQueueExceptionMessage(){
        try{
            stackAdapter.peek();
        }catch(NoSuchElementException exception){
            assertEquals("The IntegerQueue is Empty!!", exception.getMessage());
        }
    }

    @Test
    public void testPeek(){
        stackAdapter.enqueue(2);
        assertEquals(2, stackAdapter.peek());
    }

    @Test
    public void testSingleEnqueue(){
        stackAdapter.enqueue(2);
        assertEquals(2, stackAdapter.peek());
    }

    @Test
    public void testMultipleEnqueues(){
        stackAdapter.enqueue(2);
        stackAdapter.enqueue(4);
        stackAdapter.enqueue(8);
        assertEquals(2, stackAdapter.peek());
    }


    @Test
    public void testLargeNumberOfEnqueue(){
        for(int i = 1; i < 101; i++){
            stackAdapter.enqueue(i);
        }
        assertEquals(1, stackAdapter.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void testExceptionOnEmptyDequeue(){
        stackAdapter.dequeue();
    }

    @Test
    public void testSingleDequeue(){
        stackAdapter.enqueue(2);
        assertEquals(2, stackAdapter.dequeue());
    }

    @Test
    public void testMultipleDequeues(){
        stackAdapter.enqueue(2);
        stackAdapter.enqueue(4);
        stackAdapter.enqueue(8);

        assertEquals(2, stackAdapter.dequeue());
        assertEquals(4, stackAdapter.dequeue());
    }

    @Test
    public void testEnqueueDequeueVariation(){
        stackAdapter.enqueue(12);
        stackAdapter.enqueue(14);
        stackAdapter.dequeue();
        stackAdapter.enqueue(2);
        stackAdapter.dequeue();
        stackAdapter.enqueue(4);
        stackAdapter.dequeue();
        stackAdapter.enqueue(6);
        stackAdapter.enqueue(8);
        int out = stackAdapter.dequeue();

        assertEquals(4, out);
    }


    @Test
    public void testIsEmpty(){
        assertTrue(stackAdapter.isEmpty());
        stackAdapter.enqueue(1);
        assertFalse(stackAdapter.isEmpty());
    }

    @Test
    public void testToStringEmptyContent(){
        assertEquals("front [ ] back\t(empty queue)", stackAdapter.toString());
    }

    @Test
    public void toStringNonEmptyContent(){
        stackAdapter.enqueue(1);
        stackAdapter.enqueue(2);
        stackAdapter.enqueue(3);

        assertEquals("front: 0 back: 2\n" +
                "front [ 1 2 3 ] back", stackAdapter.toString());
    }
}
