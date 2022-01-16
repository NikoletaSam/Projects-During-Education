package InterfacesAndAbstraction.Ex.collection;

public class MyListImpl extends Collection implements MyList{
    @Override
    public String remove() {
        return super.getItems().remove(0);
    }

    @Override
    public int add(String adding) {
        super.getItems().add(0, adding);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
