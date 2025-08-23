package PlayerStrategies;

import Utils.Board;
import Utils.Position;

public interface PlayerStrategy {

    public Position makeMove(Board board);
}
