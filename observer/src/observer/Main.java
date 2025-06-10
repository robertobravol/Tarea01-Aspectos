package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {
	
		        // Crear la ventana
		        JFrame ventana = new JFrame("Implementando AOP y Observer");
		        ventana.setSize(400, 300);
		        
		        //seteado de terminar ejecucion al cerrar ventana
		        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
		        ventana.setLayout(new FlowLayout());
		        
		        // Crear panel para cambiar el color
		        JPanel panel = new JPanel();
		        panel.setPreferredSize(new Dimension(250, 100));

		        // Crear botón
		        JButton boton = new JButton("Cambiar color");

		        // Acción al hacer clic
		        boton.addActionListener(e -> {
		            panel.setBackground(Color.YELLOW);
		            System.out.println("Fondo cambiado a AMARILLO");
		        });

		        // Agregar botón y panel a la ventana
		        ventana.add(boton);
		        ventana.add(panel);

		        // Mostrar ventana
		        ventana.setVisible(true);

	}

}
