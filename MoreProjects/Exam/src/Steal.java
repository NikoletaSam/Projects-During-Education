public class Steal extends Figures{
    private String description;

    public Steal(String name, String sign) {
        super(name, sign);
    }

    public String getDescription() {
        if (name.equals("conquestTheWorld")){
            this.description = "Завладяване на света е любим план на всички зли гении. Ще започнем с леки сътресения " +
                    "на икономиката и ще видим до къде ще стигне работата.";
        } else if (name.equals("hostages")){
            this.description = "Отвличането на кралското семейство не е опция, но можем да отвлечем друг важен персонаж. " +
                    "Ще ни плащат всеки месец и ще си живеен добре.";
        } else if (name.equals("bigBankRobbery")){
            this.description = "Шоколадовата банка е празна, но има и други институции, които раздават безплатни пари." +
                    " Да се захващаме за работа.";
        }
        return this.description;
    }

}
