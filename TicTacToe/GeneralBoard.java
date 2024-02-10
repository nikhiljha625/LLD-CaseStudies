package TicTacToe;

public class GeneralBoard implements Board{
    private final char[][] board;
     
    public GeneralBoard(){
        this.board=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                this.board[i][j]='.';
            }
        }
    }
    @Override
    public void applyMove(Move move, char symbol) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'applyMove'");
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    @Override
    public boolean hasWinningLine(char symbol) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasWinningLine'");
    }

    @Override
    public int getDimension() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDimension'");
    }

}
