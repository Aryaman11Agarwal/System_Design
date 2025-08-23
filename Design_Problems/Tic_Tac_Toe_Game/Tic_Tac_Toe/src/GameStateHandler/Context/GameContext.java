package GameStateHandler.Context;

import GameStateHandler.ConcreteStates.XChanceState;
import GameStateHandler.GameState;
import Utils.Player;

public class GameContext {

    private GameState currentState;

    GameContext(){
        currentState=new XChanceState();
    }


    public void next(Player player,boolean hasWon){
        currentState.next(this,player,hasWon);
    }

    public void setCurrentState(GameState gameState){
        this.currentState=gameState;
    }
}
