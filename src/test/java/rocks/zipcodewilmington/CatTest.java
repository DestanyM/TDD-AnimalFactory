package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static junit.runner.Version.id;
import static rocks.zipcodewilmington.animals.Cat.*;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName(){
        //Given
        String name = "Lolly";
        Date birthDate = new Date();
        Integer Id = 0;

        //When
        Cat cat = new Cat(name, birthDate, Id);
        cat.setName("Holly");
        String expected = "Holly";
        //Then
        Assert.assertEquals(expected, cat.getName());


    }
    // TODO - Create tests for `speak`
    @Test
    public void testCatSpeak() {
        //Given
        String name = "Lolly";
        Date birthDate = new Date();
        Integer Id = 0;
        //When
        Cat cat = new Cat(name, birthDate, Id);
        String expected = "meow!";
        //Then
        Assert.assertEquals(expected, cat.speak());

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void catSetBirthDate(){
        // Given
        String name = "Lolly";
        Date birthDate = new Date();
        Integer Id = 0;
        // When
        Cat cat = new Cat(name, birthDate, Id);
        Date expected = new Date();

        // Then
        Assert.assertEquals(expected, cat.getBirthDate());

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testCatEat(){
        // Given
        String name = "Lolly";
        Date birthDate = new Date();
        Integer Id = 0;
        // When
        Cat cat = new Cat(name, birthDate, Id);
        Food foodToEat = new Food();

        Object expected = 1;
        cat.eat(foodToEat);
        // Then
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        String name = "Lolly";
        Date birthDate = new Date();
        Integer Id = 2;

        Cat cat = new Cat(name, birthDate, Id);
        Integer expected = 2;

        Assert.assertEquals(expected, cat.getId());

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        String name = "Lolly";
        Date birthDate = new Date();
        Integer Id = 0;

        Cat cat = new Cat(name, birthDate, Id);

        Assert.assertTrue(cat instanceof Animal);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        String name = "Lolly";
        Date birthDate = new Date();
        Integer Id = 0;

        Cat cat = new Cat(name, birthDate, Id);

        Assert.assertTrue(cat instanceof Mammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
