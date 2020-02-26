package io.zipcoder.pets;


import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {


        @Test
        public void speakTest(){
            Pet pet = new Pet();
            String expected ="quackkkkk!";
            String actual= pet.speak("quackkkkk!");
            Assert.assertEquals(expected,actual);
        }

        @Test
        public void nameTest(){
            Pet pet = new Pet();
            String expected = "Kasper";
            pet.setName("Kasper");
            String actual = pet.getName();
            Assert.assertEquals(expected,actual);
        }


}
