
package fileread;
import java.io.File; 
import java.io.FileNotFoundException;
 import java.io.FileWriter;
 import java.io.IOException;  
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// import java.util.List;
import java.util.Scanner;

public class FileRead {
  public static void main(String[] args) {
      ArrayList<Student> allStudent = new ArrayList<>();
      
     
      
      // Creating file txt
    try {
      File myDoc = new File("filename.txt");
      if (myDoc.createNewFile()) {
        System.out.println("File created: " + myDoc.getName());
      } else {
        System.out.println("File already Created.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
    
    // reading eisting data
        try {
            File file = new File("filename.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {              
                String line = scanner.nextLine();
                
                // "Sabber, 12, A+, 2" -> ["Sabber", "12", "A+", "2"].
                String[] data = line.split(",");
                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                String grade = data[2].trim();
               
                Student student = new Student(name, age, grade);
                allStudent.add(student);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
          
       // Printting all student
          for (Student s : allStudent) {
            System.out.println("Student name: "+ s.name+ 
                    ", grade: "+ s.grade);
        }
          
          Boolean running = true;
          while (running) {          
           Scanner mainInput = new Scanner(System.in);
           System.out.println("   ");
          System.out.println("What action do you want to make");
          System.out.println("1. Add New Stduent");
          System.out.println("2. Search studdent by name ");
          System.out.println("3. Delete studdent by name ");
          System.out.println("4. Show all Student Record ");
          System.out.println("5. Exit the programm ");
          System.out.println("--------------------------------");
          
          int picked = mainInput.nextInt();
          
          switch (picked) {
          case 1:
              // Add 
          try {
      FileWriter myWriter = new FileWriter("filename.txt",true);
      
      System.out.println("===Add new student : (e.x. sabber,30,A+)====");
      Scanner input = new Scanner(System.in);
     String newStudent =input.nextLine();
      
     
      myWriter.write(newStudent+ "\n");
      myWriter.close();
      
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }    
              break;
           case 2:
               // Search 
            try {
            Scanner input = new Scanner(System.in);
            System.out.println("Search student name by name : ");
            String findByName =input.nextLine();
            
            File file = new File("filename.txt");
            Scanner scanner = new Scanner(file);
            Boolean isItFound= false;

            while (scanner.hasNextLine()) {              
                String line = scanner.nextLine();
                
                // "Sabber, 12, A+, 2" -> ["Sabber", "12", "A+", "2"].
                String[] data = line.split(",");
                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                String grade = data[2].trim();
                
                if (findByName.equals(name)) {
                    System.out.println("Student Found! --name: "+name+", age: "+
                            age+ ", grade: "+ grade);
                    isItFound=true;
                }
            }
            
            if (!isItFound) {
                    System.out.println("Student not Found");
                }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    
              break;
           case 3:
               // Delete
              try {
            Scanner input = new Scanner(System.in);
            System.out.println("Search student name by name : ");
            String findByName =input.nextLine();
            
            File file = new File("filename.txt");
            Scanner scanner = new Scanner(file);
            Boolean isItFound= false;

            
             List<String> allData = new ArrayList<>();
            while (scanner.hasNextLine()) {              

                 String line = scanner.nextLine();
                // "Sabber, 12, A+, 2" -> ["Sabber", "12", "A+", "2"].
                String[] data = line.split(",");
                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                String grade = data[2].trim();
                
                
                if (findByName.equals(name)) {       
                   System.out.println("Student record deleted!-- Name was : "+findByName);
                    isItFound=true;
                    continue;
                  
                }
               allData.add(line);  
            }
            scanner.close();
            
            FileWriter myWriter = new FileWriter("filename.txt");
            for (String data : allData) {
                myWriter.write(data + "\n");  // Write each line
            }
              myWriter.close();
             
            if (!isItFound) {
                    System.out.println("Student not Found");
                }
            
            scanner.close();
            break;
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
              break;
              case 5:
               running=false;
               System.out.println("Exiting the programm.........");
              break;
               case 4:
                 for (Student s : allStudent) {
            System.out.println("Student name: "+ s.name+ 
                    ", grade: "+ s.grade);
        }
              break;
          default:
              System.out.println("Please enter vaild Num(1-3)");;
      }
      }
         
          
      
    
  }
  
//    static void loadStudentsFromFile(ArrayList<Student> allStudent) {
//        File file = new File("filename.txt");
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] data = line.split(",");
//                String name = data[0].trim();
//                int age = Integer.parseInt(data[1].trim());
//                String grade = data[2].trim();
//                allStudent.add(new Student(name, age, grade));  // Add student to the list
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found: " + e.getMessage());
//        }
//    }
}