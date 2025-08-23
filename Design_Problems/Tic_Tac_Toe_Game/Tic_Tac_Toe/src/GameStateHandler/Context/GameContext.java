package GameStateHandler.Context;

import GameStateHandler.ConcreteStates.XChanceState;
import GameStateHandler.GameState;
import Utils.Player;

public class GameContext {

    private GameState currentState;

    public GameContext(){
        currentState=new XChanceState();
    }


    public void next(Player player,boolean hasWon){
        currentState.next(this,player,hasWon);
    }

    public void setCurrentState(GameState gameState){
        this.currentState=gameState;
    }

    public boolean isGameOver(){
        return currentState.hasWon();
    }

    public GameState getCurrentState(){
        return currentState;
    }


}
