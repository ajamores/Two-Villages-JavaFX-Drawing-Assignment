package Assignment03_000315902;

import javafx.scene.canvas.GraphicsContext;

/**
 * Creates door for each house created in House class.
 * @Author Armand Amores
 */
public class Door {
    /** positioning along x axis**/
    private double x;
    /** position along y axis **/
    private double y;
    /** Determines how tall, uses house length in House class divided by 2 to fit home **/
    private double height;

    /**
     * @param x position on axis
     * @param y position on axis
     * @param height takes instance of House class length to determine how tall
     */
    public void Gate(double x, double y, double height) {
    this.x = x;
    this.y = y;
    this.height = height;
    }

    /**
     * @param gc draws door image within house
     * @param height Width of door divided by 2 and is further divided by 2 again in House class
     *               Creates proper dimension and is fitted accordingly in each house.
     */
    public void draw(GraphicsContext gc) {
        gc.fillRect(this.x, this.y, this.height/2, this.height);



    }
}
