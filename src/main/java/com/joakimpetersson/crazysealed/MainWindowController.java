package com.joakimpetersson.crazysealed;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainWindowController implements Initializable {
	@FXML
	private GridPane MainWindow;
	
	@FXML
	private ListView<String> playerOneList;
	
	@FXML
	private ListView<String> boosterList;
	
	@FXML
	private ListView<String> playerTwoList;
	
	public void start(Stage stage) throws IOException {
		GridPane grid = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
		Scene scene = new Scene(grid);
		System.out.println("Starting main window");
		stage.setResizable(false);
		stage.getIcons().add(new Image("file:icon.png"));
		stage.setTitle("CrazySealed");
		stage.setScene(scene);
		stage.show();
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
