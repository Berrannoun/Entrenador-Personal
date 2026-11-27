import java.util.Scanner;

/**
 * Clase con métodos de utilidad para la entrada de datos por teclado y el manejo de días de la semana.
 */
public class Utilidades {
/**
 * Enseña el mensaje sin saltar de línea y devuelve lo que escribe el usuario, tal cual.
 */
    public static String leerCadena(Scanner teclado, String s) {
        /**
         * Pide un número hasta que el usuario escriba uno entero que esté entre el mínimo y el máximo.
         * Si se equivoca no sale ningún error: solo se vuelve a enseñar el mensaje.
         */
        System.out.print(s);
        return teclado.nextLine();
    }

    public static int leerNumero(Scanner teclado, String mensaje, int minimo, int maximo) {
        // Repetimos hasta que llegue un número bueno: el return es lo que nos saca del bucle
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
    /**
     * Pide la letra de un día (L, M, X, J, V, S o D) hasta que el usuario escriba una válida
     * y devuelve en qué posición de la semana está ese día.
     */
    public static int leerDiaDeLaSemana(Scanner teclado, String mensaje) {
        int posicion;
// do-while: preguntamos al menos una vez y repetimos mientras la letra no sea un día
        do {
            System.out.print(mensaje);

            String dia = teclado.nextLine();

            posicion = diaSemanaAPosicion(dia);

        } while (posicion == -1);

        return posicion;
    }
/**
 * Pasa la letra de un día a su posición en la semana: L es 0, M es 1... y D es 6.
 * Vale en mayúscula o en minúscula. Si no es un día, devuelve -1.
 */
    public static int diaSemanaAPosicion(String dia) {
        if (dia == null) {
            return -1;
        }
        // Lo pasamos a mayúscula para que "l" y "L" valgan lo mismo
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
/**
 * Pasa una posición (de 0 a 6) al nombre del día. Si la posición no existe, devuelve "Desconocido".
 */

    public static String posicionADiaSemana(int pos) {
    String[]dia={"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
    if (pos >= 0 && pos < dia.length){
        return dia[pos];}
    return "Desconocido";
    }
}
