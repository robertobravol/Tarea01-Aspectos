package observer;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class ManejadorBoton implements Subject {
	 private final List<Listener> listeners = new ArrayList<>();

	 		//metodo trigger para el AOP de cambio de fondo
	 		public void accionBoton(JButton boton, Color color) {
	 			System.out.println("Boton " + boton.getText() + " Seleccionado. ");
	 			//notificar(color); ya no aqui, se llama en el ASPECTO
	 		}
	 
	    	@Override
	    	public void addListener(Listener listener) {
	        listeners.add(listener);
	    	}
	    	
	    	@Override
	        public void deleteListener(Listener listener) {
	            listeners.remove(listener);
	        }
	    	
	    	@Override
	        public void notificar(Color nuevoColor) {
	            for (Listener l : listeners) {
	                l.actualizar(nuevoColor);
	            }
	        }
}
