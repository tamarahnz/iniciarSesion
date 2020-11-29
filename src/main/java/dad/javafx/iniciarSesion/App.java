package dad.javafx.iniciarSesion;

import dad.javafx.iniciarSesion.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private Controller c = new Controller();

	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(c.getView(), 400, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Iniciar sesión");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}