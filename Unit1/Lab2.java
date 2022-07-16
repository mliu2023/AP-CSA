import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
* Public class containing Lab2.
* This lab is about encrypting messages similarly to the Enigma.
* My approach to this lab was to plan things out before I started writing code.
* I made sure I understood how the rotors worked before I wrote encryptMessage.
* I learned that ArrayLists are convienient to use.
* This is because after removing an element, all the indicies are shifted.
* One challenge was making sure that all the ASCII values were correct and not off by one.
* @author Max Liu
* @version 1.0
*/
public class Lab2{
  // Global variables
  public static ArrayList<Integer> rotor1 = new ArrayList<Integer>(95);
  public static ArrayList<Integer> rotor2 = new ArrayList<Integer>(95);
  public static ArrayList<Integer> backplate = new ArrayList<Integer>(95);

  /**
  * Main method in the class.
  * @param args The command line arguments.
  * args[0] is the file that contains text that will be encrypted.
  * args[1] is the file that will contain the encrypted text.
  * args[2] is the starting ASCII value for rotor1.
  * args[3] is the starting ASCII value for rotor2.
  * args[4] is the starting ASCII value for the backplate.
  * args[5] is where the file that will contain the decrypted text.
  */
  public static void main(String[] args){
    String inputFilename = args[0];
    String outputFilename = args[1];
    int s1 = Integer.parseInt(args[2]);
    int s2 = Integer.parseInt(args[3]);
    int s3 = Integer.parseInt(args[4]);
    String decryptFilename = args[5];
    if(args.length != 6){
      System.out.println("You need to enter 6 arguments.");
    }
    else if(s1<32 || s1>126 || s2<32 || s2>126 || s3<32 || s3>126){
      System.out.println("The three arguments have to be between 32 and 126, inclusive.");
    }
    else{
      ArrayList<Integer> input = new ArrayList<Integer>();
      ArrayList<Integer> output = new ArrayList<Integer>();
      ArrayList<Integer> decryptOutput = new ArrayList<Integer>();
      // Testing
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      initializeRotors(s1, s2, s3);
      System.out.println(rotor1);
      System.out.println(rotor2);
      System.out.println(backplate);
      advanceRotor(rotor1);
      System.out.println(rotor1);
      advanceRotor(rotor1);
      System.out.println(rotor1);
      rotor1.clear();
      rotor2.clear();
      backplate.clear();

      // Encrypting
      initializeRotors(s1, s2, s3);
      readFile(inputFilename, input);
      encryptMessage(input, output);
      writeFile(outputFilename, output);
      // We clear the rotors and backplate so we can initialize them again.
      rotor1.clear();
      rotor2.clear();
      backplate.clear();
      // Decrypting
      initializeRotors(s1, s2, s3);
      decryptMessage(output, decryptOutput);
      writeFile(decryptFilename, decryptOutput);
  }

  }
  /**
  * This method initializes the motors given the ASCII values at position 0.
  * @param s1 The ASCII value at position 0 on the first motor.
  * @param s2 The ASCII value at position 0 on the second motor.
  * @param s3 The ASCII value at position 0 on the backplate.
  */
  public static void initializeRotors(int s1, int s2, int s3){
    for(int i=s1; i<s1+95; i++){
      // Once we go over 126, we subtract 95 to start back at 32.
      if(i>126){
        rotor1.add(i-95);
      }
      else{
        rotor1.add(i);
      }
    }
    for(int j=s2; j<s2+95; j++){
      if(j>126){
        rotor2.add(j-95);
      }
      else{
        rotor2.add(j);
      }
    }
    for(int k=s3; k<s3+95; k++){
      if(k>126){
        backplate.add(k-95);
      }
      else{
        backplate.add(k);
      }
    }
  }
  /**
  * This method rotates the given rotor clockwise by one position.
  * @param rotor The rotor that is rotated.
  */
  public static void advanceRotor(ArrayList<Integer> rotor){
    rotor.add(0, rotor.remove(rotor.size()-1));
  }
  /**
  * This method encrypts a message given an ArrayList of ASCII values.
  * @param in The ArrayList containing the ASCII values.
  * @param out The ArrayList that stores the outputs.
  */
  public static void encryptMessage(ArrayList<Integer> in, ArrayList<Integer> out){
    for(int i=0; i<in.size(); i++){
      // Every time rotor1 turns 95 times, rotor2 turns once before the next encryption.
      if(i % 95 == 0 && i != 0){
        advanceRotor(rotor2);
      }
      int innerIndex = rotor1.indexOf(in.get(i));
      int outer = backplate.get(innerIndex);
      int middleIndex = rotor2.indexOf(outer);
      int outer2 = backplate.get(middleIndex);
      out.add(outer2);
      advanceRotor(rotor1);
    }
  }
  /**
  * This method decrypts the input ArrayList into an output ArrayList.
  * @param in The input ArrayList that is decrypted.
  * @param out THe output ArrayList that contains the decrypted ASCII values.
  */
  public static void decryptMessage(ArrayList<Integer> in, ArrayList<Integer> out){
    for(int i=0; i<in.size(); i++){
      // Every time rotor 1 turns 95 times, rotor 2 turns once before the next encryption.
      if(i % 95 == 0 && i != 0){
        advanceRotor(rotor2);
      }
      int outerIndex=backplate.indexOf(in.get(i));
      int middle=rotor2.get(outerIndex);
      int outerIndex2=backplate.indexOf(middle);
      int inner=rotor1.get(outerIndex2);
      out.add(inner);
      advanceRotor(rotor1);
    }
  }
  /**
   * Read a text file and convert the text to a list of ASCII codes
   * @param filename The name of the file to be read
   * @param list The resulting list containing the read text in ASCII code
   */
  public static void readFile(String filename, ArrayList<Integer> list)
  {
    list.clear();
    File file = new File(filename);
    Scanner input = null;
    try
    {
      input = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
      System.out.println(" Cannot open " + filename );
      System.exit(1);
    }
    while(input.hasNextLine())
    {
      String s = input.nextLine();
      for(int i = 0; i < s.length(); i++)
        list.add((int)s.charAt(i));
    }
  }

  /**
   * Writes an Array List of Integer as a text file
   * @param filename The name of the file to be written out
   * @param list The list to be written into the file
   */
  public static void writeFile(String filename, ArrayList<Integer> list)
  {
    Writer writer = null;
    try
    {
      writer = new FileWriter(filename, false);
    }
    catch (IOException ex)
    {
      System.out.println(" Cannot create/open " + filename );
      System.exit(1);
    }
    PrintWriter output = new PrintWriter(writer);
    for(int i = 0; i < list.size(); i++)
      output.print((char)list.get(i).intValue());
    output.close();
  }
}
