package remote;

import java.util.ArrayList;
import java.util.List;

interface Empoyee {

    String getName();

    double monthlySalary();

    void displayDetails();

    public String getTypeNAme();
}

class javaDeveloper implements Empoyee {

    private String name;
    private double monthly;
    private  String designation = "Java Dweveloper";

    public javaDeveloper(String name, double monthly) {
        this.name = name;
        this.monthly = monthly;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double monthlySalary() {
        return monthly;
    }

    @Override
    public void displayDetails() {
        System.out.println("Empoyee : " + name + "| designation : " + designation + "| Monthly: " + monthly+ " BDT");
    }
    @Override
    public  String getTypeNAme(){
    return designation;
    }
}

class partTimeDev implements Empoyee {

    private String name;
    private double monthly;
    private double hour;
    public static String designation = "part time dev";

    public partTimeDev(String name, double monthly, double perHour) {
        this.name = name;
        this.monthly = monthly;
        this.hour = perHour;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double monthlySalary() {
        double actualHour = 8 - hour;
        return monthly * actualHour/8 ;
    }

    @Override
    public void displayDetails() {
        System.out.println("Empoyee : " + name + "| designation : " + designation + "| Monthly: " + monthlySalary()+ " BDT");
    }
    public  String getTypeNAme(){
    return designation;
    }
}

class intern implements Empoyee {

    private String name;
    private double monthly;
    public static String designation = "Intern";

    public intern(String name, double monthly) {
        this.name = name;
        this.monthly = monthly;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double monthlySalary() {
        return monthly * 0.7;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Empoyee Name: %s  | Designantion: %s | Monthly: %.1f  BDT \n", name, designation,monthly);
    }
    public  String getTypeNAme(){
    return designation;
    }
}

class EmopyeeManager{
   
   void displayAll(Iterable<Empoyee> empoyees){
     for (Empoyee emp: empoyees){
     emp.displayDetails();
     }
    }
   
   void totalSalaryNeedTobePaid(Iterable<Empoyee> empoyees, int TotalSize){
       double total=0; 
       for(Empoyee emp: empoyees){
        total = total+ emp.monthlySalary();
    }
       System.out.println("Total Empoyyees : "+TotalSize + " | total Salary cashOut : "+ total);
   }
   
    Empoyee removeEmpoyyeByName(Iterable<Empoyee> empoyees, String RemoveName){
       for (Empoyee emp : empoyees) {
           if (emp.getName().equalsIgnoreCase(RemoveName)) {
               return emp;
           }
  
       }
       return null;
   }
    
   void searchAndDisplay(Iterable<Empoyee> empoyees, String name){
      for(Empoyee emp: empoyees){
          if (emp.getName().equalsIgnoreCase(name)) {
              System.out.print("Found Requsred Empoyee: "+ name+"\n");
              emp.displayDetails();
          }
      }
   }
    public void filterEmployeesByType(String type, Iterable<Empoyee> empoyees) {
        System.out.println("\nEmployees of type: " + type);
        for (Empoyee employee :empoyees) {
            String typeName = employee.getTypeNAme();
            if (type.equalsIgnoreCase(typeName)) {
                employee.displayDetails();
            }
        }
    }
  
}

public class PolymorAbstraction {
    public static void main(String[] args) {
     List<Empoyee> empoyees = new ArrayList<>();
    EmopyeeManager hr = new EmopyeeManager();
    
    empoyees.add(new javaDeveloper("mutakim", 40000));
    empoyees.add(new partTimeDev("rahman", 30000, 6));
    empoyees.add(new intern("alfaz", 20000));
    empoyees.add(new javaDeveloper("sabber", 45000));
    empoyees.add(new javaDeveloper("khan", 75000));
    empoyees.add(new partTimeDev("kabir", 70000, 4));
    
    hr.displayAll(empoyees);
    int TotalSize = empoyees.size();
    hr.totalSalaryNeedTobePaid(empoyees, TotalSize);
    
    //remove by name -- reutn the obj to remove
     Empoyee removeIt =  hr.removeEmpoyyeByName(empoyees,"sabber");
     
     if (removeIt != null) {
         empoyees.remove(removeIt);
         System.out.println("Emopyye is removed\n");
      }
    // serach empoyye to display deatils
   hr.searchAndDisplay(empoyees,"kabir");
   hr.filterEmployeesByType("Java Dweveloper", empoyees);
}
}
