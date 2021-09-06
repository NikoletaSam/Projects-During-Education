package ExerciseClassesAndObjects;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String edit (String content){
       return this.content = content;
    }

    public String changeAuthor (String author){
        return this.author = author;
    }

    public String rename (String title){
        return this.title = title;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
