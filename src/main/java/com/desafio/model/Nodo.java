package com.desafio.model;

class Nodo {  
    int x, y;  
    Nodo siguienteNodo;  

    public Nodo(int x, int y) {  
        this.x = x;  
        this.y = y;  
        this.siguienteNodo = null;  
    }  

    public void mover(int nuevoX, int nuevoY) {  
        if (siguienteNodo != null) {  
            int tempX = siguienteNodo.x;  
            int tempY = siguienteNodo.y;  
            siguienteNodo.mover(x, y);  
            x = nuevoX;  
            y = nuevoY;  
        }  
    }  
}  