package Controller;

import static application.Main.CerrarVentanaAnterior;
import static application.Main.ModificarUsuario;


import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import application.Main;
import application.MenuPrincipal;
import application.PopUpMain;
import application.Proyecto;
import application.ProyectoWindow;
import application.Usuario;
import application.UsuarioWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class DatosUsuarioController {
	
	@FXML 
	private TextField fieldUsuario;
	@FXML 
	private TextField fieldContraseña;
	@FXML 
	private TextField fielUsuarioID;
	
	public void initialize(URL url, ResourceBundle rb) {
		this.fieldUsuario.setText(Main.user.getNombre());
		this.fieldUsuario.setDisable(true);
		this.fielUsuarioID.setText(Integer.toString(Main.user.getId()));
		this.fielUsuarioID.setDisable(true);
		this.fieldContraseña.setText(Main.user.getPassword());
		
	}
	// Event Listener on Button.onAction
	@FXML
	public void atrasOnClick(ActionEvent event) {
		CerrarVentanaAnterior(event); 
	}
	
	@FXML
	public void ModificarUsuarioOnClick(ActionEvent event) {
		
		String nuevaContraseña = fieldContraseña.getText();
		if(nuevaContraseña.trim().isEmpty()) 
		{
			Stage PopUpMain = new Stage();
        	PopUpMain mp = new PopUpMain("La contraseña tienen que rellenarse"); 
    		mp.start(PopUpMain);
		}
		else
		{
			boolean result = ModificarUsuario(Main.user.getId(), Main.user.getNombre(), nuevaContraseña , Main.user.getEsAdmin());
			if(result) {
				CerrarVentanaAnterior(event); 
				//mostrarPopUP
			}
		}
		
		
		
	}
	
}
