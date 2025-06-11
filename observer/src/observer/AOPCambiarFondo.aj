package observer;

import java.awt.Color;

import javax.swing.JButton;

public aspect AOPCambiarFondo {


    after(JButton boton, Color color): execution(* ManejadorBoton.accionBoton(..)) && args(boton, color) {
        System.out.println("Aspecto (aj): Cambiando fondo tras accionBoton de " + boton.getText());
        Main.observableManejador.notificar(color);
    }
}
