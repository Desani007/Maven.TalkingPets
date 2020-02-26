package io.zipcoder.polymorphism;

import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class User {
    static Pet pet = new Pet();
    static ArrayList userList = new ArrayList();


    public static void userInput () {


        Scanner scanner = new Scanner(System.in);
        int numberOfPets = 0;
        String kindaPet = "";
        String namesofpet = "";
        try {
            System.out.println("How many pets do you have?");


            numberOfPets = scanner.nextInt();
            pet.setHowMany(numberOfPets);
        } catch (NumberFormatException e) {
            System.out.println("INVALID INPUT");
        }
        try {
            System.out.println("what kinda of pet is it");
            int counter = 0;
            while (counter <= numberOfPets) {
                kindaPet = scanner.nextLine();
                pet.setBreed(kindaPet);
                counter++;
            }
            int counter2 = 0;
            System.out.println("What are there names?");
            while (counter2 < numberOfPets) {
                namesofpet = scanner.nextLine();
                pet.setName(namesofpet);
                userList.add(pet.getName());

                counter2++;
            }
            System.out.println("Thank you!, here is a list of pets");
            System.out.println(list());

        } catch (Exception e) {
            System.out.println("INVALID INPUT");
        }

    }



       public static  ArrayList<String> list(){
            return userList;
        }


    }






