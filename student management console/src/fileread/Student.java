
package fileread;




public class Student {
    
 String name;
 int age;
 String grade;
 int id;
 static int nextId=1;
 
  public Student (String name, int age, String grade){
     this.name = name;
     this.age = age;
     this.grade = grade;
     this.id = nextId++;
 }

   public String getName() {
        return name;
    }
}
