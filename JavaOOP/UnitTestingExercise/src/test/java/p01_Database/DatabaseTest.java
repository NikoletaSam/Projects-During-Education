package p01_Database;

import org.junit.Assert;
import org.junit.Test;
import javax.naming.OperationNotSupportedException;

public class DatabaseTest {

    @Test
    public void testSetElementsForElementsMoreThanZeroAndLessThanSeventeen() throws OperationNotSupportedException {
        Integer[] numbers = fillArrayWithNumbers(10);
        Database databaseTest = new Database(numbers);

        Assert.assertArrayEquals(numbers, databaseTest.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testSetElementsForZeroElements() throws OperationNotSupportedException {
        Integer[] numbers = fillArrayWithNumbers(0);
        Database database = new Database(numbers);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testSetElementsForMoreThanSixteenElements() throws OperationNotSupportedException {
        Integer[] numbers = fillArrayWithNumbers(20);
        Database database = new Database(numbers);
    }

    @Test
    public void testAddMethod() throws OperationNotSupportedException {
        Integer[] numbers = fillArrayWithNumbers(10);
        Database database = new Database(numbers);

        Integer[] newNumbers = new Integer[11];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        newNumbers[newNumbers.length - 1] = 10;

        database.add(10);
        Assert.assertArrayEquals(newNumbers, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullElement() throws OperationNotSupportedException {
        Integer[] numbers = fillArrayWithNumbers(10);
        Database database = new Database(numbers);

        database.add(null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAddSeventeenthElement() throws OperationNotSupportedException {
        Integer[] numbers = fillArrayWithNumbers(16);
        Database database = new Database(numbers);

        database.add(16);
    }

    @Test
    public void testRemovingElementFromValidArray() throws OperationNotSupportedException {
        Integer[] arrWithRemovedNumber = fillArrayWithNumbers(15);
        Integer[] arrWithFullNumbers = fillArrayWithNumbers(16);

        Database database = new Database(arrWithFullNumbers);
        database.remove();

        Assert.assertArrayEquals(arrWithRemovedNumber, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemovingElementFromEmptyArray() throws OperationNotSupportedException {
        Integer[] numbers = fillArrayWithNumbers(0);
        Database database = new Database(numbers);

        database.remove();
    }

    private Integer[] fillArrayWithNumbers(int numbersCount){
        Integer[] numbers = new Integer[numbersCount];
        for (int i = 0; i < numbersCount; i++) {
            numbers[i] = i;
        }
        return numbers;
    }
}
