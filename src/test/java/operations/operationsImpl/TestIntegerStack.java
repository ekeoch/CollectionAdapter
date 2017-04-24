package operations.operationsImpl;

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
public class TestIntegerStack {
    private IntegerStack integerStack;

    @Before
    public void SetUp(){
        this.integerStack = new IntegerStack();
    }

    @Test(expected = NoSuchElementException.class)
    public void testPeekEmptyStackException(){
        integerStack.peek();
    }

    @Test
    public void testPeekEmptyStackExceptionMessage(){
        try{
            integerStack.peek(); //peeking into an empty stack should throw Exception so we can use that
        }catch(NoSuchElementException exception){
            assertEquals("The operations.operationsImpl.IntegerStack is Empty!!", exception.getMessage());
        }
    }

    @Test
    public void testPeek(){
        integerStack.push(15);
        assertEquals(15, integerStack.peek());
    }

    @Test
    public void testSinglePush(){
        integerStack.push(20);
        assertEquals(20, integerStack.peek());
    }

    @Test
    public void testMultiplePush(){
        integerStack.push(0);
        integerStack.push(2);
        integerStack.push(4);
        assertEquals(4, integerStack.peek());
    }

    @Test
    public void testLargeNumberOfPushes(){
        for(int i = 1; i < 101; i++){
            integerStack.push(i);
        }
        assertEquals(100, integerStack.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void testExceptionOnEmptyPop(){
        integerStack.pop();
    }

    @Test
    public void testSinglePop(){
        integerStack.push(10);
        assertEquals(10, integerStack.pop());
    }

    @Test
    public void testMultiplePops(){
        integerStack.push(10);
        integerStack.push(11);
        integerStack.push(12);

        assertEquals(12, integerStack.pop());
        assertEquals(11, integerStack.pop());
    }

    @Test
    public void testPushPopVariation(){
        integerStack.push(10);
        integerStack.push(11);
        integerStack.pop();
        integerStack.push(12);
        int out = integerStack.pop();

        assertEquals(12, out);
    }

    @Test
    public void testPopOnExtendedArray(){
        for(int i = 1; i < 12; i++){
            integerStack.push(i);
        }
        assertEquals(11, integerStack.pop());
    }

    @Test
    public void testIsEmpty(){
        assertTrue(integerStack.isEmpty());
        integerStack.push(10);
        assertFalse(integerStack.isEmpty());
    }

    @Test
    public void testToStringEmptyStack(){
        assertEquals("top [ ] bottom\t(empty stack)", integerStack.toString());
    }

    @Test
    public void testToStringNonEmptyStack(){
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        assertEquals("top [ 3 2 1 ] bottom\t(stack with 3 elements)", integerStack.toString());
    }

    @Test
    public void testSizeWithEmptyIntegerStack(){
        assertEquals(0, integerStack.size());
    }

    @Test
    public void testSizeWithNonEmptyIntegerStack(){
        integerStack.push(10);
        integerStack.push(20);
        assertEquals(2, integerStack.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOnEmptyIntegerStack(){
        integerStack.get(0, false);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOnEmptyIntegerStackWithDelete(){
        integerStack.get(0, true);
    }

    @Test
    public void testGetOnIntegerStack(){
        integerStack.push(10);
        assertEquals(10, integerStack.get(0, false));
        assertEquals(1, integerStack.size());
    }

    @Test
    public void testGetOnIntegerStackWithDelete(){
        integerStack.push(10);
        assertEquals(10, integerStack.get(0, true));
        assertEquals(0, integerStack.size());
        assertEquals("top [ ] bottom\t(empty stack)", integerStack.toString());
    }
}
