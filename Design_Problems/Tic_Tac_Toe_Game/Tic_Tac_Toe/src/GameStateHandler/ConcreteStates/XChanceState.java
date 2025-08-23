package GameStateHandler.ConcreteStates;

import CommonEnum.Symbol;
import GameStateHandler.Context.GameContext;
import GameStateHandler.GameState;
import Utils.Player;

public class XChanceState implements GameState {

    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        if(hasWon){
            context.setCurrentState(player.getSymbol()== Symbol.X?new XWonState():new OWonState());
            return ;


        }

        context.setCurrentState(new OChanceState());
    }

    public boolean hasWon(){
        return  false;
    }
}
