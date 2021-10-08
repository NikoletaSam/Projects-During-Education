package DefiningClasses.Ex.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString(){
        String output = this.name + System.lineSeparator() + "Company:" + System.lineSeparator();
        if (this.company != null){
            output += this.company.toString();
        }
        output += "Car:" + System.lineSeparator();
        if (this.car != null){
            output += this.car.toString();
        }
        output += "Pokemon:" + System.lineSeparator();
        if (this.pokemons.size() > 0){
            for (Pokemon pokemon : this.pokemons){
                output += pokemon.toString();
            }
        }
        output += "Parents:" + System.lineSeparator();
        if (this.parents.size() > 0){
            for (Parent parent : this.parents){
                output += parent.toString();
            }
        }
        output += "Children:" + System.lineSeparator();
        if (this.children.size() > 0){
            for ( Child child : children){
                output += child.toString();
            }
        }
        return output;

    }
}
