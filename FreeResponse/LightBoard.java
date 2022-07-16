public class LightBoard{
  public LightBoard(int numRows, int numCols){
    lights = new boolean[numRows][numCols];
    for(int r = 0; r < numRows; r++){
      for(int c = 0; c < numCols; c++){
        double random = Math.random();
        if(random <= .4){
          lights[r][c] == true;
        }
        else{
          lights[r][c] == false;
        }
      }
    }
  }

  public boolean evaluateLight(int row, int col){
    if(lights[row][col]){
      return(numLights(row) % 2 == 0);
    }
    else{
      return(numLights(row) % 3 == 0);
    }
  }

  public int numLights(int row){
    int counter = 0;
    for(int c = 0; c < lights[row].length; c++){
      if(lights[row][c]){
        counter++;
      }
    }
    return counter;
  }
}
