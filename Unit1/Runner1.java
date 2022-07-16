import java.util.ArrayList;
import java.util.Arrays;
public class Runner1{
  public static void main(String[] args){
    // createWedge
    System.out.println("createWedge");
    int[] wedgeArr1 = {1,2,3,4,3};
    int[] wedge1 = ProblemSet1.createWedge(wedgeArr1);
    int[] wedgeArr2 = {1,2,5,0};
    int[] wedge2 = ProblemSet1.createWedge(wedgeArr2);
    int[] wedgeArr3 = {-1,55,250,9};
    int[] wedge3 = ProblemSet1.createWedge(wedgeArr3);
    System.out.println(Arrays.toString(wedge1));
    System.out.println(Arrays.toString(wedge2));
    System.out.println(Arrays.toString(wedge3));
    // fibArray
    System.out.println();
    System.out.println("fibArray");
    int[] fibArr1 = ProblemSet1.fibArray(12);
    int[] fibArr2 = ProblemSet1.fibArray(2);
    int[] fibArr3 = ProblemSet1.fibArray(25);
    System.out.println(Arrays.toString(fibArr1));
    System.out.println(Arrays.toString(fibArr2));
    System.out.println(Arrays.toString(fibArr3));
    // rotateLeft, rotateRight, rotate
    System.out.println();
    System.out.println("rotateLeft, rotateRight, rotate");
    int[] rotateArr1 = {1, 2, 3, 4, 5, 4, 3, 2, 1};
    int[] rotateArr2 = {1, 54, 432, 1324};
    int[] rotateArr3 = {1234,56,676,3};
    ProblemSet1.rotateLeft(rotateArr1);
    System.out.println(Arrays.toString(rotateArr1));
    ProblemSet1.rotateRight(rotateArr1);
    System.out.println(Arrays.toString(rotateArr1));

    ProblemSet1.rotateLeft(rotateArr2);
    System.out.println(Arrays.toString(rotateArr2));
    ProblemSet1.rotateRight(rotateArr2);
    System.out.println(Arrays.toString(rotateArr2));

    ProblemSet1.rotateLeft(rotateArr3);
    System.out.println(Arrays.toString(rotateArr3));
    ProblemSet1.rotateRight(rotateArr3);
    System.out.println(Arrays.toString(rotateArr3));
    // All the arrays are back to where they started.
    // We use the same arrays to do test cases for rotate.
    ProblemSet1.rotate(rotateArr1, 5);
    System.out.println(Arrays.toString(rotateArr1));
    ProblemSet1.rotate(rotateArr2, -6);
    System.out.println(Arrays.toString(rotateArr2));
    ProblemSet1.rotate(rotateArr3, 0);
    System.out.println(Arrays.toString(rotateArr3));
    // populateSeating
    System.out.println();
    System.out.println("populateSeating:");
    String[] seatArr1 = {"0,0", "1,2", "1,3", "2,9", "2,10", "2,11"};
    ArrayList<String> seats1 = new ArrayList<String>(Arrays.asList(seatArr1));
    int[][] newSeatArr1 = ProblemSet1.populateSeating(3, seats1);
    String[] seatArr2 = {"0,0", "2,5", "2,2", "2,4", "1,1", "4,4", "2,6", "2,7", "3,3", "2,3"};
    ArrayList<String> seats2 = new ArrayList<String>(Arrays.asList(seatArr2));
    int[][] newSeatArr2 = ProblemSet1.populateSeating(5, seats2);
    String[] seatArr3 = {"0,0","0,1","0,2","1,1"};
    ArrayList<String> seats3 = new ArrayList<String>(Arrays.asList(seatArr3));
    int[][] newSeatArr3 = ProblemSet1.populateSeating(2, seats3);

    for(int i = 0; i < newSeatArr1.length; i++){
      System.out.println(Arrays.toString(newSeatArr1[i]));
    }
    System.out.println();
    for(int j = 0; j < newSeatArr2.length; j++){
      System.out.println(Arrays.toString(newSeatArr2[j]));
    }
    System.out.println();
    for(int k = 0; k < newSeatArr3.length; k++){
      System.out.println(Arrays.toString(newSeatArr3[k]));
    }
    System.out.println();
    // printSeating
    ProblemSet1.printSeating(newSeatArr1);
    ProblemSet1.printSeating(newSeatArr2);
    ProblemSet1.printSeating(newSeatArr3);
    System.out.println();
    // bookSeats
    System.out.println(ProblemSet1.bookSeats(newSeatArr1, 3));
    System.out.println(ProblemSet1.bookSeats(newSeatArr1, 10));
    System.out.println(ProblemSet1.bookSeats(newSeatArr2, 5));
    System.out.println();
    // multiply
    int[][] a = {{1,2,3},{4,5,6}};
    int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] c = ProblemSet1.multiply(a,b);
    int[][] d = {{1,3,5},{2,2,2}};
    int[][] e = {{1,0,0},{0,1,0},{0,0,1}};
    int[][] f = ProblemSet1.multiply(d,e);
    int[][] g = ProblemSet1.multiply(d,b);
    for(int[] row : c){
      System.out.println(Arrays.toString(row));}
    System.out.println();
    for(int[] row : f){
      System.out.println(Arrays.toString(row));}
    System.out.println();
    for(int[] row : g){
      System.out.println(Arrays.toString(row));}
    System.out.println();
    // top5
    int[] topArr1 = {1,2,3,4,5,6,7,8,9,10,11,12};
    int[] topArr2 = {5,3,10,25,129,43,2,17};
    int[] topArr3 = {99,88,1,-15,1,33,50};
    System.out.println(ProblemSet1.top5(topArr1));
    System.out.println(ProblemSet1.top5(topArr2));
    System.out.println(ProblemSet1.top5(topArr3));
    System.out.println();
    // removeDuplicates
    String[] duplicateArr1 = {"apple", "orange", "banana", "apple", "banana", "grapes"};
    ArrayList<String> duplicateList1 = new ArrayList<String>(Arrays.asList(duplicateArr1));
    String[] duplicateArr2 = {"hi", "hello", "hi", "hi", "bye"};
    ArrayList<String> duplicateList2 = new ArrayList<String>(Arrays.asList(duplicateArr2));
    String[] duplicateArr3 = {"0", "1", "1", "2", "3", "5", "8"};
    ArrayList<String> duplicateList3 = new ArrayList<String>(Arrays.asList(duplicateArr3));
    System.out.println(duplicateList1);
    ProblemSet1.removeDuplicates(duplicateList1);
    System.out.println(duplicateList1);
    System.out.println(duplicateList2);
    ProblemSet1.removeDuplicates(duplicateList2);
    System.out.println(duplicateList2);
    System.out.println(duplicateList3);
    ProblemSet1.removeDuplicates(duplicateList3);
    System.out.println(duplicateList3);
    System.out.println();
    // replace
    String[] replaceArr1 = {"R2-D2", "Darth Vader", "C-3PO", "Yoda"};
    ArrayList<String> replaceList1 = new ArrayList<String>(Arrays.asList(replaceArr1));
    String[] replaceArr2 = {"123", "hi", "bye", "a132"};
    ArrayList<String> replaceList2 = new ArrayList<String>(Arrays.asList(replaceArr2));
    String[] replaceArr3 = {"as;dkl", "123r", "hihihihih1", "bruh"};
    ArrayList<String> replaceList3 = new ArrayList<String>(Arrays.asList(replaceArr3));
    System.out.println(replaceList1);
    ProblemSet1.replace(replaceList1);
    System.out.println(replaceList1);
    System.out.println(replaceList2);
    ProblemSet1.replace(replaceList2);
    System.out.println(replaceList2);
    System.out.println(replaceList3);
    ProblemSet1.replace(replaceList3);
    System.out.println(replaceList3);
  }
}
