package ExamPreparation5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int countOfShotTargets = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")){
            int index = Integer.parseInt(input);
            if (index >= 0 && index < targets.size()){
                boolean isTargetAvailable = CanTargetBeShot(targets, index);
                if (isTargetAvailable){
                    countOfShotTargets++;
                    int current = targets.get(index);
                    for (int i = 0; i < targets.size(); i++) {
                        if (targets.get(i) > current && targets.get(i) != -1){
                            targets.set(i, targets.get(i) - current);
                        } else if (targets.get(i) <= current && i != index && targets.get(i) != -1){
                            targets.set(i, targets.get(i) + current);
                        }
                    }
                    targets.set(index, -1);
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", countOfShotTargets);
        for (int element : targets){
            System.out.print(element + " ");
        }
    }

    private static boolean CanTargetBeShot(List<Integer> targets, int index) {
        boolean flag = true;
        for (int i = 0; i < targets.size(); i++) {
            if (i == index){
                if (targets.get(i) == -1){
                    flag = false;
                }
            }
        }
        return flag;
    }
}
