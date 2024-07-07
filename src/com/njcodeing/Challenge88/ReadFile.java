package com.njcodeing.Challenge88;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        System.out.println("Welcome to read your file\n");
        System.out.print("Please Enter the name of file you want to read: ");
        Scanner input=new Scanner(System.in);
        String fileName=input.next();

        try(FileReader reader=new FileReader(fileName)){
            int read=0;
            do{
                read=reader.read();
                System.out.print((char)read);
            }while(read != -1);
        }catch(IOException e){
            System.out.println("Exception found with msg: "+e.getMessage());
        }
    }

}
