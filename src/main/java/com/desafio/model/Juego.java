package com.desafio.model;

import javax.swing.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  

public class Juego {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("Juego de Víbora");  
        JuegoPanel panel = new JuegoPanel();  
        JButton agregarViboraButton = new JButton("Agregar Víbora");  

        agregarViboraButton.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                panel.agregarVibora();  
            }  
        });  

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setSize(800, 600);  
        frame.add(panel);  
        frame.add(agregarViboraButton, BorderLayout.SOUTH);  
        frame.setVisible(true);  
    }  
}  