package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testCatHouseAdd(){
        String name = "Lolly";
        Date birthDate = new Date();
        CatHouse.clear();

        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse cathouse = new CatHouse();
        cathouse.add(cat);
        Object expected = 1;

        Assert.assertEquals(expected, CatHouse.getNumberOfCats());

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testCatHouseRemoveInt(){
        String name = "Lolly";
        Date birthDate = new Date();
        Integer Id = 3;
        CatHouse.clear();


        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse cathouse = new CatHouse();
        cathouse.remove(3);
        Object expected = 0;

        Assert.assertEquals(expected, CatHouse.getNumberOfCats());

    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testCatHouseRemoveCat(){
        String name = "Lolly";
        Date birthDate = new Date();
        CatHouse.clear();


        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse cathouse = new CatHouse();
        cathouse.remove(cat);
        Object expected = 0;

        Assert.assertEquals(expected, CatHouse.getNumberOfCats());

    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testgetCatByID(){
        String name = "Lolly";
        Date birthDate = new Date();
        Integer Id = 3;
        CatHouse.clear();


        Cat cat = new Cat(name, birthDate, Id);
        CatHouse cathouse = new CatHouse();
        cathouse.add(cat);
        //Object expected = 3;

        Assert.assertEquals(cat, CatHouse.getCatById(3));

    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testgetNumberOfCats(){
        String name = "Lolly";
        Date birthDate = new Date();
        CatHouse.clear();


        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse cathouse = new CatHouse();
        Object expected = 0;

        Assert.assertEquals(expected, CatHouse.getNumberOfCats());

    }
}
