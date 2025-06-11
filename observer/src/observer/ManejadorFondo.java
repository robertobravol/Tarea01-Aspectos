package observer;

import java.awt.Color;

import javax.swing.JFrame;

public class ManejadorFondo implements Listener{

	private JFrame jFrame;
	
	public ManejadorFondo(JFrame jFrame) {
		this.jFrame = jFrame;
	}


	@Override
	public void actualizar(Color nuevoColor) {
		jFrame.getContentPane().setBackground(nuevoColor);
		//System.out.println("Se ha cambiado el color del fondo a " + nuevoColor.toString());
	}

	
}
