/**
* Class to create qubits.
* @author Max Liu
* @version 1.0
*/
public class Qubit{
  // fields
  private Complex down;
  private Complex up;
  // constructors
  /**
  * Default constructor for qubits.  Sets down to 0 and up to 1.
  */
  public Qubit(){
    this(new Complex(0, 0), new Complex(1, 0));
  }
  /**
  * Constructor for a qubit that takes in two complex numbers.
  * @param down The complex number representing down.
  * @param up The complex number representing up.
  */
  public Qubit(Complex down, Complex up){
    this.down = down;
    this.up = up;
  }
  // accessors
  public Complex getDown(){return down;}
  public Complex getUp(){return up;}
  // modifiers
  public void setDown(Complex down){this.down = down;}
  public void setUp(Complex up){this.up = up;}
  /**
  * This method measures the state of a qubit.
  * @return The state, or invalid state if the probabilities don't add up to 1.
  */
  public String measure(){
    double downProb = down.modulus()*down.modulus();
    double upProb = up.modulus()*up.modulus();
    if(Math.abs(downProb+upProb-1) > .0000001){
      return "Invalid state";}
    else{
      double randomNumber = Math.random();
      if(randomNumber <= upProb){
        return "up";}
      else{
        return "down";}
    }
  }
  /**
  * Thie method allows a qubit to be printed.
  * @return The down complex number, then the up complex number.
  */
  public String toString(){
    return "(Down: " + down.toString() + ", Up: " + up.toString() + ")";
  }
}
