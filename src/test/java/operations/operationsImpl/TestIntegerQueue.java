package operations.operationsImpl;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ekeocha-mac on 4/20/17.
 */
public class TestIntegerQueue {
    private IntegerQueue integerQueue;

    @Before
    public void setUp(){
        integerQueue = new IntegerQueue();
    }

    
    @Test(expected = NoSuchElementException.class)
    public void testPeekEmptyQueueException(){
        integerQueue.peek();
    }

    @Test
    public void testPeekEmptyQueueExceptionMessage(){
        try{
            integerQueue.peek();
        }catch(NoSuchElementException exception){
            assertEquals("The IntegerQueue is Empty!!", exception.getMessage());
        }
    }

    @Test
    public void testPeek(){
        integerQueue.enqueue(2);
        assertEquals(2, integerQueue.peek());
    }

    @Test
    public void testSingleEnqueue(){
        integerQueue.enqueue(2);
        assertEquals(2, integerQueue.peek());
    }

    @Test
    public void testMultipleEnqueues(){
        integerQueue.enqueue(2);
        integerQueue.enqueue(4);
        integerQueue.enqueue(8);
        assertEquals(2, integerQueue.peek());
    }


    @Test
    public void testLargeNumberOfEnqueue(){
        for(int i = 1; i < 101; i++){
            integerQueue.enqueue(i);
        }
        assertEquals(1, integerQueue.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void testExceptionOnEmptyDequeue(){
        integerQueue.dequeue();
    }

    @Test
    public void testSingleDequeue(){
        integerQueue.enqueue(2);
        assertEquals(2, integerQueue.dequeue());
    }

    @Test
    public void testMultipleDequeues(){
        integerQueue.enqueue(2);
        integerQueue.enqueue(4);
        integerQueue.enqueue(8);

        assertEquals(2, integerQueue.dequeue());
        assertEquals(4, integerQueue.dequeue());
    }

    @Test
    public void testEnqueueDequeueVariation(){
        integerQueue.enqueue(12);
        integerQueue.enqueue(14);
        integerQueue.dequeue();
        integerQueue.enqueue(2);
        integerQueue.dequeue();
        integerQueue.enqueue(4);
        integerQueue.dequeue();
        integerQueue.enqueue(6);
        integerQueue.enqueue(8);
        int out = integerQueue.dequeue();

        assertEquals(4, out);
    }


    @Test
    public void testIsEmpty(){
        assertTrue(integerQueue.isEmpty());
        integerQueue.enqueue(1);
        assertFalse(integerQueue.isEmpty());
    }

    @Test
    public void testToStringEmptyQueue(){
        assertEquals("front [ ] back\t(empty queue)", integerQueue.toString());
    }

    @Test
    public void toStringNonEmptyQueue(){
        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);

        assertEquals("front: 0 back: 2\n" +
                "front [ 1 2 3 ] back", integerQueue.toString());
    }
}
