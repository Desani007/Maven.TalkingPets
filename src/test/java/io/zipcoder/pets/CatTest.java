package io.zipcoder.pets;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CatTest {

    @Test
    public void speakTest() {
        Cat cat = new Cat();
        String expected = "Meaow";
        String actual =cat.speak("Meaow");
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void nameTest() {
        Cat cat = new Cat();
        String expected="Kasper";
        String actual =cat.name("Kasper");
        Assert.assertEquals(expected,actual);

    }


}
