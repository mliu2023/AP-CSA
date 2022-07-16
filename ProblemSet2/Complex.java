/**
* Class to create complex numbers.
* @author Max Liu
* @version 1.0
*/
public class Complex{
  // fields
  private double real;
  private double imag;
  // constructors
  /**
  * Default constructor for a complex number.  Sets it to 1+0i.
  */
  public Complex(){
    this(1, 0);
  }
  /**
  * Constructor for a complex number that takes in the real and imaginary parts.
  * @param real The real part.
  * @param imag The imaginary part.
  */
  public Complex(double real, double imag){
    this.real = real;
    this.imag = imag;
  }
  // accessors
  public double getReal(){return real;}
  public double getImag(){return imag;}
  // modifiers
  public void setReal(double real){this.real = real;}
  public void setImag(double imag){this.imag = imag;}

  /**
  * This method returns the modulus of a complex number.
  * @return The modulus of the complex number.
  */
  public double modulus(){
    return Math.sqrt(real*real+imag*imag);
  }
  /**
  * This method returns the angle a complex number makes with the real axis.
  * @return The argument (angle) of the complex number.
  */
  public double angle(){
    return Math.atan2(imag, real);
  }
  /**
  * Thie method allows a complex number to be printed.
  * @return The complex number (a+bi).
  */
  public String toString(){
    return (real + " + " + imag + "i");
  }
}
