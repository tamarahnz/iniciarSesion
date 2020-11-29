package dad.javafx.iniciarSesion;

import dad.javafx.iniciarSesion.LeerFichero;
import javafx.application.Platform;
import java.io.IOException;
import org.apache.commons.codec.digest.DigestUtils;

public class Controller {
	
	private View view = new View();
	private Model model;
	
	public void verificarUsuario() {
		if (model.getDatosFichero().containsKey(model.getUsuario())) {
			if (model.getDatosFichero().get(model.getUsuario()).equals(DigestUtils.md5Hex(model.getContraseña()).toUpperCase())) {
			view.accesoPermitido();
			}else {
			view.accesoDenegado();
			}
		}
	}
	
	public Controller() {
		
		try {
			model = new Model(LeerFichero.leer("users.csv"));
		} catch (IOException e1) {
			view.accesoDenegado();
			Platform.exit();
		}
		
		model.usuarioProperty().bind(view.getUsuarioField().textProperty());
		model.contraseñaProperty().bind(view.getContraseñaField().textProperty());
		view.getAccederBtn().setOnAction(e -> verificarUsuario());
		view.getCancelarBtn().setOnAction(e-> Platform.exit());
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}
	
}