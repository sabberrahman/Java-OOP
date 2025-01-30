
package firstjava;

import java.util.ArrayList;
import java.util.Scanner;


public class Firstjava {

    public static void main(String[] args) {
       ArrayList<Student> all = new ArrayList<>();
       Scanner input = new Scanner(System.in);
       all.add(new Student("sabber", 232,"D"));
       all.add(new Student("ber", 434,"A"));
       all.add(new Student("jabb", 32,"B"));
        
       Boolean running = true;  // keep suggesting
       
        while (running) { 
            System.out.println("----------------------------");
       System.out.println("What action do you want to make");
     
       System.out.println("1. Create new student");
       System.out.println("2. View all student");
       System.out.println("3. Update a student Record by id");
       System.out.println("4. Delete a student record by id");
       System.out.println("5. Search for a student by name or id");
       System.out.println("6. Exit the program");
       System.out.println("----------------------------");
       System.out.println("Enter your Choice : ");
       int yourChoice =input.nextInt();
     
        switch (yourChoice){
            case 1:
               System.out.println("Enter student Name : ");
               String name=input.nextLine();
               input.nextLine();
               
               System.out.println("Enter student Age : ");
               int age=input.nextInt();
               input.nextLine();
               
               System.out.println("Enter student Grade : ");
               String grade=input.nextLine();
 
               
               all.add(new Student(name, age, grade));
               System.out.println("Student added! - { name: "+ name  + " Age: "+
                       age+ " Grade: "+ grade + "}" );
               System.out.println("Total student now : "+ all.size());
             break;
             case 2:
               for(Student s: all){
               System.out.println("Student Id: "+ s.id+" - { name: "+ s.name+ ", age: "+s.age +
                       ", grade: "+ s.grade + " }");
         
               }
                 System.out.println("Total student now : "+ all.size());
             break;
             case 3:
               System.out.println("Enter student id for updating");
               int id = input.nextInt();
               input.nextLine();
               Boolean isUpdated= false;
               
               for (Student s: all){
               if(s.id == id){
               System.out.println("Enter new student Name : ");
               String updatedName =input.nextLine();
              
               
               System.out.println("Enter  new student Age : ");
               int updatedAge =input.nextInt();
               input.nextLine();
               
               System.out.println("Enter new student Grade : ");
               String updatedGrade =input.nextLine();
               
               s.name = updatedName;
               s.age= updatedAge;
               s.grade= updatedGrade;
               
               System.out.println("Student record updated!! -  name: "+ s.name+ ", Age: "+s.age+
                       ", grade: "+ s.grade );
               isUpdated= true;
               break;
               }
               
               if(!isUpdated) {
                 System.out.println("Please enter valid id");
                 break;
                 }
              
               }
                           
             break;
             case 4:
               System.out.println("Enter student id to delete (ex. 1,2,3)");
               int deleteId= input.nextInt();
               input.nextLine();
               
               Boolean paisi= false; 
               
               for (Student s: all){   
               if(s.id == deleteId){
               all.remove(s);
               System.out.println("Stduent record deleted from database..");
               System.out.println("Now Total Student: "+ all.size());
               paisi= true;
               break;
               }
              
               }
               if(!paisi) {
               System.out.println("Stduent id not Found");
               break;
               }
             break;
             
             case 5:
               System.out.println("Search stduent record by 1.Name or 2.ID ");
               int picked =input.nextInt();
               input.nextLine();
                  
                 switch (picked) {
                     case 1:
                        System.out.println("Enter Student name");
                        String pickedName=input.nextLine();
                        
                        Boolean SearchFounded = false;
                        
                        for(Student s: all){
                        if(pickedName.equals(s.name)){
                            System.out.println("Student Founded! - name: "+ s.name+ ", age: "+ s.age+ 
                                    ", grade: "+ s.grade);
                            SearchFounded= true;
                            break;
                        }
                        }
                        
                         if (!SearchFounded) {
                             System.out.println("Student not found. please neter vaild name");
                             break;
                         }
                        
                        
                         break;
                      case 2:
                         System.out.println("Enter Student id");
                         int pickedId=input.nextInt();
                           Boolean SearchFoundedForAge = false;
                        
                        for(Student s: all){
                        if(s.id == pickedId){
                            System.out.println("Student Founded! - name: "+ s.name+ ", age: "+ s.age+ 
                                    ", grade: "+ s.grade);
                            SearchFoundedForAge= true;
                            break;
                        }
                        }
                        
                         if (!SearchFoundedForAge) {
                             System.out.println("Student not found. please neter vaild name");
                             break;
                         }
                         
                        break;
                     default:
                         System.out.println("Invaild Name or ID ");
                 }
             
              
              
             break;
             
             case 6:
               System.out.println("Existing.....");
               running= false;
             break;
             
            default:
                System.out.println("Please enter valid Resspond (1-5)");
        }
        }
       
      
    }
    
}
