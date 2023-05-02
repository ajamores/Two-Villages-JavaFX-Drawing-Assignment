package Assignment03_000315902;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;



import java.awt.*;

/**
 * Implementation of house structure, which draws the square. Inside the square will contain
 * the window and door elements.
 * @Author Armand Amores
 */
public class House {
    /** x cord - to help position within canvas **/
    private double x;
    /**y cord - works in tandem with x **/
    private  double y;
    /**Determines size of home , works as length and width **/
    private double size;
    /** Determines how many people in each home **/
    private int occupants;
    /** Sets color of house or square created **/
    private Color color;
    /** Calls on Door class, enables drawing inside house **/
    private Door door;
    /** Calls on Window class, enables drawing inside house **/
    private Window window;


    /** Constructor takes instance values. Also includes random occupants.
     * Used to generate each house in village class
     * @param x position in canvas
     * @param y position in canvas
     * @param size determines how large
     * @param color determines color of square
     * @Author Armand Amores
     */
    public House(double x, double y, double size,  Color color) {
        this.x = x; //takes instance x
        this.y = y; // takes instance y
        this.size = size; // takes instance size
        this.color = color; // takes instance color
        this.occupants = (int)(Math.random() * 20) + 1; //generate random occupants from 1 and 20




    }

    /** Used to create the king house, takes
     * only 2 parameters used for placement. Color is set for this
     * house and occupants include only the king
     * @param x positioning in canvas
     * @param y positioning in canvas
     */
    public House(double x, double y) {
        this.x = x;
        this.y = y;
        this.size = 200;
        this.color = Color.GOLDENROD; // set color for special home
        this.occupants = 1; // only king lives here



    }

    /** Calls on GraphicsContext and enables draw methods
     * @param gc variable name Graphics Context
     */
    public void draw(GraphicsContext gc) {
       //create square
        gc.setFill(this.color); //sets color
        gc.fillRect(this.x, this.y,size, size); //size to act as length and width, should be even creating square



        //create door
        door = new Door(); // create door instance
        // Dividing by 2 allows for half of the house, allowing for positing in the centre of home
        door.Gate(this.x + size / 2, this.y + size / 2, this.size / 2) ;
        gc.setFill(Color.WHITE); // set door color white
        door.draw(gc); // draws image

        // create window
        // Follows similar logic as door, but divide by 5 to get 1/5 size of house to position at top left side of home.
        window = new Window(this.x + size / 5, this.y + size  / 5, size / 5);
        window.draw(gc);




    }


    /**
     * @return returns the random number of occupants
     */
    public int getOccupants() {
        return occupants;
    }

    /**
     * @param occupants Sets the number of occupants for each home
     */
    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    /**
     * @return size of home
     */
    public double getSize() {
        return size;
    }
}


