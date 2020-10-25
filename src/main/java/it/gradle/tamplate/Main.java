package it.gradle.tamplate;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showPersonOverview();
    }
    
    /**
     * Initializes the root layout.
     * @throws IOException 
     */
    public void initRootLayout() throws IOException {
        // Load root layout from fxml file.
        rootLayout = FXMLLoader.load(getClass().getResource("/RootLayout.fxml"));
        
        // Show the scene containing the root layout.
        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showPersonOverview() throws IOException {
        // Load person overview.
        AnchorPane personOverview = FXMLLoader.load(getClass().getResource("/PersonOverview.fxml"));
        
        // Set person overview into the center of root layout.
        rootLayout.setCenter(personOverview);
    }
    
	/**
	 * Returns the main stage.
	 * @return
	 */
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	public BorderPane getRootLayout() {
		return rootLayout;
	}
}