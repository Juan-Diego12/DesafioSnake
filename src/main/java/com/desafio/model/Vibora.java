package com.desafio.model;

class Vibora extends Thread {  
    Nodo cabeza;  
    String direccion;  
    boolean controladaPorUsuario;  

    public Vibora(int x, int y) {  
        cabeza = new Nodo(x, y);  
        direccion = "derecha"; // Dirección inicial  
        controladaPorUsuario = true; // Por defecto controlada por el usuario  
    }  

    public String getDireccion() {  
        return direccion;  
    }  

    public void setDireccion(String direccion) {  
        if (controladaPorUsuario) {  
            this.direccion = direccion;  
        }  
    }  

    public Nodo getCola() {  
        return getColaRecursivo(cabeza);  
    }  

    private Nodo getColaRecursivo(Nodo nodo) {  
        if (nodo.siguienteNodo == null) {  
            return nodo;  
        }  
        return getColaRecursivo(nodo.siguienteNodo);  
    }  

    public void agregarNodo() {  
        Nodo cola = getCola();  
        cola.siguienteNodo = new Nodo(cola.x, cola.y); // Crear nuevo nodo al final  
    }  

    public void run() {  
        while (true) {  
            mover();  
            try {  
                Thread.sleep(100); // Controlar la velocidad del movimiento  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
    }  

    private void mover() {  
        int nuevoX = cabeza.x;  
        int nuevoY = cabeza.y;  
        
        // Actualiza las coordenadas según la dirección  
        switch (direccion) {  
            case "arriba": nuevoY -= 100; break;  
            case "abajo": nuevoY += 100; break;  
            case "izquierda": nuevoX -= 100; break;  
            case "derecha": nuevoX += 100; break;  
        }  
        
        cabeza.mover(nuevoX, nuevoY);  
    }  
}  