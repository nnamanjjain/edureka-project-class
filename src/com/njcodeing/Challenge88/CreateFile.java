package com.njcodeing.Challenge88;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void createFile(String filename){
        try(FileWriter writer=new FileWriter(filename)){
            writer.write("Hi All\nI am here to learn Java.");
            writer.flush();
            System.out.println("Data written successfully");
        }catch(IOException e){
            System.out.println("Exception is found..reason is: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Create and Write File\n");
        System.out.print("Please enter the filename you want to create: ");
        String filename=input.next();
        createFile(filename);
    }
}
