import java.util.PriorityQueue;
/**
 * Write a description of class WeightedElement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeightedElement<E,W extends Comparable<W>> implements Comparable<WeightedElement<E,W>>
{
    // instance variables - replace the example below with your own
    public E element;
    public W weight;
    
    /**
     * Sets input element and weight to instance of class
     * 
     * Integer Instance : (10,10)
     * String Instance : ("Ten","Ten")
     */
    public WeightedElement(E element, W weight)
    {
        this.element = element;
        this.weight = weight;
    }
    
    /**
     * Compares the weight of the instance to another instance of WeightedElement
     * Integer Instance : (10,10)
     * String Instance : ("Ten","Ten")
     */

    @Override
    public int compareTo(WeightedElement<E,W> element) 
    {
        return weight.compareTo(element.weight);
    }
    
}

