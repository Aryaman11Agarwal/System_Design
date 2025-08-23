package GameStateHandler.ConcreteStates;

import GameStateHandler.Context.GameContext;
import GameStateHandler.GameState;
import Utils.Player;

public class OWonState implements GameState {

    public void next(GameContext context, Player player, boolean hasWon){

    }
    public boolean hasWon(){
        return true;
    }
}
