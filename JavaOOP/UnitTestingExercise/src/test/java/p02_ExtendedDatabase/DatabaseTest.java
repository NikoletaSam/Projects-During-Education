package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private Database database;
    private Person[] people;

    @Test
    public void testSetElementsForPositiveLessThanSixteenElements() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(10);
        this.database = new Database(people);

        Assert.assertArrayEquals(people, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testSetElementsForMoreThanSixteenElements() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(18);
        this.database = new Database(people);

        Assert.assertArrayEquals(people, database.getElements());
    }

    @Test
    public void testAddElementsForValidInput() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(11);
        this.database = new Database(people);

        Person personToAdd = new Person(12, "Person12");
        Person[] newArr = new Person[12];
        System.arraycopy(people, 0, newArr, 0, people.length);
        newArr[11] = personToAdd;

        database.add(personToAdd);

        Assert.assertArrayEquals(newArr, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddElementsForPeopleWithSameID() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(10);
        this.database = new Database(people);

        Person personToAdd = new Person(2, "Person11");
        database.add(personToAdd);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullElementThrowsException() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(10);
        this.database = new Database(people);

        database.add(null);
    }

    @Test
    public void testRemoveMethodForValidAmountOfElements() throws OperationNotSupportedException {
        Person[] peopleWithRemovedPerson = fillArrayWithPeople(9);
        this.people = new Person[10];
        System.arraycopy(peopleWithRemovedPerson, 0, people, 0, peopleWithRemovedPerson.length);
        people[people.length - 1] = new Person(10, "Person10");

        this.database = new Database(people);
        database.remove();

        Assert.assertArrayEquals(peopleWithRemovedPerson, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveMethodThrowsExceptionForNullElements() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(0);
        this.database = new Database(people);

        database.remove();
    }

    @Test
    public void testFindByUsernameReturnsPersonForValidInput() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(10);
        this.database = new Database(people);

        String username = people[2].getUsername();
        Person personToFind = database.findByUsername(username);

        Assert.assertEquals(people[2], personToFind);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameThrowsExceptionForNoUserWithThisUsername() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(10);
        this.database = new Database(people);

        String username = "Pesho";
        Person personToFind = database.findByUsername(username);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameThrowsExceptionForNullUsername() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(10);
        this.database = new Database(people);

        Person personToFind = database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameThrowsExceptionForMoreThanOnePersonWithThisUsername() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(10);
        this.database = new Database(people);

        this.database.add(new Person(3, "Person3"));
        String usernameToCheck = "Person3";
        this.database.findByUsername(usernameToCheck);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameThrowsExceptionBecauseOfUpperOrLowerCaseChangesInValidUsername() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(10);
        this.database = new Database(people);

        String usernameToCheck = "PERson4";
        this.database.findByUsername(usernameToCheck);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIDThrowsExceptionWhenNoUserWithSuchID() throws OperationNotSupportedException {
        this.people = fillArrayWithPeople(10);
        this.database = new Database(people);

        int idToCheck = 150;
        this.database.findById(idToCheck);
    }

    private Person[] fillArrayWithPeople(int numOfPeople){
        Person[] people = new Person[numOfPeople];
        for (int i = 1; i <= numOfPeople; i++) {
            String name = "Person" + i;
            int id = i;
            Person currentPerson = new Person(id, name);
            people[i - 1] = currentPerson;
        }

        return people;
    }
}
