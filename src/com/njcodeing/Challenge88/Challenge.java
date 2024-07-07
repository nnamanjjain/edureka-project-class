package com.njcodeing.Challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("Welcome to read your file\n");
        System.out.print("Please Enter the name of file you want to read: ");
        Scanner input=new Scanner(System.in);
        String fileName=input.next();

        try(FileReader reader=new FileReader(fileName)){
            int read;
            while((read=reader.read()) != -1){
                System.out.print((char)read);
            }
        }catch(FileNotFoundException e){
            System.out.printf("File Not Found Exception Found with msg %s:", e.getMessage());
        }catch(IOException e){
            System.out.println("Exception found with msg: "+e.getMessage());
        }
    }
}
