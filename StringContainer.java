import java.util.*;
public class StringContainer
{
    private ArrayList<String> arr;

    public static void main(String[] args) { //main method
        StringContainer sr = new StringContainer(); //creates new instance StringContainer
        sr.run(); //runs run method
    }
    
    public void run() { //runs tests
        addToEnd("hi");
        addToEnd("bye");
        addToEnd("go");
        addToEnd("yell");
        System.out.println(binarySearch("yell"));
    }
    
    public StringContainer() { //Constructor
        arr = new ArrayList<String>(); //assigns arr 
    }
    
    public ArrayList addToEnd(String str) { //adds element to end of arraylist
        arr.add(arr.size(), str); //adds str to index arr.size()
        return arr; //returns arraylist
    }
    
    public String getValue(int index) { //"get" method
       return arr.get(index); //returns element at index
    }
    
    //PG 354
    public ArrayList insertionSort() { //completes insertion sort
        for(int i = 1; i < arr.size(); i++) { //loops through the array starting at i = 1
            String key = arr.get(i); //stores current element
            for(int j = i - 1; j >= 0; j--) { //loops through the array backwards
                if(key.compareTo(arr.get(j)) < 0){ //compares stored element to current element
                    arr.set(j + 1, arr.get(j)); //if true, it will shift to the right
                    if(j == 0) { //if it reaches the beginning
                        arr.set(0, key); //set key to the beginning
                    }
                }
                else { //if above if statement is false
                    arr.set(j + 1, key); //set key to the position
                    break; //escape from for looop
                }
            }
        }    
        return arr; //return arraylist
    }
    
    public ArrayList bubbleSort() { //completes bubble sort
        boolean done = false; //not done
        for(int i = 0; i < arr.size(); i++) { //loops over arraylist
            done = true; //done
            for(int j = 0; j < arr.size() - 1 - i; j++) { //loops over arraylist but only part of it
                if(arr.get(j).compareTo(arr.get(j + 1)) > 0) { //tests to see if not the same
                    done = false; //not done
                    String temp = arr.get(j); //assigns current item to temp variable
                    arr.set(j, arr.get(j + 1)); //swaps elements
                    arr.set(j + 1, temp); //inserts temp
                }
            }
        }
        return arr; //returns arraylist
    }
    
    public long linearSearch(String str) { //completes linear search
        for(int i = 0; i < arr.size(); i++) { //loops over arraylist
            if(arr.get(i).equals(str)  ) { //checks to see if equal
                return i; //returns index
            }
        }
        return -1; //not found
    }
    
    //PG 209
    public long binarySearch(String str) { //completes binary search
        int left = 0; //sets left to beginning
        int right = arr.size() - 1; //sets right to end
        while(left <= right) { //checks to see if crossed
            int middle = (left + right) / 2; //sets middle to middle index
            if(arr.get(middle).compareTo(str) < 0) { //checks to see if its greater
                left = middle + 1; //moves left
            }
            else if(arr.get(middle).compareTo(str) > 0) { //checks to see if its smaller
                right = middle - 1; //moves right
            }
            else { //if element is middle
                return middle; //return index
            }
        }
        return -1; //not found
    }
    
    public String[] returnArray() { //converts arraylist to array
        String[] arrayString = new String[arr.size()]; //sets length of array to size of arraylist
        for(int i = 0; i < arr.size(); i++) { //loops through arraylist
            arrayString[i] = arr.get(i); //assigns Integer from arraylist to array
        }
        return arrayString; //return array
     }
}
