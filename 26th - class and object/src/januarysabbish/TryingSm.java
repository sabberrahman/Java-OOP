package januarysabbish;

import java.util.List;
import java.util.ArrayList;

public class TryingSm {

    public static void main(String[] args) {
        Person obj = new Person("sabber", 20);
        Person newObj = updateObjAge(obj, 30);
        System.out.println(obj.getAge()); // still same
        System.out.println("new : " + newObj.getAge());
        
        obj.setName("rahman");
        System.out.println(obj.toString());

        List<String> mylisttt = new ArrayList<>();
        mylisttt.add("Apple");
        mylisttt.add("Banana");
        mylisttt.add("Cherry");
        
        System.out.println(mylisttt.indexOf("Banana")); // index or -1 

    }

    static Person updateObjAge(Person obj, int ChangeAge) {
        return obj = new Person(obj.getName(), ChangeAge);
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public void setName(String n) {
         this.name=n;
    }
    

    public int getAge() {
        return age;
    }
}
