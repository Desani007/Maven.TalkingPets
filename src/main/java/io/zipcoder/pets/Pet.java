package io.zipcoder.pets;

import java.util.ArrayList;

public  class Pet {
    String name;
    int howMany;
    String breed;

    ArrayList<String> list = new ArrayList();

    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String speak(String speak) {
        return "quackkkkk!";
    }

    public int getHowmany() {
        return howMany;
    }

    public void setHowMany(int howMany) {

        this.howMany = howMany;
    }

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }



}
