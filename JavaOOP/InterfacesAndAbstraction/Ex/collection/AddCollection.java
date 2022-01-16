package InterfacesAndAbstraction.Ex.collection;

public class AddCollection extends Collection implements Addable{

    @Override
    public int add(String adding) {
        super.getItems().add(adding);
        return super.getItems().indexOf(adding);
    }
}
