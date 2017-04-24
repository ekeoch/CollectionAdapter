package operations.simulations;

import operations.QueueOperations;
import operations.adapters.StackAdapter;
import operations.operationsImpl.IntegerQueue;
import operations.operationsImpl.IntegerStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ekeocha-mac on 4/20/17.
 */
public class QueueSimulator {
    public static void main(String[] args) {
        IntegerQueue integerQueue = new IntegerQueue();

        IntegerStack integerStack = new IntegerStack();
        StackAdapter stackAdapter = new StackAdapter(integerStack);

        List<QueueOperations> queueOperationsList = new ArrayList<QueueOperations>();
        queueOperationsList.add(integerQueue);
        queueOperationsList.add(stackAdapter);

        for(QueueOperations queueOperations : queueOperationsList){
            queueOperations.enqueue(10);
            queueOperations.dequeue();
            System.out.println(queueOperations.toString());
        }
    }
}
