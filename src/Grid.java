import java.util.*;
import java.util.ArrayList;


public class Grid {

    public void printGrid(ArrayList<Cell> gridToBe) {

        for (int i = 0; i <= 99; i++) {
            if (i <= 9)
                System.out.print(" " + "0" + i);
            else System.out.print(" " + i);
            if (i != 0 && (i == 9 || i == 19 || i == 29 || i == 39 || i == 49 || i == 59 || i == 69 || i == 79 || i == 89))
                System.out.print("\n");
        }
    }


    public static void selectCell() {
        Scanner read = new Scanner(System.in);
        System.out.println("Which cell would you like to select?");
        int selection = read.nextInt();
        System.out.println(selection);
    }


    public static void main(String[] args) {


        printGrid();
        System.out.println("  ");
        selectCell();


        ArrayList<Cell> hiddenBoard = new ArrayList<Cell>();
        for (int i = 0; i <= 99; i++) {
            double x = Math.random();
            if (x < 0.1) {
                hiddenBoard.add(new Cell(true, true, 0, i));
            } else {
                hiddenBoard.add(new Cell(false, true, 0, i));
            }
        }

        Cell cell19 = hiddenBoard.get(19);

        if (cell19.mine == true){
            printGrid();
        }


        int[][] board = new int[10][10];
        for (Cell value : hiddenBoard) {
            System.out.println(int i);
        }

    }

}
