package dotcom;

import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.ArrayList;

public class SimpleDotCom {
    //int[] location;

    ArrayList<Integer> location;
    int numOfHits;

//    public void setLocation(int[] location) {
//        this.location = location;
//    }

    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }

//    public String checkYourself(String guessStr) {
//        int guess = Integer.parseInt(guessStr);
//        String result = "miss";
//        //iter
//        for (int i : location) {
//            if(guess==i){
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//
//        }
//
//        if(numOfHits == location.length){
//            result="kill";
//        }
//        return result;
//
//    }
    public String checkYourself(String guessStr){
        int guess = Integer.parseInt(guessStr);
        String result = "miss";
        int index = location.indexOf(guess);
        if(index >= 0){
            location.remove(index);
            if(location.isEmpty()) {
                result = "kill";
            }else result="hit";
        }
        return result;
    }
}
