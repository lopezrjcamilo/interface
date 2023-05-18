public interface Animal {
    String SONIDO_PERRO = "¡Guau guau!";
    String SONIDO_GATO = "¡Miau miau!";
    String SONIDO_VACA = "¡Muu muu!";

    void hacerSonido();
    void dormir();
    void moverCola();

    default void realizarActividad(String actividad) {
        System.out.println("Realizando la actividad: " + actividad);
    }

    static void mostrarInformacion(String act) {
        System.out.println("Esta es la interfaz Animal" + act);
    }


}
