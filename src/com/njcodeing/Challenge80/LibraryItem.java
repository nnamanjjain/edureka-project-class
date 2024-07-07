package com.njcodeing.Challenge80;

public class LibraryItem {
    String itemID;
    String author;
    String title;

    void checkOut(){
        System.out.println("Checkout");
    }
    void returnItem(String itemID){
        System.out.println("Thanks for returning the book..Hope you Enjoy the reading");
    }
}
