package guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    private List<Player> roster;
    private String name;
    private int capacity;

    public Guild(String name, int capacity) {
        this.roster = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void addPlayer(Player player){
        if (this.roster.size() < this.capacity){
            this.roster.add(player);
        }
    }

    public boolean removePlayer(String name){
        Player playerToRemove = null;
        for (Player current : this.roster){
            if (current.getName().equals(name)){
                playerToRemove = current;
            }
        }
        if (playerToRemove == null){
            return false;
        }
        this.roster.remove(playerToRemove);
        return true;
    }

    public void promotePlayer(String name){
        setRank(name, "Member");
    }

    public void demotePlayer(String name){
        setRank(name, "Trial");
    }

    private void setRank(String name, String newRank){
        for (Player current : this.roster){
            if (current.getName().equals(name)){
                current.setRank(newRank);
                break;
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz){
        List<Player> removed = new ArrayList<>();
        for (Player current : this.roster){
            if (current.getClazz().equals(clazz)){
                removed.add(current);
            }
        }

        this.roster.removeAll(removed);
        Player[] players = new Player[removed.size()];
        int counter = 0;
        for (Player current : removed){
            players[counter] = current;
            counter++;
        }
        return players;
    }

    public int count(){
        return this.roster.size();
    }

    public String report(){
        StringBuilder builder = new StringBuilder();
        builder.append("Players in the guild: ").append(this.name).append(":").append(System.lineSeparator());
        this.roster.forEach(e -> builder.append(e.toString()).append(System.lineSeparator()));
        return builder.toString();
    }
}
