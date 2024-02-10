package TicTacToe;

public class ComputerPlayer implements Player{

    private final char symbol;

    private ComputerPlayer(char symbol){
        this.symbol=symbol;
    }

    @Override
    public Move play() {
        int x=(int)Math.random(), y=(int)Math.random();
        return new Move(x%3, y%3);
        // throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public char getSymbol() {
        return this.symbol;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getSymbol'");
    }

}
