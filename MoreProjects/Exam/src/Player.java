public class Player{
    private int row;
    private int col;
    private String name;
    private NumOfPlayerEnum player;
    private boolean hasPersonInvested;

    public Player(String name, String sign, int row, int col, NumOfPlayerEnum player, boolean hasPersonInvested){
        this.name = name;
        this.row = row;
        this.col = col;
        this.player = player;
        this.hasPersonInvested = hasPersonInvested;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isHasPersonInvested() {
        return this.hasPersonInvested;
    }

    public void setHasPersonInvested(boolean hasPersonInvested) {
        this.hasPersonInvested = hasPersonInvested;
    }
}
