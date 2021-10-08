package DefiningClasses.Ex.PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainersInformation = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Tournament")){
            String[] array = input.split("\\s+");
            String trainerName = array[0];
            String pokemonName = array[1];
            String pokemonElement = array[2];
            int pokemonHealth = Integer.parseInt(array[3]);

            trainersInformation.putIfAbsent(trainerName, new Trainer(trainerName));

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainersInformation.get(trainerName).getPokemons().add(pokemon);

            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("End")){
            String elementToCheck = secondInput;
            for (Map.Entry<String, Trainer> entry : trainersInformation.entrySet()){
                Trainer currentTrainer = entry.getValue();
                boolean flag = false;
                for (Pokemon pokemon : currentTrainer.getPokemons()){
                    if (pokemon.getElement().equals(elementToCheck)){
                        flag = true;
                        break;
                    }
                }
                if (flag){
                    int previousNumOfBadges = currentTrainer.getNumOfBadges();
                    currentTrainer.setNumOfBadges(previousNumOfBadges + 1);
                } else {
                    currentTrainer.getPokemons().removeIf(pokemon -> (pokemon.getHealth() - 10) <= 0);
                    for (Pokemon pokemon : currentTrainer.getPokemons()){
                        int previousHealth = pokemon.getHealth();
                        pokemon.setHealth(previousHealth - 10);
                    }
                }
            }

            secondInput = scanner.nextLine();
        }

        trainersInformation
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((a, b) -> Integer.compare(b.getNumOfBadges(), a.getNumOfBadges())))
                .forEach(e -> System.out.print(e.getValue().toString()));

    }
}
