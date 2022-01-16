package InterfacesAndAbstraction.Ex.person;

public class Robot implements Identifiable{
    private String id;
    private String model;

    //todo reverse id and model order if the programs breaks
    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getModel() {
        return model;
    }
}
