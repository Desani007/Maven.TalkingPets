package io.zipcoder.pets;


import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class DogTest {


    @Test
    public void speakTest() {
        Dog dog = new Dog();
        String expected = "Bark!";
        String actual =dog.speak("Bark!");
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void nameTest() {
        Dog dog = new Dog();
        String expected="Kasper";
        String actual =dog.name("Kasper");
        Assert.assertEquals(expected,actual);

    }

}
