
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetAndMap {
    
    public static void main(String[] args) {
    Set<String> mySet = new HashSet<String>();
    mySet.add("bangladesh");
    mySet.add("Srilanka");
    mySet.add("Nepal");
    
    System.out.println(mySet);
    mySet.remove("bangladesh");
    System.out.println(mySet);
    
    // adding existing data to set 
    ArrayList<String> allCountry = new ArrayList<>();
    allCountry.add("Pak");
    allCountry.add("USa");
    allCountry.add("Can");
    
    mySet.addAll(allCountry);
    System.out.println("After adding list : "+mySet);
    
    String[] names ={"gazipur","Dhaka"};
    for(String s: names){
        mySet.add(s);
    System.out.println("New string added : "+s+" now : "+mySet);
    
    }
        
        
    ArrayList<String> namesArray = new ArrayList<String>(Arrays.asList("un","london","Uganda"));
    
    System.out.println(namesArray);   
    
    // iterator 
    Iterator<String> it = namesArray.iterator();
        while (it.hasNext()) {            
            System.out.println(it.next()); 
        }
       
    }
    
    
    
    
   
    
}
