import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

/**
* Public class containing Lab3.
* This lab is about using 2d arrays to represent and modify images.
* My general approach was to create more helper functions that could be used
* multiple times to save code.
* I learned that it is important to keep code readable.
* One challenge was figuring out how to process all pixels without going outside the border.

*/
public class Lab3{
  /**
  * The main function in Lab3.
  * @param args The command line arguments.
  */
  public static void main(String[] args){
    Pixel[][] butterfly = readImage("butterfly.jpg");
    Pixel[][] negate = negate(butterfly);
    writeImage(negate, "butterfly2.png");

    Pixel[][] beach = readImage("beach.jpg");
    Pixel[][] mirrorHorizontal = mirrorHorizontal(beach);
    writeImage(mirrorHorizontal, "beach2.png");

    Pixel[][] redMotorcycle = readImage("redMotorcycle.jpg");
    Pixel[][] mirrorVertical = mirrorVertical(redMotorcycle);
    writeImage(mirrorVertical, "redMotorcycle2.png");

    Pixel[][] swan = readImage("swan.jpg");
    Pixel[][] edgeDetection = edgeDetection(swan);
    writeImage(edgeDetection, "swan2.png");

    Pixel[][] blueMotorcycle = readImage("blueMotorcycle.jpg");
    Pixel[][] blur = blur(blueMotorcycle, 7);
    writeImage(blur, "blueMotorcycle2.png");

    Pixel[][] koala = readImage("koala.jpg");
    Pixel[][] crop = crop(koala, 10, 40, 500, 250);
    Pixel[][] crop2 = crop(koala, -10, -100, 100, 400);
    writeImage(crop, "koala2.jpg");
    writeImage(crop2, "koala3.jpg");
  }
/**
* This method negates the image in RGB space.
* Each red, green, and blue value is inverted.
* @param image The 2d array of pixels from an image.
* @return An array of pixels that is inverted in RGB space.
*/
  public static Pixel[][] negate(Pixel[][] image){
    Pixel[][] newImage = createPixelArray(image);
    for(int r = 0; r < image.length; r++){
      // Length of image is the same in every row, so we use image[0].length.
      for(int c = 0; c < image[0].length; c++){
        Pixel p = image[r][c];
        // We subtract the original value from 255 to invert the RGB values.
        newImage[r][c].setRGB(255-p.getRed(), 255-p.getGreen(), 255-p.getBlue());
      }
    }
    return newImage;
  }

/**
* This method mirrors the pixels in the top half of a picture into the bottom half.
* @param image The image that will be mirrored horizontally.
* @return The image that is mirrored horizontally.
*/
  public static Pixel[][] mirrorHorizontal(Pixel[][] image){
    Pixel[][] newImage = createPixelArray(image);
    // We iterate through the top half of the pixels.
    for(int r = 0; r < (image.length+1)/2; r++){
      for(int c = 0; c < image[0].length; c++){
        Pixel p = image[r][c];
        copyPixel(p, newImage[r][c]);
        copyPixel(p, newImage[image.length-r-1][c]);
      }
    }
    return newImage;
  }

/**
* This method mirrors the pixels in the left half of a picture into the right half.
* @param image The image that will be mirrored vertically.
* @return The image that is mirrored vertically.
*/
  public static Pixel[][] mirrorVertical(Pixel[][] image){
    Pixel[][] newImage = createPixelArray(image);
    // We iterate through the left half of the pixels.
    for(int r = 0; r < image.length; r++){
      for(int c = 0; c < (image[0].length+1)/2; c++){
        Pixel p = image[r][c];
        copyPixel(p, newImage[r][c]);
        copyPixel(p, newImage[r][image[0].length-c-1]);
      }
    }
    return newImage;
  }
/**
* This method detects edges and return pixels with all the edges in black.
* All other pixels are white.
* @param image The image whose edges will be detected.
* @return The edge image.
*/
  public static Pixel[][] edgeDetection(Pixel[][] image){
    Pixel[][] newImage = createPixelArray(image);
    for(int r = 1; r < image.length; r++){
      for(int c = 1; c < image[0].length; c++){
        Pixel p = image[r][c];
        Pixel q = image[r-1][c];
        Pixel s = image[r][c-1];
        // All the pixels in the new image are already black.
        // calculateDistance calculates the RGB distance between the two pixels.
        // If both distances are <= 30, then we set the pixel to white.
        if(calculateDistance(p, q) <= 30 && calculateDistance(p, s) <= 30){
          newImage[r][c].setRGB(255,255,255);
        }
      }
    }
    // This iterates through the left column.
    for(int row = 1; row < image.length; row++){
      if(calculateDistance(image[row][0], image[row-1][0]) <= 30){
        newImage[row][0].setRGB(255,255,255);
      }
    }
    // This iterates through the top row.
    for(int column = 1; column < image[0].length; column++){
      if(calculateDistance(image[0][column], image[0][column-1]) <= 30){
        newImage[0][column].setRGB(255,255,255);
      }
    }
    // There are no pixels above or to the left of the top left pixel.
    newImage[0][0].setRGB(255,255,255);
    return newImage;
  }
/**
* This method blurs the image by averaging RGB values around each pixel.
* @param image The image that is blurred.
* @param size The size of the square centered at each pixel where the pixels are averaged.
* @return The blurred image.
*/
  public static Pixel[][] blur(Pixel[][] image, int size){
    Pixel[][] newImage = createPixelArray(image);
    for(int r = 0; r < image.length; r++){
      for(int c = 0; c < image[0].length; c++){
        int rTotal = 0;
        int gTotal = 0;
        int bTotal = 0;
        // counter keeps track of how many pixels we average.
        int counter = 0;
        // This iterates through the size x size square around the pixel.
        for(int r1 = r - (size-1)/2; r1 <= r + (size-1)/2; r1++){
          for(int c1 = c - (size-1)/2; c1 <= c + (size-1)/2; c1++){
            if(r1 >= 0 && r1 < image.length && c1 >= 0 && c1 < image[0].length){
              rTotal += image[r1][c1].getRed();
              gTotal += image[r1][c1].getGreen();
              bTotal += image[r1][c1].getBlue();
              counter++;
            }
          }
        }
        // RGB values are integers, so we integer divide.
        newImage[r][c].setRGB(rTotal/counter, gTotal/counter, bTotal/counter);
      }
    }
    return newImage;
  }
/**
* This method crops an image given dimensions and a starting position.
* @param image The image that is cropped.
* @param startRow The starting row of the cropped image.
* @param startColumn The starting column of the cropped image.
* @param height The height of the cropped image.
* @param width The width of the cropped image.
* @return The cropped image.
*/
  public static Pixel[][] crop(Pixel[][] image, int startRow, int startColumn, int height, int width){
    Pixel[][] dimensions = new Pixel[height][width];
    // This new image has the correct dimensions.
    Pixel[][] newImage = createPixelArray(dimensions);
    for(int r = 0; r < newImage.length; r++){
      for(int c = 0; c < newImage[0].length; c++){
        // These are the positions relative to the actual image.
        int rPos = r+startRow;
        int cPos = c+startColumn;
        if(rPos<image.length && rPos>=0 && cPos<image[0].length && cPos>=0){
          Pixel p = image[rPos][cPos];
          copyPixel(p, newImage[r][c]);
        }
      }
    }
    return newImage;
  }
/**
* This helper method copies pixel p into pixel q.
* @param p The pixel that is copied.
* @param q The new pixel that has the same RGB values as p.
*/
  public static void copyPixel(Pixel p, Pixel q){
    q.setRGB(p.getRed(), p.getGreen(), p.getBlue());
  }
/**
* This method creates an array that will be used to store pixels.
* @param image Image that determines the dimensions of the manipulated image.
* @return A 2d array with the correct dimensions.
*/
  public static Pixel[][] createPixelArray(Pixel[][] image){
    Pixel[][] newImage = new Pixel[image.length][image[0].length];
    for(int r = 0; r < image.length; r++){
      for(int c = 0; c < image[0].length; c++){
        newImage[r][c] = new Pixel();
      }
    }
    return newImage;
  }

/**
* This method calculates the color distance beteween two pixels.
* @param p1 The first pixel.
* @param p2 The second pixel.
* @return The color distance.
*/
  public static double calculateDistance(Pixel p1, Pixel p2){
    int r1 = p1.getRed();
    int b1 = p1.getBlue();
    int g1 = p1.getGreen();
    int r2 = p2.getRed();
    int b2 = p2.getBlue();
    int g2 = p2.getGreen();
    double rDistance = (r1-r2)*(r1-r2);
    double bDistance = (b1-b2)*(b1-b2);
    double gDistance = (g1-g2)*(g1-g2);
    return Math.sqrt(rDistance + bDistance + gDistance);
  }

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
