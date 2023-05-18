
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
        System.out.println(getNombre() + " está durmiendo profundamente...  haciendo el ruido "+ SONIDO_VACA );
    }

    @Override
    public void moverCola() {
        System.out.println("No puede mover la cola.");
    }

    public void comerHierba() {
        System.out.println(getNombre() + " está comiendo hierba.");
    }

    /*
    @Override
    public void realizarActividad(String actividad) {
        Animal.super.realizarActividad(actividad);
    }
     */

    @Override
    public void realizarActividad(String actividad) {
        Animal.super.realizarActividad(actividad);
        // Otras instrucciones adicionales en la implementación de Vaca
        Animal.super.realizarActividad(actividad);
        System.out.println(getNombre() + " está " + actividad + ".");
    }
}