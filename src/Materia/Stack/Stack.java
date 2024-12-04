package Materia.Stack;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stack {

    private Node top; // Nodo en la cima de nuestra pila
    private int size; // Tamaño de la pila

    // Creamos la pila con la cima nula o vacia
    
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }
    
    // METODO QUE RETIRA EL NODO DE LA CIMA

    public int pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--; 
        return value;   
    }

    // Metodo que nos dice el valor del nodo de la cima

    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();            
        }
        return top.getValue();
    }

    // Metodo que pregunta si esta en nulo

    public boolean isEmpty(){
        return top == null;
    }

    // Metodo 

    public void printStack(){
        Node aux = top;
        while (aux != null) {
            System.out.print(aux.getValue());
            aux = aux.getNext();
        }
    }

    // Metodo que retorna el tamaño de la pila
    // Complejidad O(1)

    public int getSize(){
        return size;
    }
}

