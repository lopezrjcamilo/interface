
public class Vaca implements Animal {
    private String nombre;

    public Vaca(String nombre) {
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
        System.out.println(getNombre() + " hace: " + SONIDO_VACA);
    }

    @Override
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo...");
    }

    @Override
    public void moverCola() {
        System.out.println(getNombre() + " no puede mover la cola.");
    }

    public void comerHierba() {
        System.out.println(getNombre() + " está comiendo hierba.");
    }
}