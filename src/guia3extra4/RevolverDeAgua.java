
package guia3extra4;

//import java.util.Random;

public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
  //      Random r = new Random();
       // this.posicionActual = r.nextInt(6);
       // this.posicionAgua = r.nextInt(6);
       this.posicionActual = (int) (Math.random()* 6);
       this.posicionAgua = (int) (Math.random()* 6);
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }

    public void siguienteChorro() {
        this.posicionActual = (this.posicionActual + 1) % 6;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Posición actual: " + this.posicionActual + ", Posición del agua: " + this.posicionAgua;
    }
}