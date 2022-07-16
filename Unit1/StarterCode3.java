import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

public class Lab3
{
  /**
   * Method to read an image from a jpg file and store into a 2D array of pixels
   * @param filename The file that contains the image
   * @return 2D array of pixels
   */
  public static Pixel[][] readImage(String filename)
  {
    // Read the image as a buffered image
    BufferedImage img = null;
    try
    {
      File infile = new File(filename);
      img = ImageIO.read(infile);
    }
    catch(IOException e)
    {
      System.out.println("Cannot read file " + filename);
      System.exit(1);
    }
    // Create a 2D array of pixels with the same size as the buffered image
    int width = img.getWidth();
    int height = img.getHeight();
    Pixel[][] image = new Pixel[height][width];
    for(int i = 0; i < height; i++)
      for(int j = 0; j < width; j++)
      {
        image[i][j] = new Pixel();
        image[i][j].setValue(img.getRGB(j, i));
      }
    // Return the 2D array of pixels
    return image;
  }

  /**
   * Method to write an image stored in a 2D array of pixels to a jpg file
   * @param image The 2D array of pixels
   * @param filename The file that contains the image
   */
  public static void writeImage(Pixel[][] image, String filename)
  {
    // Create a buffered image of the same size as the 2D array of pixels
    int height = image.length;
    int width = image[0].length;
    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Scan all the pixels in the image and set the color value
    for(int i = 0; i < height; i++)
      for(int j = 0; j < width ; j++)
        img.setRGB(j, i, image[i][j].getValue());
    // Write the buffered image
    try
    {
      File outfile = new File(filename);
      ImageIO.write(img, "png", outfile);
    }
    catch(IOException e)
    {
      System.out.println("Cannot write file " + filename);
      System.exit(1);
    }
  }
}
