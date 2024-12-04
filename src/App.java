import Materia.Stack.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        System.out.println("Estructuras Lineales");
        runStack();
    }

    public static void runStack(){
        
        // Instanciar la clase
        
        Stack stack = new Stack();

        // Agregar elementos a la pila

        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        // MOSTRAR VALORES

        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("Retirar -> " + stack.pop()  + "---- Se retira de la Cima");
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("Retirar -> " + stack.pop()  + "---- Se retira de la Cima");
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("Retirar -> " + stack.pop()  + "---- Se retira de la Cima");
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");

    }
}
