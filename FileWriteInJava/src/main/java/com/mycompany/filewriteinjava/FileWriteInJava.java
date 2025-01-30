

package com.mycompany.filewriteinjava;

import java.io.File;
import java.io.IOException;



public class FileWriteInJava {

    public static void main(String[] args) {
    //Create file 
     File myTxt= new File("myDoc.txt");
        try {
            myTxt.createNewFile();
            System.out.println("File Created");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
