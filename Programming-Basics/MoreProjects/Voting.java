package PU.homework;
import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравейте, честит празник.");
        System.out.println("Моля въведете номера на вашата персонална идентификационна карта:");
        int cardNum = Integer.parseInt(scanner.nextLine());
        String person = "";

        if(cardNum > 99 && cardNum < 100000){
            person = "poor";
            System.out.println("Хайде по-бързо и да те няма");
        } else if (cardNum > 999999){
            person = "rich";
            System.out.println("Има за нас, има и за вас");
        } else {
            person = "normal";
            System.out.println("Радваме се, че нормални хора вече гласуват");
        }

        String VIP = "";
        String answer = "";
        if (cardNum % 2 == 0) {
            VIP = "VIP";
        }

        int digit = cardNum / 10 % 10;
        if (digit > 3){
            System.out.println("Укривате ли данъци?");
            answer = scanner.nextLine();
            if (answer.equals("Yes")){
                System.out.println("Браво моето момче");
            } else if (answer.equals("No")){
                System.out.println("Будала");
            }
        }

        String secondAnswer = "";
        if (VIP.equals("VIP") && answer.equals("No")){
            VIP = "SUPER VIP";
            System.out.println("Колега, искате ли баничка ?");
            secondAnswer = scanner.nextLine();
            if (secondAnswer.equals("Yes")){
                System.out.println("Не може");
            } else if (secondAnswer.equals("No")){
                System.out.println("Ами, то и без това няма");
            }
        }

        System.out.println("Кои искате да бъдат вашите бъдещи господари?");
        System.out.println("1 - Партия за прогресивен канибализъм");
        System.out.println("27 - Замундска вегетарианска партия");
        System.out.println("666 - Синдикат на вуду-трактористите");
        System.out.println("999 - Партия на труда, мотиката и наковалнята");

        int numLeader = Integer.parseInt(scanner.nextLine());
        if (numLeader == 1){
            System.out.println("Вие си поръчахте да ви управлява {Партия за прогресивен канибализъм}");
        } else if (numLeader == 27){
            System.out.println("Вие си поръчахте да ви управлява {Замундска вегетарианска партия}");
        } else if (numLeader == 666){
            System.out.println("Вие си поръчахте да ви управлява {Синдикат на вуду-трактористите}");
        } else if (numLeader == 999){
            System.out.println("Вие си поръчахте да ви управлява {Партия на труда, мотиката и наковалнята}");
        }

        if (secondAnswer.equals("No") && person.equals("normal") && numLeader == 27){
            System.out.println("И все пак всеки има право на лош вкус, моля депозирайте такса от един банан на изхода.");
        }

        System.out.println("Поздрав с песента 'Грешна си' на Криско и Тони Стораро.");
    }
}