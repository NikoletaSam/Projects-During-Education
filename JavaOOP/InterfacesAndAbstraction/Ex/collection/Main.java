package InterfacesAndAbstraction.Ex.collection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String[] elementsToAdd = scanner.nextLine().split("\\s+");
        int numOfRemoveOperations = Integer.parseInt(scanner.nextLine());

        addElements(elementsToAdd, addCollection);
        addElements(elementsToAdd, addRemoveCollection);
        addElements(elementsToAdd, myList);

        removeElements(numOfRemoveOperations, addRemoveCollection);
        removeElements(numOfRemoveOperations, myList);
    }

    public static void addElements(String[] elements, Addable collection){
        for (String element : elements){
            System.out.print(collection.add(element) + " ");
        }
        System.out.println();
    }

    public static void removeElements(int numOfOperations, AddRemovable collection){
        for (int i = 0; i < numOfOperations; i++) {
            System.out.print(collection.remove() + " ");
        }
        System.out.println();
    }
}
