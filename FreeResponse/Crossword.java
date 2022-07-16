public class Crossword{

  private Square[][] puzzle;

  public Crossword(boolean[][] blackSquares){
    puzzle = new Square[blackSquares.length][blackSquares[0].length];
    int counter = 1;
    for(int r = 0; r < square.length; r++){
      for(int c = 0; c < square[0].length; c++){
        if(toBeLabeled(r, c, blackSquares)){
          puzzle[r][c] = new Square(false, counter);
          counter++;
        }
        else{
          puzzle[r][c] = new Square(blackSquares[r][c], 0);
        }
      }
    }
  }

  private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
    if(blacksquares[r][c]){
      return false;
    }
    if(r == 0 || c == 0){
      return true;
    }
    return(blackSquares[r-1][c] || blackSquares[r][c-1]);
  }

}
