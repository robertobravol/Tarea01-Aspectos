package observer;
import java.util.ArrayList;
import java.util.List;

public class CambiadorColor implements Subject {
	 private final List<Listener> listeners = new ArrayList<>();

	    	@Override
	    	public void agregarListener(Listener listener) {
	        listeners.add(listener);
	    	}
	    	
	    	@Override
	        public void quitarListener(Listener listener) {
	            listeners.remove(listener);
	        }
	    	
	    	@Override
	        public void notificarListeners(String nuevoColor) {
	            for (Listener l : listeners) {
	                l.actualizar(nuevoColor);
	            }
	        }
}
