// represents single cell
public class Cell {

    public boolean mine;
    boolean covered;
    int number;

    int position;

      //  @Override

        //public String toString() {
        //return "It has a mine: " + mine ;

    // Class Constructor
        public Cell (boolean bomb, boolean cover, int num, int pos) {
            mine = bomb;
            covered = cover;
            number = num;
            position = pos;

        }


        //method to uncover



}
