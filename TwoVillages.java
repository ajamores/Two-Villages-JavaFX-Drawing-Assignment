package Assignment03_000315902;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;



import static javafx.application.Application.launch;



/**
 * This project contains the drawing of 2 villages each with 3 houses. Each house contains
 * 1 window and a door. Each simulation has random size houses, distances, and information
 * below. One king house is also included. The Two Villages class contains the framework for
 * all the java fx components and creates the instances each village and king home.
 *
 * @author Armand Amores ID:000315902
 */
public class TwoVillages extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        scene.setFill(Color.BLUE);
        Canvas canvas = new Canvas(1200, 700); // Set canvas Size in Pixels
        stage.setTitle("Villages"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        /** sets custom background image **/
        Image backgroundImage = new Image("windows_xp_bliss-wide.jpg");
        gc.drawImage(backgroundImage, 0, 0, canvas.getWidth(), canvas.getHeight());


        // YOUR CODE STARTS HERE
        /** created village instances with different parameters - name, x, y, size, and color.
         * x and y used to position drawing.
         */
        Village village1 = new Village("Sky Village", 100, 200, 500, Color.RED);
        village1.draw(gc);

        Village village2 = new Village("Mississauga", 400, 500, 400, Color.DARKSEAGREEN);
        village2.draw(gc);

        /**Creates king home using house instance, that takes only x and y as parameters **/
        House king = new House(800, 200);
        king.draw(gc);


        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}