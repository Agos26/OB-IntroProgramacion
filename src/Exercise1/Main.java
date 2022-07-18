package Exercise1;

public class Main {

    public static int Suma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = Suma(10, 40);
        System.out.println(resultado);
        Coche miCoche = new Coche();
        miCoche.sumarPuertas(3);
        miCoche.sumarPuertas(4);
        System.out.println(miCoche.puertas);

    }
}
