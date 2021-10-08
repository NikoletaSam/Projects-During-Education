package DefiningClasses.Ex.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numOfBadges = 0;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void setNumOfBadges(int numOfBadges) {
        this.numOfBadges = numOfBadges;
    }

    public int getNumOfBadges() {
        return this.numOfBadges;
    }

    @Override
    public String toString(){
        return this.name + " " + this.numOfBadges + " " + this.pokemons.size() + System.lineSeparator();
    }
}
