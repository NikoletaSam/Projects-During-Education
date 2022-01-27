package p05_CustomLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class CustomLinkedListTest {
    private CustomLinkedList customLinkedList;

    @Test
    public void testAddCustomLinkedListForOneElement(){
        this.customLinkedList = new CustomLinkedList();
        customLinkedList.add("FirstElement");

        Assert.assertEquals(1, customLinkedList.getCount());
        Assert.assertEquals("FirstElement", customLinkedList.get(0));
    }

    @Test
    public void testAddMethodForMultipleElements(){
        createCustomLinkedListForThreeElements();

        Assert.assertEquals(3, customLinkedList.getCount());
        Assert.assertEquals("Second", customLinkedList.get(1));
    }

    @Test
    public void testSetElementForExistingNode(){
        createCustomLinkedListForThreeElements();

        String elementToSet = "NewElement";
        int indexToSet = 2;
        customLinkedList.set(indexToSet, elementToSet);

        Assert.assertEquals(elementToSet, customLinkedList.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetElementThrowsExceptionForInvalidIndex(){
        createCustomLinkedListForThreeElements();

        String element = "Invalid";
        int invalidIndex = 5;
        customLinkedList.set(invalidIndex, element);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementAtInvalidIndexThrowsException(){
        createCustomLinkedListForThreeElements();

        customLinkedList.get(-1);
    }

    @Test
    public void testRemoveListNodeAtIndexForMultipleNodes(){
        createCustomLinkedListForThreeElements();

        int index = 1;
        Object removedElement = customLinkedList.removeAt(index);

        Assert.assertEquals(2, customLinkedList.getCount());
        Assert.assertEquals("Second", removedElement);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAtInvalidIndexThrowsException(){
        createCustomLinkedListForThreeElements();

        int index = 8;
        customLinkedList.removeAt(index);
    }

    @Test
    public void testRemoveForExistingElementReturnsTheIndexOfTheElement(){
        createCustomLinkedListForThreeElements();

        String elementToRemove = "First";
        int indexOfRemovedElement = customLinkedList.remove(elementToRemove);
        int expectedIndexOfRemovedElement = 0;

        Assert.assertEquals(expectedIndexOfRemovedElement, indexOfRemovedElement);
        Assert.assertEquals(2, customLinkedList.getCount());
    }

    @Test
    public void testRemoveForNonExistingElement(){
        createCustomLinkedListForThreeElements();

        String elementToRemove = "RemoveMe";
        int expected = -1;
        int returnedIndex = customLinkedList.remove(elementToRemove);

        Assert.assertEquals(expected, returnedIndex);
        Assert.assertEquals(3, customLinkedList.getCount());
    }

    @Test
    public void testFindIndexOfGivenExistingElement(){
        createCustomLinkedListForThreeElements();

        String elementToGetIndex = "Third";
        int expectedReturnedIndex = 2;
        int returnedIndex = customLinkedList.indexOf(elementToGetIndex);

        Assert.assertEquals(expectedReturnedIndex, returnedIndex);
    }

    @Test
    public void testFindIndexOfGivenNonExistingElement(){
        createCustomLinkedListForThreeElements();

        String elementToGetIndex = "INeedIndex";
        int expectedReturnedIndex = -1;
        int returnedIndex = customLinkedList.indexOf(elementToGetIndex);

        Assert.assertEquals(expectedReturnedIndex, returnedIndex);
    }

    @Test
    public void testContainsMethodReturnsTrueForExistingElement(){
        createCustomLinkedListForThreeElements();

        String elementToCheck = "First";
        Assert.assertTrue(customLinkedList.contains(elementToCheck));
    }

    @Test
    public void testContainsMethodReturnsFalseForNonExistingElement(){
        createCustomLinkedListForThreeElements();

        String elementToCheck = "CheckMe";
        Assert.assertFalse(customLinkedList.contains(elementToCheck));
    }

    private CustomLinkedList createCustomLinkedListForThreeElements(){
        this.customLinkedList = new CustomLinkedList();
        customLinkedList.add("First");
        customLinkedList.add("Second");
        customLinkedList.add("Third");

        return customLinkedList;
    }
}
