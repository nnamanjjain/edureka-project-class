package com.njcodeing.Challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryToCapitalMap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Map<String, String> country=new HashMap<>();
        country.put("India", "Delhi");
        country.put("The United States Of America", "Washington DC");
        country.put("USA", "Washington DC");
        country.put("Russia", "Moscow");
        country.put("England", "London");

        country.put("Canada", "Toronto");
        country.put("China", "Beijing");
        System.out.println("Welcome to Know the Capital Game\n");
        System.out.print("Please Enter the Country name you want to know the capital: ");
        String countryName=input.next();
        if(country.containsKey(countryName)){
            System.out.printf("The capital of %s is: %s",countryName, country.get(countryName));
        }else {
            System.out.println("Sorry Don't know the capitol of "+countryName);
        }
    }
}
