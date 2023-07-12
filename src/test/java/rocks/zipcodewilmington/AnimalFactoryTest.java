package rocks.zipcodewilmington;

import org.junit.Test;
import org.junit.Assert;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testAnimalcreateDog(){
        String name = "Fluffy";
        Date birthDate = new Date();

        AnimalFactory animalFactory = new AnimalFactory();
        Dog dog = animalFactory.createDog(name, birthDate);

        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(birthDate, dog.getBirthDate());

    }



    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testAnimalcreateCat(){
        String name = "Kitty";
        Date birthDate = new Date();

        AnimalFactory animalFactory = new AnimalFactory();
        Cat cat = animalFactory.createCat(name, birthDate);

        Assert.assertEquals(name, cat.getName());
        Assert.assertEquals(birthDate, cat.getBirthDate());

    }

}
