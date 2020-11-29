package dad.javafx.iniciarSesion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public abstract class LeerFichero {

	public static HashMap<String, String> leer(String usuario) throws IOException {
		
		HashMap<String, String> resultado = new HashMap<String, String>();
		FileReader fr = new FileReader(new File(usuario));
		BufferedReader br = new BufferedReader(fr);
		String[] actual;
		String linea;
		while ((linea = br.readLine()) != null) {
			actual = linea.split(",");
			resultado.put(actual[0], actual[1]);
		}
		br.close();
		return resultado;
	}
}


