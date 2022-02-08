

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArrayPriorityQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArrayPriorityQueueTest
{
    /**
     * Default constructor for test class ArrayPriorityQueueTest
     */
    public ArrayPriorityQueueTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void PQueueTest()
    {
        ArrayPriorityQueue arrayPri1 = new ArrayPriorityQueue();
        assertEquals(true, arrayPri1.add(5));
        assertEquals(true, arrayPri1.add(10));
        assertEquals(true, arrayPri1.add(25));
        assertEquals(true, arrayPri1.add(50));
        assertEquals(true, arrayPri1.add(100));
        java.lang.Integer integer1 = (java.lang.Integer)arrayPri1.peek();
        assertEquals(integer1, integer1);
        java.lang.Integer integer2 = (java.lang.Integer)arrayPri1.poll();
        assertEquals(integer2, integer2);
    }

    

    @Test
    public void WeightedElementTest()
    {
        ArrayPriorityQueue<WeightedElement<Integer,Integer>> arrayPri1 = new ArrayPriorityQueue<WeightedElement<Integer,Integer>>();
        assertEquals(true, arrayPri1.add(new WeightedElement<Integer,Integer>(100,100)));
        assertEquals(true, arrayPri1.add(new WeightedElement<Integer,Integer>(10,10)));
        assertEquals(true, arrayPri1.add(new WeightedElement<Integer,Integer>(10000,10000)));
        assertEquals(true, arrayPri1.add(new WeightedElement<Integer,Integer>(5,100)));
        java.lang.Integer integer1 = (java.lang.Integer)arrayPri1.peek();
        assertEquals(integer1, integer1);
        java.lang.Integer integer2 = (java.lang.Integer)arrayPri1.poll();
        assertEquals(integer2, integer2);

        
    }
}



