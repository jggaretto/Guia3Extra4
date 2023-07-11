/*
En un nuevo proyecto, nos piden modelar e implementar lo siguiente:
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de un
número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua, se dispara
y se moja. Las clases a hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición del
tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del tambor donde
se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben
ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor.
• toString(): muestra información del revolver (posición actual y donde está el agua)

Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador),
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está
mojado o no el jugador).

Métodos:

disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() y
siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua,
el jugador se moja; por lo tanto el atributo mojado pasa a true, sino false.

Clase Juego: esta clase posee los siguientes atributos: 2 Jugadores y Revolver

Métodos:
• llenarJuego(Jugador jugador1,Jugador jugador2, Revolver r): este método recibe los 2 jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el
gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al
siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se
debe mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto, usando los
atributos de la clase Juego.
 */
package guia3extra4;


public class Guia3Extra4 {

   
    public static void main(String[] args) {
        // Crear objetos de las clases RevolverDeAgua y Jugador
       /* RevolverDeAgua revolver = new RevolverDeAgua();
        Jugador jugador1 = new Jugador(1);
        Jugador jugador2 = new Jugador(2);
        // Llenar el juego con los objetos creados
        Juego juego = new Juego();
        juego.llenarJuego(jugador1, jugador2, revolver);

        // Iniciar la ronda del juego
        juego.ronda();

        // Imprimir el resultado del juego
        if (jugador1.estaMojado()) {
            System.out.println("El jugador 2 ha ganado!");
        } else {
            System.out.println("El jugador 1 ha ganado!");
    }
*/
        Jugador jugador1 = new Jugador(1);
        Jugador jugador2 = new Jugador(2);
        RevolverDeAgua revolver = new RevolverDeAgua();
        // Llenar el revolver y mostrar su posición
            revolver.llenarRevolver();
            System.out.println(revolver);

            // Comenzar el juego hasta que uno de los jugadores se moje
            Jugador jugadorActual = jugador1;
            while (!jugadorActual.estaMojado()) {
                jugadorActual.disparo(revolver);
                System.out.println(jugadorActual.toString() + " dispara el revolver.");
                System.out.println(revolver);
                jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
            }

            // Mostrar el resultado del juego
            Jugador ganador = (jugadorActual == jugador1) ? jugador2 : jugador1;
            System.out.println(ganador + " ha ganado el juego!");
}
    }

    
    

