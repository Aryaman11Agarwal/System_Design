package Utils;

import CommonEnum.Symbol;
import PlayerStrategies.PlayerStrategy;

public class Player {

    private PlayerStrategy playerStrategy;
    private Symbol symbol;

    Player(PlayerStrategy playerStrategy,Symbol symbol){
        this.playerStrategy=playerStrategy;
        this.symbol=symbol;
    }


    public PlayerStrategy getPlayerStrategy(){
        return playerStrategy;
    }

    public Symbol getSymbol(){
        return symbol;
    }

}
