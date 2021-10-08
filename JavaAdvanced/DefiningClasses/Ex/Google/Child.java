package DefiningClasses.Ex.Google;

public class Child {
    private String childName;
    private String childBirthday;

    public Child(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    @Override
    public String toString(){
        return this.childName + " " + this.childBirthday + System.lineSeparator();
    }
}
