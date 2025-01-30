package januarysabbish;

import java.util.ArrayList;

public class IDk {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "123 Street"));
        people.add(new Person("Bob", 30, "456 Avenue"));
        people.add(new Person("Charlie", 35, "789 Road"));
        
        
    
        
        Person personToRemove= people.get(1);
       people.remove(personToRemove);   
       for(Person p:people){
            System.out.println(p.name);
        }
       
       
       // index of by value
       int index= people.indexOf(new Person("Bob", 30, "456 Avenue"));
        System.out.println(index);
       
    }
}

class Person {

    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }
}
