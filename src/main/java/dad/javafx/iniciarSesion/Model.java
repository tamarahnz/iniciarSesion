package dad.javafx.iniciarSesion;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.util.HashMap;

public class Model {

	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty contraseña = new SimpleStringProperty();
	private HashMap<String, String> datosFichero;
	
	public Model(HashMap<String, String> datosFichero) {
		// TODO Auto-generated constructor stub
		this.datosFichero = datosFichero;
	}

	public final StringProperty usuarioProperty() {
		return this.usuario;
	}
	
	public final String getUsuario() {
		return this.usuarioProperty().get();
	}
	
	public final void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}
	
	public final StringProperty contraseñaProperty() {
		return this.contraseña;
	}
	
	public final String getContraseña() {
		return this.contraseñaProperty().get();
	}
	
	public final void setContraseña(final String contraseña) {
		this.contraseñaProperty().set(contraseña);
	}

	public HashMap<String, String> getDatosFichero() {
		return datosFichero;
	}

	public void setDatosFichero(HashMap<String, String> datosFichero) {
		this.datosFichero = datosFichero;
	}
	
}