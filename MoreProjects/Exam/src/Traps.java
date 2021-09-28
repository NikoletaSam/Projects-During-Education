public class Traps extends Figures{

    private int investment;
    private boolean isTrapActive;
    private boolean putByFirstPlayer;

    public Traps(String name, String sign, boolean isTrapActive, boolean putByFirstPlayer) {
        super(name, sign);
        if (name.equals("normal")){
            this.investment = 0;
        } else if (name.equals("taxAudit")){
            this.investment = 10;
        } else if (name.equals("divorce")){
            this.investment = 20;
        } else if (name.equals("propaganda")){
            this.investment = 100;
        } else if (name.equals("seeing")){
            this.investment = 50;
        } else if (name.equals("gamblingBoss")){
            this.investment = 100;
        }
        this.isTrapActive = isTrapActive;
        this.putByFirstPlayer = putByFirstPlayer;
    }

    public boolean isTrapActive() {
        return this.isTrapActive;
    }

    public void setTrapActive(boolean trapActive) {
        this.isTrapActive = trapActive;
    }

    public void setPutByFirstPlayer(boolean putByFirstPlayer) {
        this.putByFirstPlayer = putByFirstPlayer;
    }

    public boolean isPutByFirstPlayer() {
        return this.putByFirstPlayer;
    }
}
