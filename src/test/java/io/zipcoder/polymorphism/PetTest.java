package io.zipcoder.polymorphism;
import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void testSpeak(){
        //given
        Dog newDog = new Dog();
        Cat newCat =  new Cat  ();
        Bird newBird = new Bird();
        String dogBark = "Woof!";
        String catMeow = "Meow!";
        String birdNoise = "Bird Noise";

        //when
        String dogSound = newDog.speak(dogBark);
        String catSound = newCat.speak(catMeow);
        String birdSound = newBird.speak(birdNoise);

        //then
        Assert.assertEquals(dogBark, dogSound);
        Assert.assertEquals(catMeow, catSound);
        Assert.assertEquals(birdSound, birdNoise);

    }



}
