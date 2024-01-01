package introtocsHW1;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.function.Function;
import javax.imageio.ImageIO;

/**
 * Handles images
 *
 * @author Dov Neimand
 *
 */
public class MovingPicture {

    public final BufferedImage image;
    protected double[] x;
    private final int rotate, height, width;

    /**
     * The constructor.
     *
     * @param image The address of the image.
     * @param heightInd The index of the height variable in startX. If there is
     * no set height, then this should be -1;
     * @param rotationInd The index of the rotation value in startX. If there is
     * none, then this should be -1.
     * @param widthIndex The index of the width value in startX. If there is
     * none, then this should be -1.
     * @param startX the data neccesesary to set the position of the image. The
     * first value should be the x position, and the second value the y
     * position.
     */
    public MovingPicture(String image, int rotationInd, int heightInd,
            int widthIndex, double... startX) throws IOException {

        this.image = ImageIO.read(new File(image));
        x = startX;

        this.rotate = rotationInd;
        this.height = heightInd;
        this.width = widthIndex;
    }

    /**
     * Resets the image data, x.
     *
     * @param f A function that takes the previous position data and generates
     * new position data.
     */
    public void update(Function<double[], double[]> f) {
        x = f.apply(x);
    }

    /**
     * The x location of the image.
     *
     * @return The x location of the center of the image.
     */
    public int centerX() {
        return (int) x[0];
    }

    /**
     * The y location of the center of the image.
     *
     * @return The y location of the image.
     */
    public int centerY() {
        return (int) x[1];
    }

    /**
     * The top left corner of the image.
     *
     * @return The top left corner of the image.
     */
    public int topLeftX() {
        return centerX() + (int) (getWidth() / 2);
    }

    /**
     * The top right corner of the image.
     *
     * @return The top right corner of the image.
     */
    public int topLeftY() {
        return centerY() + (int) (getHeight() / 2);
    }

    /**
     * The width of the image.
     *
     * @return The width of the image.
     */
    public int fileWidth() {
        return image.getWidth();
    }

    /**
     * The height of the image.
     *
     * @return The height of the image.
     */
    public int fileHeight() {
        return image.getHeight();
    }

    /**
     * Does this image have a predefined height seperate from the file height.
     *
     * @return True if there is a separate height. False otherwise.
     */
    public boolean hasHeight() {
        return height != -1;
    }

    /**
     * Does this image have an artificially set height.
     *
     * @return True if there is an artificially set height, false otherwise.
     */
    public boolean hasWidth() {
        return width != -1;
    }

    /**
     * The height the image should be set to.
     *
     * @return The height the image should be set to.
     */
    public double getHeight() {
        return x[height];
    }

    /**
     * The width the image should be set to.
     *
     * @return The width the image should be set to.
     */
    public double getWidth() {
        return x[width];
    }

    /**
     * Does this shape rotate?
     *
     * @return True if its meant to rotate, false otherwise.
     */
    public boolean roates() {
        return rotate != -1;
    }

    /**
     * The angle of rotation in radians.
     *
     * @return The angle of rotation in radians.
     */
    public double rotation() {
        return x[rotate];
    }

    /**
     * Draws this image onto the buffered image.
     *
     * @param bi The buffered image that this image is to be added to.
     */
    public void addTo(BufferedImage bi) {
        Graphics2D g2 = bi.createGraphics();

        if (roates()) {
            g2.translate(centerX(), centerY());
            g2.rotate(rotation());
        }

        double xMult = 1, yMult = 1;
        if (hasWidth()) xMult = getWidth() / fileWidth();
        if (hasHeight()) yMult = getHeight() / fileHeight();
        
        g2.translate(centerX(), centerY());
        g2.scale(xMult, yMult);

        g2.drawImage(image, -fileWidth()/2, -fileHeight()/2, null);

        g2.dispose();
    }

}
