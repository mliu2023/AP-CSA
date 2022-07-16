/**
 * Class to store color information about a pixel
 * @author Marie-Pierre Jolly
 * @version 1.0
 */
public class Pixel
{
  // Private fields
  // The color value is one integer to store all 3 channels
  private int value;
  // The corresponding red, green, and blue values
  private int red;
  private int green;
  private int blue;

  /**
   * Default constructor
   */
  public Pixel()
  {
    setRGB(0, 0, 0);
  }

  /**
   * Accessor of the red component
   * @return red component of the color
   */
  public int getRed() {return red;}

  /**
   * Accessor of the green component
   * @return green component of the color
   */
  public int getGreen() {return green;}

  /**
   * Accessor of the blue component
   * @return blue component of the color
   */
  public int getBlue() {return blue;}

  /**
   * Accessor of the color value
   * @return the color value
   */
  public int getValue() {return value;}

  /**
   * Modifier of the red component
   * @param r red component of the color
   */
  public void setRed(int r)
  {
    red = Math.max(0, Math.min(r, 255));
    value = (red << 16) + (green << 8) + (blue);
  }

  /**
   * Modifier of the green component
   * @param g green component of the color
   */
  public void setGreen(int g)
  {
    green = Math.max(0, Math.min(g, 255));
    value = (red << 16) + (green << 8) + (blue);
  }

  /**
   * Modifier of the blue component
   * @param b blue component of the color
   */
  public void setBlue(int b)
  {
    blue = Math.max(0, Math.min(b, 255));
    value = (red << 16) + (green << 8) + (blue);
  }

  /**
   * Modifier of all three component
   * The color value is automatically set
   * @param r green component of the color
   * @param g green component of the color
   * @param b blue component of the color
   */
  public void setRGB(int r, int g, int b)
  {
    setRed(r);
    setGreen(g);
    setBlue(b);
    value = (r << 16) + (g << 8) + (b);
  }

  /**
   * Modifier of the color value
   * The red, green, and blue components are automatically set
   * @param v color value
   */
  public void setValue(int value)
  {
    this.value = value;
    setRed((value & 16711680) >> 16);
    setGreen((value & 65280) >> 8);
    setBlue(value & 255);
  }

  /**
   * toString method to print a pixel
   * @return The string to be printed
   */
  public String toString()
  {
    return "(" + red + "," + green + "," + blue + ")";
  }
}
