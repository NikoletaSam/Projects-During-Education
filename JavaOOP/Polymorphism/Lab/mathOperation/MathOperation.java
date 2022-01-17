package Polymorphism.Lab.mathOperation;

public class MathOperation {

    public int add(int first, int second){
        return first + second;
    }

    public int add(int first, int second, int third){
        int sumFirstTwo = add(first, second);

        return add(sumFirstTwo, third);
    }

    public int add(int first, int second, int third, int fourth){
        int sumFirstThreeNumbers = add(first, second, third);

        return add(sumFirstThreeNumbers, fourth);
    }
}
