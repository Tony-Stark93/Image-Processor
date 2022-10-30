package model;

/**
 * Represents an individual Pixel in an image.
 */
public interface Pixel {

  /**
   * An observer on a pixel that returns the red component.
   *
   * @return int between 0 and MaxVal
   */
  int getRed();

  /**
   * An observer on a pixel that returns the green component.
   *
   * @return int between 0 and MaxVal
   */
  int getGreen();

  /**
   * An observer on a pixel that returns the blue component.
   *
   * @return int between 0 and MaxVal
   */
  int getBlue();

  /**
   * An observer on a pixel that returns the maximum possible value of a component.
   *
   * @return an integer
   */
  int getMaxVal();

  /**
   * Returns a pixel representing the greyscale version of the pixel.
   *
   * @return a greyscale version of the pixel
   */
  Pixel greyscale();

  /**
   * Returns a pixel that is representing the pixel brightened by the given factor.
   *
   * @return a brightened version of the pixel
   */
  Pixel brighten(int factor);

  /**
   * Returns a pixel that is representing the pixel darkened by the given factor.
   *
   * @return a darkened version of the pixel
   */
  Pixel darken(int factor);
}
