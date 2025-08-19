public class Tic_Tac_Toe {

    private Board board;
    private Player playerX,playerO;
    private Player currentPlayer;

    Tic_Tac_Toe(int n,int m,PlayerStrategy playerStrategy1,PlayerStrategy playerStrategy2){
        board=new Board(n,m);

        playerX=new Player(Symbol.X,playerStrategy1);
        playerO=new Player(Symbol.O,playerStrategy2);
        currentPlayer=playerX;

    }
}
