package com.joakimpetersson.crazysealed;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main (String[] args) {
		System.out.println("hello world");
		Application.launch(args);
	}

	@Override
	public void start (Stage stage) throws Exception {		
		MainWindowController mainWindow = new MainWindowController();	
		mainWindow.start(stage);
	}	

	
}
