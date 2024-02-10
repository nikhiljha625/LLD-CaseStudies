package TicTacToe;

public class TicTacToeSimulator {
    public static void main(String[] args){
        Tictactoe tictactoe =  new Tictactoe(new HumanPlayer('X'), new HumanPlayer('0'),new GeneralBoard());
        Result result = tictactoe.start();
        if(result.isDraw()){
            System.out.println("The Match ended in Draw....");
        }
        else{
            System.out.println("Player with the symbol :" + result.GetWinner().getSymbol() + "Win....");
        }
    }
}

