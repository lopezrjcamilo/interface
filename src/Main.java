public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro("Toby");
        System.out.println(" IMPLEMENTACION EN LA CLASE PERRO.");
        perro.hacerSonido();
        perro.dormir();
        perro.moverCola();
        perro.realizarActividad("paseando");
        perro.realizarActividad("corriendo");

        System.out.println("\n IMPLEMENTACION EN LA CLASE GATO.");
        Gato gato = new Gato("Luna");
        gato.hacerSonido();
        gato.dormir();
        gato.moverCola();
        gato.realizarActividad("saltando");

        System.out.println("\n IMPLEMENTACION EN LA CLASE VACA.");
        Vaca vaca = new Vaca("Margarita");
        vaca.hacerSonido();
        vaca.dormir();
        vaca.moverCola();
        vaca.comerHierba();
        vaca.realizarActividad("pastando");

        System.out.println("\n IMPLEMENTACION DEL METODO ESTATICO DE LA INTERFACE.");
        Animal.mostrarInformacion();

    }
}