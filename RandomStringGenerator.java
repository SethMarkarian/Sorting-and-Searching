import java.util.*;
public class RandomStringGenerator
{
    private int seed, stringLength;
    private Random random;
    
    public RandomStringGenerator(int s, int l) { //constructor
        seed = s; //sets seed
        stringLength = l; //sets stringLength
        random = new Random(seed); //makes new random
    }
    
    public String nextString() { //creates new random string
        String s = ""; //creates empty string
        for(int i = 0; i < stringLength; i++) { //loops over number of times long
            int d = random.nextInt(26) + 97; //finds character
            char[] c = new char[1]; //inserts character into array
            c[0]= (char) d; //converts char
            s += new String(c); //inserts into s
        }
        return s; //returns string
    }
}
