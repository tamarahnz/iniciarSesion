package dad.javafx.iniciarSesion;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.util.HashMap;

public class Model {

	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty contrase�a = new SimpleStringProperty();
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
	
	public final StringProperty contrase�aProperty() {
		return this.contrase�a;
	}
	
	public final String getContrase�a() {
		return this.contrase�aProperty().get();
	}
	
	public final void setContrase�a(final String contrase�a) {
		this.contrase�aProperty().set(contrase�a);
	}

	public HashMap<String, String> getDatosFichero() {
		return datosFichero;
	}

	public void setDatosFichero(HashMap<String, String> datosFichero) {
		this.datosFichero = datosFichero;
	}
	
}