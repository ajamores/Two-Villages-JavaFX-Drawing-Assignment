package Assignment03_000315902;

import javafx.scene.canvas.GraphicsContext;

import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.Arrays;


/** Village class used to create set of 3 homes with each instance
 * @Author Armand Amores
 */
public class Village {
    /** Used to position along co-ordinate plane**/
    private double x, y;
    /** Used to determine size of village in meters. **/
    private double size;
    /** Sets each home color. **/
    private Color color;
    /** Provides name of each village **/
    private String name;


    /**
     * @param name Prints name of village
     * @param x co-ord on plane
     * @param y co-ord on plane
     * @param size determines size of village in meters
     * @param color defines color of houses
     */
    public Village(String name, double x, double y, double size, Color color){
        this.name = name;
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /** Method used to draw a village containing 3 houses.
     * Logic for determining randomness of space and size included.
     * @param gc object from GraphicsContext to draw
     */
    public void draw(GraphicsContext gc) {
        /** Used to set random values within range of 20 and 90 to generate
         * each house size properly.
         **/
        double house1Size = (double)(Math.random() * 70) + 20;
        double house2Size = (double)(Math.random() * 70) + 20;
        double house3Size = (double)(Math.random() * 70) + 20;

        /** Creating first house instance which takes first x co-ord, y position determined
         * by subtracting size of home, followed by randomized size, and lastly color of home.
         **/
        House house1 = new House(this.x, this.y-house1Size, house1Size, this.color);
        int space1 = (int)(Math.random() * 30) + 5; // creates range within 5 and 35 to determine spacing between houses.

        /** Creates 2nd instance of House. x added with house size and space to move along x-axis line.
         *   y position determined by subtracting size of home. 3rd parameter contains random size, and lastly color
         **/
        House house2 = new House(this.x+house1Size+space1, this.y-house2Size, house2Size, this.color);
        int space2 = (int)(Math.random() * 30) + 5; // creates range within 5 and 35 to determine spacing between houses.

        /** Creates 2nd instance of House. x added with house size 1 & 2 and space  to move along x-axis line.
         *   y position determined by subtracting size of home. 3rd parameter contains random size, and lastly color
         **/
        House house3 = new House(this.x+house1Size+space1+house2Size+space2, this.y-house3Size, house3Size, this.color);

        //Draws each instance of houses
        house1.draw(gc);
        house2.draw(gc);
        house3.draw(gc);



        this.size = ((house1Size + space1 + house2Size + space2 + house3Size) * 20) / 100; // calculates size of village in meters
        int population = house1.getOccupants() + house2.getOccupants() + house3.getOccupants(); // calculates each individual houses occupants and adds them
        String villageInformation = String.format("%s (Size: %.2fm, Population: %d)", name, size, population); // formats information that is below each home
        gc.fillText(villageInformation, this.x, this.y + 20);// used to position information below each village



    }
}
