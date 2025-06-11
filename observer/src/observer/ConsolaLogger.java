package observer;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ConsolaLogger implements Listener{
	
		private static final Map<Color, String> nombreColores = new HashMap<Color, String>();
		

	    public ConsolaLogger() {
	  
	        nombreColores.put(Color.RED, "Rojo");
	        nombreColores.put(Color.GREEN, "Verde");
	        nombreColores.put(Color.BLUE, "Azul");
	    }

	    @Override
	    public void actualizar(Color nuevoColor) {
	        System.out.println("El color cambió a " + nombreColores.getOrDefault(nuevoColor, nuevoColor.toString()));
	    }
}
