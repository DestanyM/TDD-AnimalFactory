package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testNewDog(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer Id = 0;

        Dog dog = new Dog(name, birthDate, Id);
        String expected = "Milo";

        Assert.assertEquals(expected, dog.getName());
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer Id = 0;

        Dog dog = new Dog(name, birthDate,Id);
        String expected = "bark!";

        Assert.assertEquals(expected, dog.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer Id = 0;

        Dog dog = new Dog(name,birthDate, Id);
        Date expected = new Date();

        Assert.assertEquals(expected, dog.getBirthDate());

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testDogEat(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer Id = 0;

        Dog dog = new Dog(name,birthDate, Id);
        Food foodToEat = new Food();

        Object expected = 1;
        dog.eat(foodToEat);
        // Then
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer Id = 0;

        Dog dog = new Dog(name,birthDate, Id);
        Integer expected = 0;

        Assert.assertEquals(expected, dog.getId());
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer Id = 0;

        Dog dog = new Dog(name,birthDate, Id);

        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer Id = 0;

        Dog dog = new Dog(name,birthDate, Id);

        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
