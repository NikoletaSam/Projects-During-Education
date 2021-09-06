package ExerciseClassesAndObjects.OpinionPoll;

public class OpinionPoll {
    private String name;
        private int age;

    public OpinionPoll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }
}
