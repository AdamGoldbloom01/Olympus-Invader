package latesgo;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael Capuano
 */
public class LatesGo extends Application {

    @Override
    public void start(Stage primaryStage) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Rooms> list = new ArrayList<Rooms>();

        Floors fa = new Floors();
        list = fa.getList();       
        
        int count = 1;
        for (int i = 0; i < fa.getNfloor().length; i++) {
            for (int j = 0; j < fa.getNfloor()[0].length; j++) {
                
                System.out.print("[" + fa.getNfloor()[i][j]+ "]");
                
                if (fa.getNfloor()[i][j] != null) {
                    
                    System.out.print(count);
                    count++;
                }
                
            }
            System.out.println();
        }

        //launch(args);
    }

}
