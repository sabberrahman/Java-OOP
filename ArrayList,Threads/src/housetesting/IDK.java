

import java.util.Arrays;

public class Remote {

    public static void main(String[] args) {
        String[] stringArray = new String[5];
        stringArray[0] = "Apple";
        stringArray[1] = "Banana";
        stringArray[2] = "Cherry";
        stringArray[3] = "Date";
        stringArray[4] = "Elderberry";

        String searchValue = "Cherry";
        int index = searchArray(stringArray, searchValue);

        System.out.println(index);

        // obj in array - you can CRUD by[i]
        Person[] myPerson = new Person[3];
        myPerson[0] = new Person("sabber", 20);
        myPerson[1] = new Person("rahman", 30);
        myPerson[2] = new Person("srs", 25);

        System.out.println("person [] has .. : " + Arrays.toString(myPerson));
        System.out.println("person [] has .. : " + myPerson.length);
        
        // add new value in pure array
        
        // Just Person and not Person[] bcoz it create a single instance of Person obj
        Person newAdd = new Person("jjk",33);
        Person[] Person = AddNewPerson(myPerson, newAdd);
        System.out.println("mew array : " + Person.length);
        System.out.println("\n person [] has .. : " + Arrays.toString(Person));
    }

   public static int searchArray(String[] stringArray, String searchValue) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] != null && stringArray[i].equals(searchValue)) {
                return i;
            }
        }
        return -1;
    } 
    public static Person[] AddNewPerson(Person[] oldArray, Person newValue){
         Person[] newArray = new Person[oldArray.length + 1];
         System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
         newArray[oldArray.length]= newValue;
         return newArray;
   }
}
  




class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nPerson{name='" + name + "', age=" + age + "}";
    }
}
