package FinalExamPreparation5;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> piecesInformation = new TreeMap<>();

        int numOfPieces = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfPieces; i++) {
            String input = scanner.nextLine();
            String[] array = input.split("\\|");

            String piece = array[0];
            String composer = array[1];
            String key = array[2];

            piecesInformation.put(piece, new ArrayList<>());
            piecesInformation.get(piece).add(composer);
            piecesInformation.get(piece).add(key);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            String[] array = input.split("\\|");
            String command = array[0];
            String piece = array[1];

            switch (command){
                case "Add":
                    if (piecesInformation.containsKey(piece)){
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        String composer = array[2];
                        String key = array[3];
                        piecesInformation.put(piece, new ArrayList<>());
                        piecesInformation.get(piece).add(composer);
                        piecesInformation.get(piece).add(key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if (piecesInformation.containsKey(piece)){
                        System.out.printf("Successfully removed %s!%n", piece);
                        piecesInformation.remove(piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    if (!piecesInformation.containsKey(piece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    } else {
                        String newKey = array[2];
                        piecesInformation.get(piece).set(1, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        piecesInformation
                .entrySet()
                .stream()
                .forEach((entry) -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));

    }
}
