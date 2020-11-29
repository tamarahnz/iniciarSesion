package dad.javafx.iniciarSesion;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;

public class View extends BorderPane {
	
	private TextField usuarioField;
	private PasswordField contraseñaField;
	private Button accederBtn;
	private Button cancelarBtn;
	
	public TextField getUsuarioField() {
		return usuarioField;
	}

	public void setUsuarioField(TextField usuarioField) {
		this.usuarioField = usuarioField;
	}

	public PasswordField getContraseñaField() {
		return contraseñaField;
	}

	public void setContraseñaField(PasswordField contraseñaField) {
		this.contraseñaField = contraseñaField;
	}

	public Button getAccederBtn() {
		return accederBtn;
	}

	public void setAccederBtn(Button accederBtn) {
		this.accederBtn = accederBtn;
	}

	public Button getCancelarBtn() {
		return cancelarBtn;
	}

	public void setCancelarBtn(Button cancelarBtn) {
		this.cancelarBtn = cancelarBtn;
	}

	public View() {
		super();
		
		usuarioField = new TextField();
		contraseñaField = new PasswordField();
		usuarioField.setPromptText("Usuario");
		contraseñaField.setPromptText("Contraseña");
		accederBtn = new Button("Acceder");
		cancelarBtn = new Button("Cancelar");
		
		GridPane root = new GridPane();
		root.setHgap(30);
		root.setVgap(10);
		root.setAlignment(Pos.CENTER);
		root.addRow(0,new Label("Usuario:"), usuarioField);
		root.addRow(1,new Label("Contraseña:"), contraseñaField);
		
		HBox botonesBox = new HBox();
		botonesBox.setAlignment(Pos.TOP_CENTER);
		botonesBox.setSpacing(10);
		botonesBox.getChildren().addAll(accederBtn, cancelarBtn);
		
		root.add(botonesBox, 0, 2);
		this.setCenter(root);
	}
	
	public void accesoPermitido() {
		Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setTitle("Iniciar sesión");
		alerta.setHeaderText("Acceso permitido");
		alerta.setContentText("Las credenciales de acceso son válidas.");
		alerta.show();
	}
	
	public void accesoDenegado() {
		Alert alerta = new Alert(AlertType.ERROR);
		alerta.setTitle("Iniciar sesión");
		alerta.setHeaderText("Acceso denegado");
		alerta.setContentText("El usuario y/o la contraseña no son válidos.");
		alerta.show();
	}

}