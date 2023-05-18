
public class Gato implements Animal {
    private String nombre;

    public Gato(String nombre) {
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
        System.out.println(getNombre() + " hace: " + SONIDO_GATO);
    }

    @Override
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo...");
    }

    @Override
    public void moverCola() {
        System.out.println(getNombre() + " está moviendo la cola.");
    }

    @Override
    public void realizarActividad(String actividad) {
        //System.out.println(getNombre() + actividad + ".");
    }
}