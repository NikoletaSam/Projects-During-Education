package p03_IteratorTest;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public class ListIteratorTest {
    private ListIterator listIterator;
    private String[] strings = new String[]{"Nikoleta", "Aleksandra", "Gabriela", "Penka", "Stanka"};

    @Test(expected = OperationNotSupportedException.class)
    public void testCreateListIteratorWithNullElementsThrowsException() throws OperationNotSupportedException {
        this.listIterator = new ListIterator(null);
    }

    @Test
    public void testCreateListIterator() throws OperationNotSupportedException {
        this.listIterator = new ListIterator(strings);
    }

    @Test
    public void testHasNext() throws OperationNotSupportedException {
        this.listIterator = new ListIterator(strings);
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertFalse(listIterator.hasNext());
    }

    @Test
    public void testMoveMethod() throws OperationNotSupportedException {
        this.listIterator = new ListIterator(strings);
        Assert.assertTrue(listIterator.move());
        Assert.assertTrue(listIterator.move());
        Assert.assertTrue(listIterator.move());
        Assert.assertTrue(listIterator.move());
        Assert.assertFalse(listIterator.move());
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintThrowsExceptionWithZeroElements() throws OperationNotSupportedException {
        this.listIterator = new ListIterator();
        listIterator.print();
    }

    @Test
    public void testPrintMethodReturnsLastElement() throws OperationNotSupportedException {
        this.listIterator = new ListIterator(strings);

        int numOfMoves = 3;
        for (int i = 0; i < numOfMoves; i++) {
            listIterator.move();
        }

        String expectedElementToPrint = strings[numOfMoves];
        String returnedElementToPrint = listIterator.print();

        Assert.assertEquals(expectedElementToPrint, returnedElementToPrint);
    }
}
