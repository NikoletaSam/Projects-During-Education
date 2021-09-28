public class Chance extends Figures{
    private boolean isChancePositive;
    private int money;
    private String description;

    public Chance(String name, String sign, boolean isChancePositive) {
        super(name, sign);
        this.isChancePositive = isChancePositive;
    }

    public int getMoney() {
        if (name.equals("1001Night")){
            this.money = -50;
        } else if (name.equals("fairiesProm")){
            this.money = -100;
        } else if (name.equals("warAndPeace")){
            this.money = -150;
        } else if (name.equals("crimeAndPunishment")){
            this.money = -200;
        } else if (name.equals("anger")){
            this.money = -250;
        } else if (name.equals("bigHopes")){
            this.money = 50;
        } else if (name.equals("lolitta")){
            this.money = 100;
        } else if (name.equals("prideAndPrejudice")){
            this.money = 150;
        } else if (name.equals("flyMaster")){
            this.money = 200;
        } else if (name.equals("hobit")){
            this.money = 250;
        }
        return this.money;
    }

    public boolean isChancePositive() {
        return this.isChancePositive;
    }

    public String getDescription() {
        if (name.equals("1001Night")){
            this.description = "Вдигате толкова голям купон, че не знаете къде се намирате на следващата седмица." +
                    " С мъка установявате, че телевизорът Ви е бил откраднат.";
        } else if (name.equals("fairiesProm")){
            this.description = "Вие сте баща на 3 абитуриентки, бъдете готови за стабилни разходи.";
        } else if (name.equals("warAndPeace")){
            this.description = "Най-добрият Ви служител получава повиквателна за казарма. Губите обучен персонал.";
        } else if (name.equals("crimeAndPunishment")){
            this.description = "На връщане от супермаркета, чудовище се опитва да Ви изяде." +
                    " Справяте се с неприятеля, използвайки карате, но се налага да пишете обяснения, които" +
                    " водят до пропускане на важна среща и загуба на бизнес партньор.";
        } else if (name.equals("anger")){
            this.description = "Част от бизнесите Ви фалират, заради задаваща се епидемия от потна треска.";
        } else if (name.equals("bigHopes")){
            this.description = "Осиновявате група сирачета, за да си вдигнете социалното реноме." +
                    " Социалните мрежи са във възторг, получавате окуражителни дарения от обществото.";
        } else if (name.equals("lolitta")){
            this.description = "Хващате си младо гадже, малка котка с големи възможности. Получавате вечното уважение" +
                    " на кварталните пичове, както и легендарен статус на вечен играч.";
        } else if (name.equals("prideAndPrejudice")){
            this.description = "Напускате университета и ставате милионер. Честито!";
        } else if (name.equals("flyMaster")){
            this.description = "Тийнейджъри представят гениална идея за рационализиране на производствените мощности." +
                    " Получавате стабилен бонус.";
        } else if (name.equals("hobit")){
            this.description = "Наемате джудже за личен асистент, обществото е уверено, че междувидовата сегрегация " +
                    "е в историята. Уважението към Вас е безгранично.";
        }
        return this.description;
    }
}
