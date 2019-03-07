package ftt.app;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		BorderPane root;
		
		try {
			//Carrega o arquivo FXML com a definição da tela
			root = (BorderPane)FXMLLoader.load(getClass().getResource("FXAppOne.fxml"));
			
			//Define a sena principal (janela)
			Scene scene = new Scene(root, 800, 600);
			
			//Carrega o arquivo CSS
			scene.getStylesheets().add(getClass().getResource("FXAppOne.css").toExternalForm());
			
			//Faz a mágica...
			primaryStage.setScene(scene);
			primaryStage.show();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	} //start
	
	public static void main(String[] args)  {
		
		launch(args);

	}

}
