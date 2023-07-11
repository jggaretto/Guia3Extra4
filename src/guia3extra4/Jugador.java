
package guia3extra4;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public void disparo(RevolverDeAgua r) {
        r.siguienteChorro();
        if (r.mojar()) {
            System.out.println(this.nombre + " se ha mojado!");
            this.mojado = true;
        } else {
            System.out.println(this.nombre + " ha escapado del agua.");
        }
    }

    public boolean estaMojado() {
        return this.mojado;
    }
       @Override
    public String toString() {
        return this.nombre;
    }
    }