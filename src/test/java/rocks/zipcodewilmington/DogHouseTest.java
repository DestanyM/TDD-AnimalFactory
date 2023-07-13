package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog(){
        String name = "Milo";
        Date birthDate = new Date();
        DogHouse.clear();

        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse doghouse = new DogHouse();
        doghouse.add(dog);
        Object expected = 1;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer Id = 3;
        DogHouse.clear();


        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse doghouse = new DogHouse();
        doghouse.remove(3);
        Object expected = 0;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog(){
        String name = "Milo";
        Date birthDate = new Date();
        DogHouse.clear();


        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse doghouse = new DogHouse();
        doghouse.remove(dog);
        Object expected = 0;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById(){
        String name = "Milo";
        Date birthDate = new Date();
        Integer Id = 3;
        DogHouse.clear();


        Dog dog = new Dog(name, birthDate, Id);
        DogHouse doghouse = new DogHouse();
        doghouse.add(dog);
        //Object expected = 3;

        Assert.assertEquals(dog, DogHouse.getDogById(3));
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        String name = "Milo";
        Date birthDate = new Date();
        DogHouse.clear();


        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse dogHouse = new DogHouse();
        Object expected = 0;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }
}
