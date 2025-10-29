package org.demo1;// SquirtleNadador.java — DESAFÍO BONUS del Tema 5
// ------------------------------------------------------------
// En esta parte opcional, añadimos un tercer Pokémon: Squirtle.
// También implementa Runnable, demostrando que podemos ejecutar
// varias tareas en paralelo usando diferentes hilos.

public class SquirtleNadador implements Runnable {
    private final String nombre;

    // Constructor
    public SquirtleNadador(String nombre) {
        this.nombre = nombre;
    }

    // Tarea que realiza Squirtle
    @Override
    public void run() {
        System.out.println(nombre + " se lanza a la piscina...");
        try {
            Thread.sleep(1500); // simula el tiempo de entrenamiento acuático
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(nombre + " fue interrumpido durante el entrenamiento acuático.");
            return;
        }
        System.out.println(nombre + " ha terminado su entrenamiento acuático!");
    }
}
