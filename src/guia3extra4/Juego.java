
package guia3extra4;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private RevolverDeAgua revolver;

    public void llenarJuego(Jugador jugador1, Jugador jugador2, RevolverDeAgua r) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.revolver = r;
    }

    public void ronda() {
        Jugador jugadorActual = this.jugador1;
        while (!jugadorActual.estaMojado()) {
            jugadorActual.disparo(this.revolver);
            if (!jugadorActual.estaMojado()) {
                jugadorActual = (jugadorActual == this.jugador1) ? this.jugador2 : this.jugador1;
            }
        }
    }
}

