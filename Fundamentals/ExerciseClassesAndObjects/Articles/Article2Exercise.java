package ExerciseClassesAndObjects.Articles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Article2Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article2> articles = new ArrayList<>();
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            String[] command = input.split(",\\s+");
            String title = command[0];
            String content = command[1];
            String author = command[2];
            Article2 article = new Article2(title, content, author);
            articles.add(article);
        }

        String sorting = scanner.nextLine();
        switch (sorting){
            case "title":
                articles.sort(Comparator.comparing(Article2::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Article2::getContent));
                break;
            case "author":
                articles.sort(Comparator.comparing(Article2::getAuthor));
                break;
        }

        for (Article2 data : articles){
            System.out.println(data);
        }
    }
}
