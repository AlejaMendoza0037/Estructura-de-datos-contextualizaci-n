
package com.mycompany.contextualizacion;
import java.util.EmptyStackException;


public class Pila {  


    public int[] elementos;
    public int tamano;
    public int capacidad;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new int[capacidad];
        this.tamano = 0;
    }

    public boolean esta_Vacia() {
        return tamano == 0;
    }

    public boolean esta_Llena() {
        return tamano == capacidad;
    }

    public int elementoTope() {
        if (esta_Vacia()) {
            throw new EmptyStackException();// esta exeption indica que la pila no tiene elementos 
        }
        return elementos[tamano - 1];
    }

    public void insertarElemento(int elemento) {// agrego un elemento en la parte superior de la pila 
        if (esta_Llena()) {
            System.out.println("Ojo : La pila está llena, --->> no se puede agregar más elementos.");
            return;
        }
        elementos[tamano] = elemento;
        tamano++;
    }

    public int extraer() {//eliminamos y devolvemos el elemento en la parte superior de la pila 
        if (esta_Vacia()) {
            throw new EmptyStackException();
        }
        tamano--;
        return elementos[tamano];
    }

    public int buscar(int elemento) {
        for (int i = tamano - 1; i >= 0; i--) {
            if (elementos[i] == elemento) {
                return tamano - i;
            }
        }
        return -1; // Si el elemento no se encuentra en la pila
    }

    public void insertar(int elemento) {
        insertarElemento(elemento);
    }

    public void actualizar(int posicion, int nuevoElemento) {
        if (posicion < 1 || posicion > tamano) {
            System.out.println("La Posición es  inválida, por favor rectificar .");
            return;
        }
        elementos[tamano - posicion] = nuevoElemento;
    }

    public void eliminar(int posicion) {
        if (posicion < 1 || posicion > tamano) {
            System.out.println("La Posición es  inválida, por favor rectifica.");
            return;
        }
        for (int i = tamano - posicion; i < tamano - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamano--;
    }

    public void imprimir() {
        if (esta_Vacia()) {
            System.out.println("La pila está vacía por favor rectificar .");
            return;
        }
        System.out.println("El Contenido de la pila es el siguente:");
        for (int i = tamano - 1; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }

    public static void main(String[] args) {
        Pila pila = new Pila(5);

        // Agregar elementos a la pila
        pila.insertarElemento(10);
        pila.insertarElemento(20);
        pila.insertarElemento(30);
        pila.insertarElemento(40);

        // Imprimir la pila
        pila.imprimir();
    }
}
