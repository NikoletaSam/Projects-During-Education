package ConditioanlStatements.lab;
import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        if (sells < 0){
            System.out.println("error");
        } else if( sells <= 500){
            if (city.equals("Sofia")){
                double commission = 0.05 * sells;
                System.out.printf("%.2f", commission);
            }else if (city.equals("Varna")){
                double commission = 0.045 * sells;
                System.out.printf("%.2f", commission);
            }else if (city.equals("Plovdiv")){
                double commission = 0.055 * sells;
                System.out.printf("%.2f", commission);
            }else {
                System.out.println("error");
            }
        } else if ( sells <= 1000){
            if (city.equals("Sofia")){
                double commission = 0.07 * sells;
                System.out.printf("%.2f", commission);
            }else if (city.equals("Varna")){
                double commission = 0.075 * sells;
                System.out.printf("%.2f", commission);
            }else if (city.equals("Plovdiv")){
                double commission = 0.08 * sells;
                System.out.printf("%.2f", commission);
            }else {
                System.out.println("error");
            }
        } else if (sells <= 10000){
            if (city.equals("Sofia")){
                double commission = 0.08 * sells;
                System.out.printf("%.2f", commission);
            }else if (city.equals("Varna")){
                double commission = 0.1 * sells;
                System.out.printf("%.2f", commission);
            }else if (city.equals("Plovdiv")){
                double commission = 0.12 * sells;
                System.out.printf("%.2f", commission);
            }else {
                System.out.println("error");
            }
        }else if (sells > 10000){
            if (city.equals("Sofia")){
                double commission = 0.12 * sells;
                System.out.printf("%.2f", commission);
            }else if (city.equals("Varna")){
                double commission = 0.13 * sells;
                System.out.printf("%.2f", commission);
            }else if (city.equals("Plovdiv")){
                double commission = 0.145 * sells;
                System.out.printf("%.2f", commission);
            }else {
                System.out.println("error");
            }
        }
    }
}
