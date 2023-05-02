package Assignment03_000315902;

import javafx.scene.canvas.GraphicsContext;

/**Creates Window which is placed at the top left of home
 *
 * @author Armand Amores
 */
public class Window {
    private double x, y, diameter; // x and y used for positioning, and diameter for
    // dimension of circle created

    /** Constructor for Window drawing
     * @param x position
     * @param y position
     * @param diameter used for dimension of circle
     */
    public Window (double x, double y, double diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    /** Takes size in House class to get 2 equal diameters to create
     *  oval shape as circle. x and y for positioning.
     * @param gc uses Graphics Context method to draw
     */
    public void draw(GraphicsContext gc) {
        gc.fillOval(this.x, this.y,this.diameter, this.diameter);



    }

}
