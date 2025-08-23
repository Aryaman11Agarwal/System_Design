package Utils;
import CommonEnum.Symbol;
import GameStateHandler.ConcreteStates.XWonState;
import GameStateHandler.Context.GameContext;

public class Board {

    Symbol[][] board;

    private int rows,cols;


    public Board(int rows,int cols){
        this.rows=rows;
        this.cols=cols;

         board=new Symbol[rows][cols];

         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 board[i][j]=Symbol.EMPTY;
             }
         }
    }

    public boolean isValidMove(int row,int col){
        return (row>=0 && col>=0 && row<rows && col<cols && board[row][col]==Symbol.EMPTY);
    }

    public void makeMove(Position position ,Symbol symbol){
        int row=position.row;
        int col=position.col;

        board[row][col]=symbol;
    }

    public void checkGameState(GameContext context, Player currentPlayer) {

        for (int i = 0; i < rows; i++) {
            if (board[i][0] != Symbol.EMPTY && isWinningLine(board[i])) {
                context.next(currentPlayer , true);
                return;
            }
        }
        for (int i = 0; i < cols; i++) {
            Symbol[] column = new Symbol[rows];
            for (int j = 0; j < rows; j++) {
                column[j] = board[j][i];
            }
            if (column[0] != Symbol.EMPTY && isWinningLine(column)) {
                context.next(currentPlayer, true);
                return;
            }
        }
        Symbol[] diagonal1 = new Symbol[Math.min(rows, cols)];
        Symbol[] diagonal2 = new Symbol[Math.min(rows, cols)];
        for (int i = 0; i < Math.min(rows, cols); i++) {
            diagonal1[i] = board[i][i];
            diagonal2[i] = board[i][cols - 1 - i];
        }
        if (diagonal1[0] != Symbol.EMPTY && isWinningLine(diagonal1)) {
            context.next(currentPlayer, true);
            return;
        }
        if (diagonal2[0] != Symbol.EMPTY && isWinningLine(diagonal2)) {
            context.next(currentPlayer, true);
            return;
        }
        // Additional logic to handle a draw or continue in progress can be added
        // here0



        context.next(currentPlayer,false);
    }
    private boolean isWinningLine(Symbol[] line) {
        Symbol first = line[0];
        for (Symbol s : line) {
            if (s != first) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Symbol symbol = board[i][j];
                switch (symbol) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print(" O ");
                        break;
                    case EMPTY:
                    default:
                        System.out.print(" . ");
                }

                if (j < cols - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < rows - 1) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }

}


