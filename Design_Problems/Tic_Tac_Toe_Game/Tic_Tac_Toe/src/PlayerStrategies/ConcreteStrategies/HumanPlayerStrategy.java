package PlayerStrategies.ConcreteStrategies;

import PlayerStrategies.PlayerStrategy;
import Utils.Board;
import Utils.Position;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy {


    private Scanner scanner;
    private String name;

    public HumanPlayerStrategy(String name){
        this.name=name;
        scanner=new Scanner(System.in);
    }
    @Override
    public Position makeMove(Board board) {


        while(true){
            System.out.println("Hey "+name+ " Please enter your move ");

            try{

                int row=scanner.nextInt();
                int col=scanner.nextInt();

                if(board.isValidMove(row,col)){
                    return new Position(row,col);
                }

                System.out.println("Invalid move, try again");
            }
            catch (Exception e){

                System.out.println("Enter valid integers");
                scanner.nextLine();
            }
        }
    }
}
