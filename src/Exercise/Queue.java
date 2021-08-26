package Exercise;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Queue<T> {

    private LinkedList<T> queue;
    private int maxSize;

    public Queue(int maxSize){
        queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public boolean addElementToQueue(T e){
        if(queue.size()>maxSize){
            return false;
        }
        else{
            queue.add(e);
            return true;
        }
    }

    public T popElement(){
        if(queue.isEmpty()){
            return null;
        }
        T tmp = queue.getFirst();
        queue.removeFirst();
        return tmp;
    }

    public Set getAll(){
        return new HashSet(queue);
    }

    public boolean isFull() {
        if(queue.size()>=maxSize){
            return true;
        }
        return false;
    }
}
