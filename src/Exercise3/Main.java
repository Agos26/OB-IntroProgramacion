package Exercise3;

public class Main {

    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setNombre("Agostina");
        miPersona.setEdad(25);
        miPersona.setTelefono(26165432);
        String name = miPersona.getNombre();
        int old = miPersona.getEdad();
        int telf = miPersona.getTelefono();

        System.out.println(name);
        System.out.println(old);
        System.out.println(telf);

    }

}
