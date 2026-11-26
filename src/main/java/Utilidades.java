import java.util.Scanner;

/**
 * Clase con métodos de utilidad para la entrada de datos por teclado y el manejo de días de la semana.
 */
public class Utilidades {
    public static String leerCadena(Scanner teclado, String s) {
        System.out.print(s);
        return teclado.nextLine();
    }

    public static int leerNumero(Scanner teclado, String mensaje, int minimo, int maximo) {
        int numero;

        while (true) {
            System.out.print(mensaje);

            String entrada = teclado.nextLine();

            try {
                numero = Integer.parseInt(entrada);

                if (numero >= minimo && numero <= maximo) {
                    return numero;
                }

            } catch (NumberFormatException e) {
                // La entrada no es un número entero válido.
            }

        }
    }

    public static int leerDiaDeLaSemana(Scanner teclado, String mensaje) {
        int posicion;

        do {
            System.out.print(mensaje);

            String dia = teclado.nextLine();

            posicion = diaSemanaAPosicion(dia);

        } while (posicion == -1);

        return posicion;
    }

    public static int diaSemanaAPosicion(String dia) {
        if (dia == null) {
            return -1;
        }

        switch (dia.toUpperCase()) {
            case "L":
                return 0;
            case "M":
                return 1;
            case "X":
                return 2;
            case "J":
                return 3;
            case "V":
                return 4;
            case "S":
                return 5;
            case "D":
                return 6;
            default:
                return -1;
        }
    }


    public static String posicionADiaSemana(int pos) {
    String[]dia={"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
    if (pos >= 0 && pos < dia.length){
        return dia[pos];}
    return "Desconocido";
    }
}
