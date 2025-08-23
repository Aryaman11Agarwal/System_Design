package GameStateHandler;

import GameStateHandler.Context.GameContext;
import Utils.Player;

public interface GameState {

    public void next(GameContext context, Player player,boolean hasWon);
    public boolean hasWon();
}
