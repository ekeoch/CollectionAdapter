import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Ekeocha-mac on 4/19/17.
 */
public class IntegerStack implements StackOperations {
    /**
     * Base List to contain the Stack
     */
    private List<Integer> list;

    /**
     * int to keep track of the current index. Initialize index at -1
     */
    int index = -1;

    /**
     * Initialize IntegerStack
     */
    public IntegerStack(){
        this.list = new ArrayList<Integer>();
    }

    /**
     * Add item to the base list and increment the index
     * @param item
     */
    public void push(int item) {
        list.add(item);
        index++;
    }

    /**
     * retrieve item from the base list using index and decrement index
     * @return The last item on the IntegerStack. Throws RuntimeException if empty
     * @throws NoSuchElementException
     */
    public int pop() {
        if(index < 0) throw new NoSuchElementException("The IntegerStack is Empty!!");
        int out = list.get(index);
        list.remove(index);
        index--;
        return out;
    }

    /**
     * return the value at the current index
     * @return int
     */
    public int peek() {
        return list.get(index);
    }

    /**
     * Since we are using the index to keep track of the size of the List
     * if it drops to a value less than Zero it means the list is empty
     * @return
     */
    public boolean isEmpty() {
        return index < 0;
    }

    @Override
    public String toString() {
        String output;

        if(isEmpty()){
            output =  "top [ ] bottom\t(empty stack)";
        }else if(index == 0){
            output = "top [ " + list.get(0) + " ] bottom\t(stack with one element)";
        }else{
            //loop through array backwards and concatenate string
            StringBuilder stringBuilder = new StringBuilder("top [ ");

            for (int i = index; i > -1; i--){
                stringBuilder.append(String.format("%1$d ", list.get(i)));
            }
            stringBuilder.append(String.format("] bottom\t(stack with %1$d elements)", index + 1));

            output = stringBuilder.toString();
        }

        return output;
    }
}
