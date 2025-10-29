package org.demo1;

/**
 * GimnasioMultihilo.java
 * Este es el "gimnasio" donde probamos ambos métodos.
 */
public class GimnasioMultihilo {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("--- MÉTODO 1: Herencia (extends Thread) ---");
        
        // TODO 3: Crea un PikachuCorredor "Pika-Runner".
        PikachuCorredor pikachu = new PikachuCorredor("Pikachu");
        System.out.println("Entrenador: ¡Pikachu, te elijo para la carrera!");
        pikachu.start();

        // TODO 4: ¡Inicia a Pikachu!
        // Como Pikachu "ES UN" Thread, él mismo tiene el método .start()
        System.out.println("Entrenador: ¡Pika-Runner, empieza!");
        // pikaCorredor.???(); // <-- Completa esta línea


        System.out.println("\n--- MÉTODO 2: Interfaz (implements Runnable) ---");

        // TODO 5: Crea la "tarea" de Charizard: "Charly-Volador"
        // charlyMision "NO ES UN" Thread. Es solo una TAREA (Runnable).
        CharizardVolador charlyMision = new CharizardVolador("Charizard");
        Thread entrenadorQueDirigeACharizard = new Thread(charlyMision, "Vuelo-Charizard");
        System.out.println("Entrenador: ¡Charizard, te elijo para esta misión!");
        entrenadorQueDirigeACharizard.start();
        SquirtleNadador squirtle = new SquirtleNadador("Squirtle");
        Thread entrenadorDeSquirtle = new Thread(squirtle, "Entrenamiento-Acuático");
        System.out.println("Entrenador: ¡Squirtle, demuestra tu poder acuático!");
        entrenadorDeSquirtle.start();

        // TODO 6: ¡Necesitamos un "Thread" (un trabajador) para que ejecute la tarea!
        // Crea un nuevo Thread y pásale la misión de Charizard (charlyMision)
        // en su constructor.
        // Thread entrenadorQueDirigeACharizard = new ???(???); // <-- Completa esta línea
        pikachu.join();
        entrenadorQueDirigeACharizard.join();
        entrenadorDeSquirtle.join();
        // TODO 7: ¡Inicia el Thread "trabajador"!
        // Llama al método .start() del "entrenador" (el Thread que acabas de crear).
        System.out.println("Entrenador: ¡Charizard, te elijo para esta misión!");
        // entrenadorQueDirigeACharizard.???(); // <-- Completa esta línea
        

        System.out.println("\n--- El entrenador espera a que terminen (El main sigue) ---");
    }
}