package com.desafio.model;

import javax.swing.*;  
import java.awt.*;  

public class JuegoPanel extends JPanel {  
    private java.util.List<Vibora> viperas = new java.util.ArrayList<>();  

    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        for (Vibora vibora : viperas) {  
            Nodo nodo = vibora.cabeza;  
            while (nodo != null) {  
                g.fillOval(nodo.x, nodo.y, 100, 100);  
                nodo = nodo.siguienteNodo;  
            }  
        }  
    }  

    public void agregarVibora() {  
        Vibora nuevaVibora = new Vibora(50, 50); // Posición inicial  
        nuevaVibora.start();  
        viperas.add(nuevaVibora);  
        repaint(); // Actualizar gráficos  
    }  
}  