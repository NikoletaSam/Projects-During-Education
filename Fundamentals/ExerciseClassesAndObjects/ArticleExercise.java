package ExerciseClassesAndObjects;

import java.util.Scanner;

public class ArticleExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] firstArticle = input.split(",\\s+");
        String title = firstArticle[0];
        String content = firstArticle[1];
        String author = firstArticle[2];
        Article article = new Article(title, content, author);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfCommands; i++) {
            String inputCommand = scanner.nextLine();
            String[] command = inputCommand.split(": ");
            String commandName = command[0];
            switch (commandName){
                case "Edit":
                    String newContent = command[1];
                    article.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = command[1];
                    article.changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = command[1];
                    article.rename(newTitle);
                    break;
            }
        }
        System.out.println(article);
    }
}
