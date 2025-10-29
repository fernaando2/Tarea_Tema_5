🟡 1️⃣ ¿Cuál es la diferencia en cómo iniciamos PikachuCorredor vs CharizardVolador?

Respuesta:
La diferencia es que PikachuCorredor, al heredar de Thread, se inicia directamente con el método start(), ya que él mismo es un hilo.
En cambio, CharizardVolador, que implementa Runnable, necesita ser pasado a un objeto Thread para poder iniciarse.

🔥 2️⃣ Si PikachuCorredor quisiera heredar también de Pokemon, ¿sería posible? ¿Por qué?

Respuesta:
No sería posible, porque Java no permite herencia múltiple de clases.
Como PikachuCorredor ya hereda de Thread, no podría heredar también de Pokemon.

💧 3️⃣ ¿Y CharizardVolador podría heredar de Pokemon además de implementar Runnable?

Respuesta:
Sí, CharizardVolador sí podría heredar de Pokemon, porque implementar una interfaz como Runnable no impide heredar de una clase base.
De esta forma, puede ser un Pokémon y, al mismo tiempo, ejecutar su tarea en un hilo.
