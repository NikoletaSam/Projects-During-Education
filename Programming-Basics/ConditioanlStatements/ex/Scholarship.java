package ConditioanlStatements.ex;
import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageResults = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double  socialScholarship = 0;
        double excellentScholarship = 0;

        if ( income < minSalary){
            if( averageResults > 4.50){
                socialScholarship = Math.floor(0.35 * minSalary);
            }
        }
        if ( averageResults >= 5.50){
            excellentScholarship = Math.floor(averageResults * 25);
        }
        if (socialScholarship == 0 && excellentScholarship == 0){
            System.out.println("You cannot get a scholarship!");
        } else if (socialScholarship > excellentScholarship){
            System.out.print("You get a Social scholarship ");
            System.out.printf("%.0f", socialScholarship);
            System.out.println(" BGN");
        } else {
            System.out.print("You get a scholarship for excellent results ");
            System.out.printf("%.0f", excellentScholarship);
            System.out.println(" BGN");
        }

    }
}
