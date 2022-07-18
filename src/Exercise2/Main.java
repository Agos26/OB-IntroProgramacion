package Exercise2;

public class Main {

    public static void main(String[] args) {
        var numero = 3;

        if (numero > 1) {

            System.out.println("Positivo");

        } else if (numero < 1) {
            System.out.println("Negativo");
        } else if (numero == 0) {
            System.out.println("0");
        }
        var numeroWhile = -1;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;

        }
        var num = 2;

        do {

            System.out.println(num);
            num = num + 1;

        } while (num < 3);

        var numFor = 0;
        for (numFor = 0; numFor <= 3; numFor = numFor + 1) {
            System.out.println(numFor);
        }
        var estacion = "s";
        switch (estacion) {
            case "Verano":
                System.out.println(estacion);
                break;
            case "Primavera":
                System.out.println(estacion);
                break;
            case "Invierno":
                System.out.println(estacion);
                break;
            case "Otoño":
                System.out.println(estacion);
                break;
            default:
                System.out.println("No es una estacion");

        }

    }

}
