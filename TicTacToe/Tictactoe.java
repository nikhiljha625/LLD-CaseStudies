package TicTacToe;

public class Tictactoe {
    private final Player player1, player2;
    private final Board board;

    public Tictactoe(Player player1, Player player2, Board board){
        this.player1=player1;
        this.player2=player2;
        this.board=board;
    }
    Result start(){
        Player currPlayer=this.player1;
        while(this.board.isFull()){
            Move currentMove=currPlayer.play();
            this.board.applyMove(currentMove,currPlayer.getSymbol());
            if(this.board.hasWinningLine(currPlayer.getSymbol())){
                System.out.println("The game is up...");
                return new Result(false, currPlayer);
            }
            if(currPlayer==player1){
                currPlayer=player2;
            }
            else{
                currPlayer=player1;
            }
        }
        return new Result(true, null);
    }
}
