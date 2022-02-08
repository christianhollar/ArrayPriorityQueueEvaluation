import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * ArrayPriorityQueue
 * 
 * PriorityQueue Methods : add, poll, peek
 * 
 * utilizes ArrayList
 * 
 * Christian Hollar
 * 10/16/2020
 * 
 */
public class ArrayPriorityQueue<T extends Comparable<T>>
{
    // arraylist for reference
    ArrayList<T> aList;

    /**
     * Constructor for objects of class ArrayPriorityQueue
     */
    public ArrayPriorityQueue()
    {
        // initialise instance of arrayList
        aList = new ArrayList<T>();
    }

    /**
     * adds input element to ArrayList utlizing add()
     * returns boolean of whether this is successful
     * 
     * Integer 10
     * String "Ten"
     */
    public boolean add(T t)
    {
        return aList.add(t);
    }
    /**
     * first checks if arrayList is empty
     * 
     * sets value to first element of aList
     * compares each element within aList to find the minimum using compareTo(by weights)
     * if element smaller is found it is set to value
     * index is recorded for removal 
     * 
     * value (min element) returned 
     * 
     * no input
     */
    public <T extends Comparable<T>> T poll()
    {
        if(aList.isEmpty())
        return null;
        T value = (T) aList.get(0);
        int j = 0;
        for(int i = 0; i < aList.size(); i++)
        { 
            if(value.compareTo((T)aList.get(i))>0)
            {
                value = (T)aList.get(i);
                j = i;
            }
        }
        aList.remove(j);
        return value;
    }
    /**
     * first checks if arrayList is empty
     * 
     * sets value to first element of aList
     * compares each element within aList to find the minimum using compareTo(by weights)
     * if element smaller is found it is set to value
     * 
     * value (min element) returned
     * no input
     * */
    public <T extends Comparable<T>> T peek()
    {
        if(aList.isEmpty())
        return null;
        T value = (T) aList.get(0);
        int j = 0;
        for(int i = 0; i < aList.size(); i++)
        {
            if(value.compareTo((T)aList.get(i))>0)
            {
                value = (T)aList.get(i);
                j = i;
            }
        }
        return value;
    }
}
