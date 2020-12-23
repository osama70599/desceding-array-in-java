
package descending;
import java.util.*;
public class Descending {
    public static void main(String[] args) {
 ArrayList<Integer> arraylist = new ArrayList<Integer>();
    arraylist.add(12);
    arraylist.add(19);
    arraylist.add(27);
    arraylist.add(55);
    arraylist.add(45);
    arraylist.add(100);
    System.out.println("ArrayList Before Sorting:");
    for(int num: arraylist){
   System.out.println(num);
  }
    Collections.sort(arraylist, Collections.reverseOrder());
   System.out.println("ArrayList in descending order:");
    for(int num: arraylist){
   System.out.println(num);
  }
    
}
}
