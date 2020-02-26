package io.zipcoder.pets;


import org.junit.Assert;
import org.junit.Test;

public class BirdTest {



    @Test
    public void speakTest() {
        Bird bird = new Bird();
        String expected = "Meaow";
        String actual =bird.speak("Meaow");
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void nameTest() {
        Bird bird = new Bird();
        String expected="Kasper";
        String actual =bird.name("Kasper");
        Assert.assertEquals(expected,actual);

    }
}
