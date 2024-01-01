package introtocsHW1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * A visualization for the rocket homework problem.
 *
 * @author Dov Neimand
 */
public abstract class Graphic extends JFrame {

    /**
     * Handles images
     */
    private class MovingPicture {

        public final BufferedImage image;
        private double[] x;
        private final int rotate, height, width;

        /**
         * The constructor.
         *
         * @param image The address of the image.
         * @param heightInd The index of the height variable in startX. If there
         * is no set height, then this should be -1;
         * @param rotationInd The index of the rotation value in startX. If
         * there is none, then this should be -1.
         * @param widthIndex The index of the width value in startX. If there is
         * none, then this should be -1.
         * @param startX the data neccesesary to set the position of the image.
         * The first value should be the x position, and the second value the y
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
         * Resets the location of the image.
         *
         * @param newLocation The new location of the image, with the first vale
         * on the x axis and the second value on the y axis.
         */
        public void update() {
            x = updatePos(x);
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
            return centerY() + (int) (fileHeight() / 2);
        }

        /**
         * The width of the image.
         *
         * @return The width of the image.
         */
        public int fileWidth() {
            return image.getWidth(rootPane);
        }

        /**
         * The height of the image.
         *
         * @return The height of the image.
         */
        public int fileHeight() {
            return image.getHeight(rootPane);
        }

        /**
         * Does this image have a predefined height seperate from the file
         * height.
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

            if (hasHeight() || hasWidth()) {
                double xMult = hasWidth() ? getWidth() / fileWidth() : 1;
                double yMult = hasHeight() ? getHeight() / fileHeight() : 1;
                g2.scale(xMult, yMult);
            }

            g2.drawImage(image, topLeftX(), topLeftY(), rootPane);

            g2.dispose();
        }

    }

    private MovingPicture picture;

    /**
     * Updates the position of the rocket.
     *
     * @param x The old position data.
     * @return The new [x, y] position. Depending on the implementation, more
     * data may be necessary.
     */
    public abstract double[] updatePos(double[] x);

    /**
     * The constructor.
     *
     * @param title The title of the window.
     * @param rotationInd The index of the rotation variable. This should be -1
     * if there is no rotation variable.
     * @param heightInd The index of the height variable. This should be -1 if
     * there is no height variable.
     * @param widthInd The index of the width variable. This should be -1 if
     * there is no width variable.
     * @param data All the data for the rocket.
     */
    public Graphic(String title, int rotationInd, int heightInd, int widthInd,
            double... data) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            picture = new MovingPicture("rocket.png", rotationInd, heightInd,
                    widthInd, data);
        } catch (IOException ex) {
            Logger.getLogger(Graphic.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

        setSize(600, 400);

        int delay = 5;

        buffer = new BufferedImage(getWidth(), getHeight(),
                BufferedImage.TYPE_INT_ARGB);

        new Timer(delay, (ActionEvent e) -> {
            picture.update();
            repaint();
        }).start();

//        add(new DrawingPanel());
        setVisible(true);
    }

    private BufferedImage buffer;

    private void setBackground(){
        Graphics2D g2 = buffer.createGraphics();
        g2.setColor(Color.black);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
    
    @Override
    public void paint(Graphics g) {
        
        setBackground();

        picture.addTo(buffer);

        g.drawImage(buffer, 0, 0, this);

    }

    public static void main(String[] args) {
        new Graphic("Test", 2, 3, 4, 50, 350, Math.PI / 4, 80, 30) {
            @Override
            public double[] updatePos(double[] x) {
                x[0]++;
                x[1]--;
                return x;
            }
        };
    }
}
