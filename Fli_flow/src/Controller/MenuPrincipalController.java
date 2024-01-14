package Controller;


import static application.Main.CerrarVentanaAnterior;

import application.DatosWindow;
import application.Main;
import application.ProyectoWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MenuPrincipalController {
	@FXML 
	private ImageView  imagenMenu;
	
	public void initialize() {
		
		Image imagen = new Image(getClass().getResourceAsStream("logo-transparent.png"));
		imagenMenu.setImage(imagen);
	}
	// Event Listener on Button.onAction
	@FXML
	public void proyectoMenuOnClick(ActionEvent event) {
		//CerrarVentanaAnterior(event); 
		Stage ProyectoWindow = new Stage();
		ProyectoWindow mp = new ProyectoWindow(); 
		mp.start(ProyectoWindow);   
	}
	
	@FXML
	public void misDatosMenuOnClick(ActionEvent event) {
		Stage DatosWindow = new Stage();
		DatosWindow mp = new DatosWindow(); 
		mp.start(DatosWindow);
	}
	
	public void cerrarSesionOnClick(ActionEvent event) {
		CerrarVentanaAnterior(event); 
		Stage Main = new Stage();
		Main mp = new Main(); 
		mp.start(Main);   
	}
	

}
