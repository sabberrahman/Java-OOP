
The equals() method of the Object class compares the equality of two objects. 
The two objects will be equal if they share the same memory address.

System.out.println(s1 == s2);       // false (checks reference)
System.out.println(s1.equals(s2));  // true (checks value)

int[] numbers = {10, 20, 30, 40};
int target = 30;
int index = -1;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        index = i;
        break;
    }
}
-------------
List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");

int index = list.indexOf("Banana");
-------------------

class Person {
    String name;
    int age;
    String address; // Field we don't want to clone

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Custom method to clone only name and age
    public Person partialClone() {
        return new Person(this.name, this.age, null); // Skip[omh  address
    }
}

// Usage
Person person1 = new Person("Bob", 30, "123 Street");
Person person2 = person1.partialClone(); // Clone only name and age

=====================================
class Person {
    String name;
    int age;
    String address;

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address; 
    }
}

// Usage
Person person1 = new Person("David", 40, "456 Avenue");
Person person2 = new Person(person1); 
==========================================
  public Person conditionalClone(boolean includeAddress, boolean updateAge, boolean deleteEmploymentStatus) {
        String clonedName = this.name; // Always include name
        int clonedAge = updateAge ? this.age + 1 : this.age; // Conditionally update age
        String clonedAddress = includeAddress ? this.address : null; // Conditionally include address
        boolean clonedEmploymentStatus = deleteEmploymentStatus ? false : this.isEmployed; // Conditionally delete employment status

        return new Person(clonedName, clonedAge, clonedAddress, clonedEmploymentStatus);
    }
--------------------------------------------------------
When you print an object 
(e.g., System.out.println(person)),
Java automatically calls the toString() method to get the string representation of the object.

If you don't override toString(), the default implementation from the Object class is used,

Person@1a2b3c4d
(This is not very useful, as it only shows the class name and the object's hash code.)
=====================================
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Person{name='").append(name)
      .append("', age=").append(age)
      .append(", address='").append(address)
      .append("', isEmployed=").append(isEmployed)
      .append("}");
    return sb.toString();
}
=====================


