
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TryingAgain {
    static int book_id;
    public static void main(String[] args) throws IOException {
      ArrayList<User> admin = new ArrayList<>();
      ArrayList<Book> allBook = new ArrayList<>();  
     Scanner input = new Scanner(System.in);
      
      Boolean isrunning=true;
        while (isrunning) { 
        
        System.out.println("What program do you want to run");
        System.out.println("1. Create Admin");
        System.out.println("2. Add new Book");
        System.out.println("3. Show all Books");
        System.out.println("4. Borrow a book ");
        System.out.println("5. Exit the program...");
        System.out.print("Enter your Choice : ");
        
       
         int picked = input.nextInt();
         
        
        switch (picked) {
            case 1:
                // create admin 
              Scanner AdminInput = new Scanner(System.in);
              
                System.out.print("Enter Admin Name : ");
                String AdminName =AdminInput.nextLine();                
                AdminInput.nextLine();
                
                System.out.println(AdminName);
                System.out.print("Enter Admin Password : ");
                int AdminPassword = AdminInput.nextInt();
                AdminInput.close();
                User NewUser= new User(AdminName,AdminPassword);
                admin.add(NewUser);
                
               
                System.out.println("Admin Created Succesfully...");
                System.out.println(admin.size());
               
                File filePath = new File("Admin.txt");
                FileWriter writeAdmin = new FileWriter(filePath,true);
                writeAdmin.write(AdminName+","+AdminPassword+"\n");
                writeAdmin.close();
                 break;
           
            case 2:
                Scanner BookIn = new Scanner(System.in);
            
                System.out.print("Enter Book Title : ");
                String BookName = BookIn.nextLine();                
                
                
                System.out.print("Enter AuthorName : ");
                String AuthorName = BookIn.nextLine();
                BookIn.close();
                
                Book addBook = new Book(BookName,AuthorName);
                allBook.add(addBook);
                
                
                System.out.println("Boook added");
                
                File bookPath = new File("Book.txt");
                FileWriter bookWrite = new FileWriter(bookPath,true);
                bookWrite.write(BookName+","+AuthorName+","+ book_id+"\n");
                bookWrite.close();
                System.out.println("Saved it to the txt file");
                  break;             
           
            case 3: 
                for( Book b: allBook){
                    System.out.println("Book age : "+b.username+ ", Author name : "+
                            b.password+ ", Book id: "+ b.bookId);
                };
                break;
            case 4: 
                Scanner Check = new Scanner(System.in);
                System.out.println("to Borrow book, please enter your username");
                String checkUsername = Check.nextLine();
                
                System.out.println("please enter your password");
                int CheckPassword = Check.nextInt();
                
                Boolean isAuth= admin.contains(checkUsername);
                if (isAuth) {
                    System.out.println("You can borrow book");
                    
                    // pick book
                    for( Book b: allBook){
                    System.out.println("Book age : "+b.username+ ", Author name : "+
                            b.password + "Book Id: "+b.bookId);
                        };
                        
                     //choose 
                     System.out.println("Choose which book to borrow (Authorname)");
                     String whichBook = Check.nextLine();
                     
                     File borrowList = new File("BorrowList.txt");
                     FileWriter writeBorrow = new FileWriter(borrowList);
                     writeBorrow.write(checkUsername+ "has Borrowed"+ whichBook);
                     writeBorrow.close();          
                }else{
                    System.out.println("you are not Authentaize");
                }
                break;
            case 5: 
                isrunning=false;
                System.out.println("Exiting the programm.... ");
                break;
            default:
                System.out.println("Please enter valid input");;
        }
        
        
        }
        
       input.close();
       
      
    }
}


// class User{
//  public String username;
//  public int password;
//
// 
//     
//  User(String username,int password){
//    this.username= username;
//    this.password=password;
//}
//}

//class Book{
//     public String username;
//     public int password;
//     public int bookId;
//     
//     
//void Book(String username,int password,int Bookid){
//this.username= username;
//this.password=password;
//this.bookId=Bookid;
//}
//}
