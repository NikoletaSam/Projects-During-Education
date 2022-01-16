package InterfacesAndAbstraction.Ex.telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder builder = new StringBuilder();
        for (String current : urls){
            char[] newChar = current.toCharArray();
            boolean flag = false;
            for (char currentCharacter : newChar){
                if (Character.isDigit(currentCharacter)){
                    flag = true;
                    break;
                }
            }
            if (flag){
                builder.append("Invalid URL!").append(System.lineSeparator());
            } else {
                builder.append("Browsing: ").append(current).append("!").append(System.lineSeparator());
            }
        }
        return builder.toString();
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();
        for (String current : this.numbers){
            char[] newChar = current.toCharArray();
            boolean flag = false;
            for (char currentCharacter : newChar){
                if (!Character.isDigit(currentCharacter)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                builder.append("Invalid number!").append(System.lineSeparator());
            } else {
                builder.append("Calling... ").append(current).append(System.lineSeparator());
            }
        }

        return builder.toString();
    }
}
