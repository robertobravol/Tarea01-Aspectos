package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

	public static ManejadorBoton observableManejador;
	
	public static void main(String[] args) {
	
		        // Crear la ventana
		        JFrame ventana = new JFrame("Implementando AOP y Observer");
		        ventana.setSize(400, 300);
		        
		        //seteado de terminar ejecucion al cerrar ventana
		        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
		        ventana.setLayout(new FlowLayout());
		        

		        // Creacion botones
		        JButton boton1 = new JButton("Boton 1");
		        JButton boton2 = new JButton("Boton 2");
		        JButton boton3 = new JButton("Boton 3");
		        
		        //Creacion manejador de boton(observable)
		        observableManejador = new ManejadorBoton();
		        
		        //creacion log de consola(Observador)
		        ConsolaLogger consolaLogger = new ConsolaLogger();
		        //Creacion manejador Fondo(Observador)
		        ManejadorFondo observadorFondo = new ManejadorFondo(ventana);
		        
		        //aniadir los observadores al observable
		        observableManejador.addListener(observadorFondo);
		        observableManejador.addListener(consolaLogger);
		        
		        //capturadores de click
		        boton1.addActionListener(e -> observableManejador.accionBoton(boton1, Color.RED));
		        boton2.addActionListener(e -> observableManejador.accionBoton(boton2, Color.GREEN));
		        boton3.addActionListener(e -> observableManejador.accionBoton(boton3, Color.BLUE));
		        
		        // Agregar componentes
		        ventana.add(boton1);
		        ventana.add(boton2);
		        ventana.add(boton3);
		        ventana.setVisible(true);

		  
		        
		        

		        // Mostrar ventana
		        ventana.setVisible(true);

	}

}
