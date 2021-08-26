package Exercise;

import java.util.HashMap;
import java.util.Map;

public class Statistics {

    private Map numbers;

    public Statistics(){
        numbers = new HashMap<Integer, Integer>();
    }

    public void addNumber(int i){
        if(numbers.containsKey(i)){
            int tmp = (int) numbers.get(i)+1;
            numbers.put(i,tmp);
        }
        else{
            numbers.put(i,1);
        }
    }

    public void printStatistics(){
        for(var entry : numbers.entrySet()){
            System.out.println(entry);
        }
    }
}
