package observer;

public class ConsolaLogger implements Listener{
	
    private final String nombre;

    public ConsolaLogger(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String nuevoColor) {
        System.out.println(nombre + ": El color cambió a " + nuevoColor);
    }
    
}
