import java.util.PriorityQueue;
import java.util.Random;
import java.util.ArrayList;
/**
 *Experiment Controller tests efficiency of adding integers and strings to ArrayPriorityQueue
 *tests efficiency of calling peek and poll methods for integers, strings, and weighted elemetns
 * Christian Hollar
 * 10/16/2020
 */
public class ExperimentController<T extends Comparable<T>>
{
    
    int numOfItems;
    //wCopy used for search in 
    WeightedElement wCopy;
    public static void main(String[] args)
    {
        ExperimentController e = new ExperimentController();
        e.testType("Integer");
        //System.out.println(e.testMethod("Integer","poll"));
    }
    
    public ExperimentController()
    {
    }
    /**
     * required and changed for multiple methods
     */
    public void intTest(int dataN)
    {
        this.numOfItems = 10000;
        for(int i = 0; i<=dataN; i++)
        {
            ExperimentController e1 = new ExperimentController();
            ExperimentController e2 = new ExperimentController();
            ExperimentController e3 = new ExperimentController();
            ExperimentController e4 = new ExperimentController();
            numOfItems*=10;
             

        }
    }
    /**
     * test for peek and poll times of integers
     * 
     * accepts "poll" or "peek"
     */
    public void testInt(String type)
    {
        numOfItems = 100;
        ArrayPriorityQueue<Integer> a = 
        new ArrayPriorityQueue<Integer>();
        int iteration = 6;
        if (type == "poll")
        {
            for(int k = 0; k<= iteration; k++)
            {
            /**
             * random integers generated only poll or peek are recorded
             */    
                for(int i = 0; i <= numOfItems; i++)
            {
                Random rand1 = new Random();
                int element = rand1.nextInt();
                a.add(element);
            }
            long start = System.currentTimeMillis();
            a.poll();
            long stop = System.currentTimeMillis();
            System.out.println(stop-start);
            numOfItems*=10;    
            }
        }
        
        if (type == "peek")
        {
            for(int k = 0; k<= iteration; k++)
            {
                
                for(int i = 0; i <= numOfItems; i++)
            {
                Random rand1 = new Random();
                int element = rand1.nextInt();
                a.add(element);
            }
            long start = System.currentTimeMillis();
            a.peek();
            long stop = System.currentTimeMillis();
            System.out.println(stop-start);
            numOfItems*=10;    
            }
        } 
    }
    /**
     * takes "String" or "Integer"
     * tests for addtime 
     */
    public void testType(String typeTest)
    {
       /*
        * starts at 100, iteration set at 6 as a rsult of heap space errors
        * timer is used to continue to add the timing of each time add is called
        */
        numOfItems = 100;
        int iteration = 6;
        long timer = 0;
        /*
         * random integers created and added to priorityqueue
         */
        if (typeTest == "String")
        {
            ArrayPriorityQueue<String> aS = 
        new ArrayPriorityQueue<String>();
            for(int k = 0; k<= iteration; k++)
            {
                
            for(int i = 0; i <= numOfItems; i++)
            {
                Random rand1 = new Random();
                int element = rand1.nextInt();
                long start = System.currentTimeMillis();
                /*
                 * for strings integer to string is necessary
                 */
                aS.add(Integer.toString(element));
                long stop = System.currentTimeMillis();
                timer =+(stop-start);
            }
            /*
             * num of items multiplied by ten each time
             */
            numOfItems*=10;
            System.out.println(timer);
            }
        }
        /*
         * same thing without integer.tostring()
         *  just integers are used
         */
        if (typeTest == "Integer")
        {
            ArrayPriorityQueue<Integer> aI = 
        new ArrayPriorityQueue<Integer>();
            for(int k = 0; k<= iteration; k++)
            {
                
            for(int i = 0; i <= numOfItems; i++)
            {
                Random rand1 = new Random();
                int element = rand1.nextInt();
                long start = System.currentTimeMillis();
                aI.add(element);
                long stop = System.currentTimeMillis();
                timer =+(stop-start);
            }
            numOfItems*=10;
            System.out.println(timer);
            }
        } 
    }
    /**
     * runs test method for each possible variation numerous times based on input int
     */
    
    public void systemTest(int dataN)
    {
        this.numOfItems = 10000;
        for(int i = 0; i<=dataN; i++)
        {
            ExperimentController e1 = new ExperimentController();
            ExperimentController e2 = new ExperimentController();
            ExperimentController e3 = new ExperimentController();
            ExperimentController e4 = new ExperimentController();
            System.out.println(e1.testMethod("Integer","poll"));
            System.out.println(e2.testMethod("Integer","peek"));
            System.out.println(e3.testMethod("String","poll"));
            System.out.println(e4.testMethod("String","peek"));
            numOfItems*=10;

        }
    }
    /**
     * Takes "Integer" or "String" in first slot
     * Takes "peek" or "poll" in second slot
     * 
     * tests runtime of peek and poll for weighted elements
     */

    public long testMethod(String test, String type)
    {
        if(test == "Integer")
        {
            /*
             * Weighted Element Integer Form Called
             * 
             */
        ArrayPriorityQueue<WeightedElement<Integer,Integer>> a1 = 
        new ArrayPriorityQueue<WeightedElement<Integer,Integer>>();
        /*
         * adds random integers using random class based on numberofitems
         */
        for (int i = 0; i <=this.numOfItems; i++)
        {
            Random rand1 = new Random();
            Random rand2 = new Random();
            int element = rand1.nextInt();
            int weight = rand2.nextInt();
            WeightedElement w = new WeightedElement(element,weight);
            a1.add(w);
            
        }
        /*
         * finds runtime of polll or peek
         */
        if(type == "poll")
        {
            long start = System.currentTimeMillis();
            a1.poll();
            long stop = System.currentTimeMillis();
            return start - stop;
        }
        if(type == "peek")
        {
            long start = System.currentTimeMillis();
            a1.poll();
            long stop = System.currentTimeMillis();
            return start - stop;
        }
        
        }
        /*
         * same thing for string with the exception of how random strings are created
         * 
         */
        
        if(test == "String")
        {
           /*
            * all possibilites of a five letter strings are created
            */
            String[] si = {"a","b","c","d","e","f","g","h","i","j","k","l"
            ,"m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> a = new ArrayList<String>();
        for(int i = 0; i<si.length; i++)
        {
            for(int j = 0; j<si.length; j++)
            {
                for(int k = 0; k<si.length; k++)
                {
                    for(int l = 0; l<si.length; l++)
                    {
                        for(int m = 0; m<si.length; m++)
                        {
                            a.add(si[m]+si[l]+si[k]+si[j]+si[i]);
                        }
                    }
                }
            }
        }
        /*
         * calls for random element within the 5 letter string array
         * using next int
         */
        ArrayPriorityQueue<WeightedElement<String,String>> a2 = 
        new ArrayPriorityQueue<WeightedElement<String,String>>();
        for (int i = 0; i <=numOfItems; i++)
        {
            Random rand1 = new Random();
            Random rand2 = new Random();
            int element = rand1.nextInt(a.size()+1);
            int weight = rand2.nextInt(a.size()+1);
            WeightedElement w = 
            new WeightedElement(a.get(element),a.get(weight));
            a2.add(w);
        }

        if(type == "poll")
        {
            long start = System.currentTimeMillis();
            a2.poll();
            long stop = System.currentTimeMillis();
            return stop - start;
        }
        if(type == "peek")
        {
            long start = System.currentTimeMillis();
            a2.poll();
            long stop = System.currentTimeMillis();
            return stop - start;
        }
    }
    return -1;
    
    }
}
    
