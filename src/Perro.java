
public class Perro implements Animal {
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: " + SONIDO_PERRO);
    }


    @Override
    public void dormir() {
        System.out.println(getNombre() + " duerme toda la noche.");
    }

/*
    @Override
    public void moverCola() {
        System.out.println(getNombre() + " está moviendo la cola.");
    }

 */

    //

    public void moverCola() {
        System.out.println(getNombre() + " está moviendo la cola.");
    }

    /*
    @Override
    public void realizarActividad(String actividad) {
        System.out.println(getNombre() + " está " + actividad + ".");
    }
     */
}