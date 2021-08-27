package ConditioanlStatements.ex;
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String metric = scanner.nextLine();
        String newMetric = scanner.nextLine();
        double converted = 0.0;

        if (metric.equals("mm") && newMetric.equals("m")){
            converted = number / 1000;
        }else if (metric.equals("mm") && newMetric.equals("cm")){
            converted = number / 10;
        }else if (metric.equals("cm") && newMetric.equals("m")){
            converted = number / 100;
        }else if (metric.equals("cm") && newMetric.equals("mm")){
            converted = number * 10;
        }else if (metric.equals("m") && newMetric.equals("mm")){
            converted = number * 1000;
        }else if (metric.equals("m") && newMetric.equals("cm")){
            converted = number * 100;
        }
        System.out.printf("%.3f", converted);
    }
}
