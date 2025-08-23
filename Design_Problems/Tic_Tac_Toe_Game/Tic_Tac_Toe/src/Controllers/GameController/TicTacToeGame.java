package Controllers.GameController;

import CommonEnum.Symbol;
import Controllers.BoardGames;
import PlayerStrategies.PlayerStrategy;
import Utils.Board;
import Utils.Player;
import Utils.Position;
import GameStateHandler.ConcreteStates.*;
import GameStateHandler.*;

import GameStateHandler.Context.GameContext;
public class TicTacToeGame implements BoardGames {

    private Board board;
    private Player playerX,playerO;

    private Player currentPlayer;

    private GameContext gameContext;
    public TicTacToeGame(PlayerStrategy playerXStrategy, PlayerStrategy playerOStrategy,int rows,int cols){
          board=new Board(rows, cols);

          playerX=new Player(playerXStrategy, Symbol.X);
          playerO=new Player(playerOStrategy, Symbol.O);
          currentPlayer=playerX;
          gameContext=new GameContext();
    }

    @Override
    public void play() {
        do {
            // print the current state of the game
            board.printBoard();
            // current player makes the move
            Position move = currentPlayer.getPlayerStrategy().makeMove(board);
            board.makeMove(move, currentPlayer.getSymbol());
            // checks game state for win/draw
            board.checkGameState(gameContext, currentPlayer);
            switchPlayer();
        } while (!gameContext.isGameOver());
        announceResult();
    }
    // Alternates the current player after each move.
    // Ensures both players take turns
    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }
    // Displays the outcome of the game based on the final game state.
    private void announceResult() {
        GameState state = gameContext.getCurrentState();
        board.printBoard();
        if (state instanceof XWonState) {
            System.out.println("Player X wins!");
        } else if (state instanceof OWonState) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
