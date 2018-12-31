import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class TestSC
{
    @Test
    public void testAddToEnd() { //tests addToFront
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        String[] theAns = sc.returnArray();
        String[] trueAns = new String[] {"good", "bye", "hello", "chair", "simon", "fan"};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testInsertionSortAllUnique() { //tests insertionSort with unique elements
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        sc.insertionSort();
        String[] theAns = sc.returnArray();
        String[] trueAns = new String[] {"bye", "chair", "fan", "good", "hello", "simon"};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testInsertionSortAllSame() { //tests insertionSort with same elements
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("belt");
        sc.addToEnd("great");
        sc.addToEnd("great");
        sc.addToEnd("smell");
        sc.insertionSort();
        String[] theAns = sc.returnArray();
        String[] trueAns = new String[] {"belt", "bye", "good", "great", "great", "smell"};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testBubbleSortAllUnique() { //tests bubbleSort with unique elements
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        sc.bubbleSort();
        String[] theAns = sc.returnArray();
        String[] trueAns = new String[] {"bye", "chair", "fan", "good", "hello", "simon"};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testBubbleSortAllSame() { //tests bubbleSort with same elements
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("belt");
        sc.addToEnd("great");
        sc.addToEnd("great");
        sc.addToEnd("smell");
        sc.insertionSort();
        String[] theAns = sc.returnArray();
        String[] trueAns = new String[] {"belt", "bye", "good", "great", "great", "smell"};
        assertArrayEquals(theAns, trueAns);
    }
    
    @Test
    public void testLinearSearchBeginning() { //tests linearSearch to find beginning element
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        long theAns = sc.linearSearch("good");
        long trueAns = 0;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testLinearSearchMiddle() { //tests linearSearch to find middle element
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        long theAns = sc.linearSearch("chair");
        long trueAns = 3;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testLinearSearchEnd() { //tests linearSearch to find ending element
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        long theAns = sc.linearSearch("fan");
        long trueAns = 5;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testLinearSearchNotFound() { //tests linearSearch to not find element
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        long theAns = sc.linearSearch("tell");
        long trueAns = -1;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testBinarySearchBeginning() { //tests binarySearch to find beginning element
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        sc.insertionSort();
        long theAns = sc.binarySearch("bye");
        long trueAns = 0;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testBinarySearchMiddle() { //tests binarySearch to find middle element
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        sc.insertionSort();
        long theAns = sc.binarySearch("good");
        long trueAns = 3;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testBinarySearchEnd() { //tests binarySearch to find ending element
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        sc.insertionSort();
        long theAns = sc.binarySearch("simon");
        long trueAns = 5;
        assertEquals(theAns, trueAns);
    }
    
    @Test
    public void testBinarySearchNotFound() { //tests binarySearch to not find element
        StringContainer sc = new StringContainer();
        sc.addToEnd("good");
        sc.addToEnd("bye");
        sc.addToEnd("hello");
        sc.addToEnd("chair");
        sc.addToEnd("simon");
        sc.addToEnd("fan");
        sc.insertionSort();
        long theAns = sc.binarySearch("fall");
        long trueAns = -1;
        assertEquals(theAns, trueAns);
    }
}
