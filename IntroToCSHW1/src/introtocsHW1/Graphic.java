package introtocsHW1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * A visualization for the rocket homework problem.
 *
 * @author Dov Neimand
 */
public abstract class Graphic extends JFrame {

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
     * @param fileName The name of the file that has the picture.
     * @param rotationInd The index of the rotation variable. This should be -1
     * if there is no rotation variable.
     * @param heightInd The index of the height variable. This should be -1 if
     * there is no height variable.
     * @param widthInd The index of the width variable. This should be -1 if
     * there is no width variable.
     * @param data All the data for the rocket.
     */
    public Graphic(String title, String fileName, int rotationInd, int heightInd, int widthInd,
            double... data) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            picture = new MovingPicture(fileName, rotationInd, heightInd,
                    widthInd, data);
        } catch (IOException ex) {
            Logger.getLogger(Graphic.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

        setSize(600, 400);
        
        buffer = new BufferedImage(getWidth(), getHeight(),
                BufferedImage.TYPE_INT_ARGB);

        final int delay = 10;
        new Timer(delay, (ActionEvent e) -> {
            picture.update(x -> updatePos(x));
            repaint();
        }).start();

//        add(new DrawingPanel());
        setVisible(true);
    }

    private final BufferedImage buffer;

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
        new Graphic("Test", "rocket.png", 2, 3, 4, 0, 400, Math.PI / 4, 80, 30) {
            @Override
            public double[] updatePos(double[] x) {
                x[0]+=2;
                x[1]-=2;
                return x;
            }
        };
    }
}
