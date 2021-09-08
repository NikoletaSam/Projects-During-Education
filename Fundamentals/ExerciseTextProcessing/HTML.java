package ExerciseTextProcessing;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        System.out.print("<h1>\n"+"\t" + title + "\n" + "</h1>\n");
        System.out.print("<article>\n"+"\t" + content + "\n" + "</article>\n");

        String input = scanner.nextLine();
        while (!input.equals("end of comments")){

            System.out.print("<div>\n"+"\t" + input + "\n" + "</div>\n");

            input = scanner.nextLine();
        }
    }
}
