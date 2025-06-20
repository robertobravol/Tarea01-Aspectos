package observer;

import java.awt.Color;

import javax.swing.JButton;

//implementacion de un aspecto que identifica cuando se ejecuta la funcion accionBoton().
public aspect AOPCambiarFondo {


    after(JButton boton, Color color): execution(* ManejadorBoton.accionBoton(..)) && args(boton, color) {
        System.out.println("Aspecto (aj): Cambiando fondo tras accionBoton de " + boton.getText());
        Main.observableManejador.notificar(color);
    }
    
    after(JButton boton, Color colorPorDefecto): execution(* ManejadorBoton.restablecerFondo(..)) && args(boton, colorPorDefecto) {
        System.out.println("Aspecto (aj): Restableciendo fondo tras accionBoton de " + boton.getText());
        Main.observableManejador.notificar(colorPorDefecto);
    }
}
