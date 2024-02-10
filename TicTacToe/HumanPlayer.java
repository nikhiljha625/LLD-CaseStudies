package TicTacToe;

public class HumanPlayer implements Player{
    char symbol;
    public HumanPlayer(char symbol){
        this.symbol=symbol;
    }
    @Override
    public Move play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public char getSymbol() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSymbol'");
    }

}
