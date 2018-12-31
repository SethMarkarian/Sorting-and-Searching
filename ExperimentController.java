import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
public class ExperimentController
{
    private int seed, numel;

    public ExperimentController() {
        seed = 20; //sets seed
        numel = 10; //sets numel
    }

    public static void main(String[] args) { //main method
        ExperimentController exp1 = new ExperimentController(); //creates new instance of ExperimentController()
        exp1.run(); //runs run() method
    }

    public void run() { //put data into output.csv
        try {
            PrintWriter pw = new PrintWriter(new File("output.csv"));
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 10; i++) {
                sb.append(numel);
                sb.append(",");
                int total = 0;
                for(int j = 0; j < 4; j++) {
                    total += timeToInsertionSortUnsorted(numel, seed);
                }
                sb.append(total / 4);
                sb.append("\n");
                numel += 10;
            }
            sb.append("\n");
            sb.append("\n");
            numel = 10;
            for(int i = 0; i < 10; i++) {
                sb.append(numel);
                sb.append(",");
                int total = 0;
                for(int j = 0; j < 4; j++) {
                    total += timeToInsertionSortSorted(numel, seed);
                }
                sb.append(total / 4);
                sb.append("\n");
                numel += 10;
            }
            sb.append("\n");
            sb.append("\n");
            numel = 10;
            for(int i = 0; i < 10; i++) {
                sb.append(numel);
                sb.append(",");
                int total = 0;
                for(int j = 0; j < 4; j++) {
                    total += timeToBubbleSortUnsorted(numel, seed);
                }
                sb.append(total / 4);
                sb.append("\n");
                numel += 10;
            }
            sb.append("\n");
            sb.append("\n");
            numel = 10;    
            for(int i = 0; i < 10; i++) {
                sb.append(numel);
                sb.append(",");
                int total = 0;
                for(int j = 0; j < 4; j++) {
                    total += timeToBubbleSortSorted(numel, seed);
                }
                sb.append(total / 4);
                sb.append("\n");
                numel += 10;
            }
            sb.append("\n");
            sb.append("\n");
            numel = 10;
            for(int i = 0; i < 10; i++) {
                sb.append(numel);
                sb.append(",");
                int total = 0;
                for(int j = 0; j < 4; j++) {
                    total += timeToLinearSearchFound(numel, seed);
                }
                sb.append(total / 4);
                sb.append("\n");
                numel += 10;
            }
            sb.append("\n");
            sb.append("\n");
            numel = 10;
            for(int i = 0; i < 10; i++) {
                sb.append(numel);
                sb.append(",");
                int total = 0;
                for(int j = 0; j < 4; j++) {
                    total += timeToLinearSearchNotFound(numel, seed);
                }
                sb.append(total / 4);
                sb.append("\n");
                numel += 10;
            }
            sb.append("\n");
            sb.append("\n");
            numel = 10;
            for(int i = 0; i < 10; i++) {
                sb.append(numel);
                sb.append(",");
                int total = 0;
                for(int j = 0; j < 4; j++) {
                    total += timeToBinarySearchFound(numel, seed);
                }
                sb.append(total / 4);
                sb.append("\n");
                numel += 10;
            }
            sb.append("\n");
            sb.append("\n");
            numel = 10;
            for(int i = 0; i < 10; i++) {
                sb.append(numel);
                sb.append(",");
                int total = 0;
                for(int j = 0; j < 4; j++) {
                    total += timeToBinarySearchNotFound(numel, seed);
                }
                sb.append(total / 4);
                sb.append("\n");
                numel += 10;
            }
            sb.append("\n");
            sb.append("\n");
            numel = 10;
            
            pw.write(sb.toString());
            pw.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public long timeToInsertionSortUnsorted(int numberOfItems, int seed) { //how long for insertion sort not sorted
        RandomStringGenerator rsc = new RandomStringGenerator(seed, numel); //creates a new RandomIntegerContainer() instance
        StringContainer sc = new StringContainer(); //creates new instance of StringContainer()
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            String val = rsc.nextString(); //gets integer
            sc.addToEnd(val); //inserts to end
        }
        long t0 = System.nanoTime(); //stores starting time
        sc.insertionSort(); //completes insertion sort
        long t1 = System.nanoTime(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeToInsertionSortSorted(int numberOfItems, int seed) { //how long for insertion sort already sorted
        RandomStringGenerator rsc = new RandomStringGenerator(seed, numel); //creates a new RandomIntegerContainer() instance
        StringContainer sc = new StringContainer(); //creates new instance of StringContainer()
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            String val = rsc.nextString(); //gets integer
            sc.addToEnd(val); //inserts to end
        }
        sc.insertionSort(); //completes insertion sort
        long t0 = System.nanoTime(); //stores starting time
        sc.insertionSort(); //completes insertion sort
        long t1 = System.nanoTime(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeToBubbleSortUnsorted(int numberOfItems, int seed) { //how long for bubble sort not sorted
        RandomStringGenerator rsc = new RandomStringGenerator(seed, numel); //creates a new RandomIntegerContainer() instance
        StringContainer sc = new StringContainer(); //creates new instance of StringContainer
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            String val = rsc.nextString(); //gets integer
            sc.addToEnd(val); //inserts to end
        }
        long t0 = System.nanoTime(); //stores starting time
        sc.bubbleSort(); //completes bubble sort
        long t1 = System.nanoTime(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeToBubbleSortSorted(int numberOfItems, int seed) { //how long for bubble sort already sorted
        RandomStringGenerator rsc = new RandomStringGenerator(seed, numel); //creates a new RandomIntegerContainer() instance
        StringContainer sc = new StringContainer(); //creates new instance of StringContainer
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            String val = rsc.nextString(); //gets integer
            sc.addToEnd(val); //inserts to end
        }
        sc.bubbleSort(); //completes bubble sort
        long t0 = System.nanoTime(); //stores starting time
        sc.bubbleSort(); //completes bubble sort
        long t1 = System.nanoTime(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeToLinearSearchFound(int numberOfItems, int seed) { //finds element using linear search
        StringContainer sc = new StringContainer(); //creates new instance of StringContainer
        RandomStringGenerator rsc = new RandomStringGenerator(seed, 10); //creates a new RandomIntegerContainer() instance
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            String val = rsc.nextString(); //gets integer
            sc.addToEnd(val); //inserts to end
        }
        Random random = new Random(seed); //gets new random
        int index1 = random.nextInt(numel); //random int
        String find = sc.getValue(index1); //finds string at that index
        long t0 = System.nanoTime(); //stores starting time
        long index2 = sc.linearSearch(find); //finds index of element
        long t1 = System.nanoTime(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeToLinearSearchNotFound(int numberOfItems, int seed) { //doesnt find element using linear search
        StringContainer sc = new StringContainer(); //creates new instance of StringContainer
        RandomStringGenerator rsc = new RandomStringGenerator(seed, 10); //creates a new RandomIntegerContainer() instance
        for(int i = 0; i < numel; i++) { //loops number of objects wanted
            String val = rsc.nextString(); //gets integer
            sc.addToEnd(val); //inserts to end
        }
        Random random = new Random(seed);
        String randomString = rsc.nextString();
        long t0 = System.nanoTime(); //stores starting time
        long index2 = sc.linearSearch(randomString);
        long t1 = System.nanoTime(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeToBinarySearchFound(int numberOfItems, int seed) { //finds element using binary search
        StringContainer sc = new StringContainer(); //creates new instance of StringContainer
        RandomStringGenerator rsc = new RandomStringGenerator(seed, 10); //creates a new RandomIntegerContainer() instance
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            String val = rsc.nextString(); //gets integer
            sc.addToEnd(val); //inserts to end
        }
        sc.insertionSort();
        Random random = new Random(seed);
        int index1 = random.nextInt(numel);
        String find = sc.getValue(index1);
        long t0 = System.nanoTime(); //stores starting time
        long index2 = sc.binarySearch(find);
        long t1 = System.nanoTime(); //stores ending time
        return t1 - t0; //calculates total time
    }

    public long timeToBinarySearchNotFound(int numberOfItems, int seed) { //doesn't find element using binary search
        StringContainer sc = new StringContainer(); //creates new instance of StringContainer
        RandomStringGenerator rsc = new RandomStringGenerator(seed, 10); //creates a new RandomIntegerContainer() instance
        for(int i = 0; i < numberOfItems; i++) { //loops number of objects wanted
            String val = rsc.nextString(); //gets integer
            sc.addToEnd(val); //inserts to end
        }
        sc.insertionSort();
        Random random = new Random(seed);
        String randomString = rsc.nextString();
        long t0 = System.nanoTime(); //stores starting time
        long index2 = sc.binarySearch(randomString);
        long t1 = System.nanoTime(); //stores ending time
        return t1 - t0; //calculates total time
    } 
}
