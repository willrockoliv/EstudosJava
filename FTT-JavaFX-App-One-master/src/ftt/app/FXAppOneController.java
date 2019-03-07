package ftt.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXAppOneController {

	@FXML //Annotation
	private Label labelStatus;
	
	@FXML
	protected void handlerOpenFileButton(ActionEvent event) {
		System.out.println("Vai Continthians!!!");
		labelStatus.setText("Vai Conrinthians!!!");
	}
	
}
