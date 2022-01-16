package InterfacesAndAbstraction.Ex.collection;

public class AddRemoveCollection extends Collection implements AddRemovable{
    @Override
    public String remove() {
        return super.getItems().remove(super.getItems().size() - 1);
    }

    @Override
    public int add(String adding) {
        super.getItems().add(0, adding);
        return 0;
    }
}
