public class Exercise6{
  public static void main(String[] args){
    int[][] myArray = create2D_4x4();
    int[][] myArray2 = create2D(20);
    printGrid(myArray);
    printGrid(myArray2);
  }

  public static int[][] create2D(int size){
    int[][] array = new int[size][size];
    for(int r = 0; r < array.length; r++){
      for(int c = 0; c < array[0].length; c++){
        array[r][c]=array[0].length*r+c+1;
      }
    }
    return array;
  }

  public static int[][] create2D_4x4(){
    return create2D(4);
  }

  public static void printGrid(int[][] array){
    int size = array.length;
    int numberLength = (int)Math.log10(size*size) + 1;
    int counter = 0;
    for(int r = 0; r < 2*size+1; r++){
      for(int c = 0; c < (numberLength+1)*size+1; c++){
        if(r % 2 == 0){
          if(c % (numberLength+1) == 0){
            System.out.print("+");
          }
          else{
            System.out.print("-");
          }
        }
        else{
            if(c % (numberLength+1) == 0){
              System.out.print("|");
            }
            else if(c % (numberLength+1) == 1){
              counter++;
              System.out.print(counter);
            }
            else if(c % (numberLength+1) >= 1+(int)(Math.log10(counter))+1){
              System.out.print(" ");
            }
          }
        }
        System.out.println();
      }
    }

}
