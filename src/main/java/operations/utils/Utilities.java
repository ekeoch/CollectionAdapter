package operations.utils;

import operations.QueueOperations;

/**
 * Created by Ekeocha-mac on 4/24/17.
 */
public class Utilities {

    /**
     * Utility method to return QueueOperations to String.
     * To Avoid duplicating toString code in IntegerQueue and StackAdapter
     * @param queueOperations
     * @return
     */
    public static String queueOperationsToString(QueueOperations queueOperations){
        String output;

        if(queueOperations.isEmpty()){
            output = "front [ ] back\t(empty queue)";
        }else if(queueOperations.size() == 1){
            output = String.format("front: %1$d back: %2$d\n", 0, 0);
            output += "front [ " + queueOperations.peek() + " ] back";
        } else{
            StringBuilder stringBuilder = new StringBuilder(String.format("front: %1$d back: %2$d\n", 0, queueOperations.size() - 1));
            stringBuilder.append("front [ ");

            for(int i = 0; i < queueOperations.size(); i++){
                stringBuilder.append(String.format("%1$d ", queueOperations.get(i)));
            }

            stringBuilder.append("] back");
            output = stringBuilder.toString();
        }

        return output;
    }
}
