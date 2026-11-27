/**
 * Una rutina de entrenamiento: tiene un nombre, unos ejercicios y unos estiramientos.
 * Cuántos caben de cada cosa se decide al crearla.
 */
    public class Rutina {
        private String nombre;
        private String[] ejercicios;
        private String[] estiramientos;
        private int maxEjercicios;
        private int maxEstiramientos;
        private int numEjercicios;
        private int numEstiramientos;
/**
 * Crea una rutina vacía: guarda el nombre y prepara los arrays con el tamaño máximo de cada lista.
 */

        public Rutina(String nombre, int maxEjercicios, int maxEstiramientos) {
            this.nombre = nombre;
            this.maxEjercicios = maxEjercicios;
            this.maxEstiramientos = maxEstiramientos;
            // Los arrays se crean aquí; si no, los demás métodos darían NullPointerException
            ejercicios = new String[maxEjercicios];
            estiramientos = new String[maxEstiramientos];

            numEjercicios = 0;
            numEstiramientos = 0;
        }
//Devuelve el nombre de la rutina.
        public String getNombre() {
         return nombre;
        }
/**
 * Devuelve una copia de los ejercicios que hay ahora mismo, sin huecos vacíos al final.
 * Así, si alguien cambia la copia, la rutina no se toca.
 */
        public String[] getEjercicios() {
            String[] copia = new String[numEjercicios];

            for (int i = 0; i < numEjercicios; i++) {
                copia[i] = ejercicios[i];
            }

            return copia;
        }
   // Lo mismo que getEjercicios, pero con los estiramientos.
        public String[] getEstiramientos() {
            String[] copia = new String[numEstiramientos];

            for (int i = 0; i < numEstiramientos; i++) {
                copia[i] = estiramientos[i];
            }

            return copia;
        }
//Añade un ejercicio al final si todavía cabe. Si ya está lleno, avisa por pantalla y no lo añade.
        public boolean agregarEjercicio(String ejercicio) {
           int posicion=0;
            if (numEjercicios<maxEjercicios){
                posicion=numEjercicios++;
                ejercicios[posicion]=ejercicio;
                return true;
            }
            else {System.out.println("No se pueden añadir más ejercicios.");
            return false;}
        }
//Añade un estiramiento al final si todavía cabe. Si ya está lleno, avisa por pantalla y no lo añade.
        public boolean agregarEstiramiento(String estiramiento) {
            int posicion=0;
            if (numEstiramientos<maxEstiramientos){
                posicion=numEstiramientos++;
                estiramientos[posicion]=estiramiento;
                return true;
            }
            else {System.out.println("No se pueden añadir más estiramientos.");
                return false;}
        }
//Dice si ya no caben más ejercicios. Con máximo 0 está lleno desde el principio.


        public boolean ejerciciosCompletos() {
            return numEjercicios == maxEjercicios;}
//Dice si ya no caben más estiramientos. Con máximo 0 está lleno desde el principio.
        public boolean estiramientosCompletos() {
            return numEstiramientos == maxEstiramientos;}
//Dice cuántos ejercicios hay ahora mismo en la rutina.
        public int numEjercicios() {
            return numEjercicios;
        }
//Dice cuántos estiramientos hay ahora mismo en la rutina.
        public int numEstiramientos() {
           return numEstiramientos;
        }
/**
 * Prepara la rutina para enseñarla por pantalla: el nombre, los ejercicios con guion
 * y los estiramientos numerados desde 1. Cada línea acaba en salto de línea.
 */
        @Override
        public String toString() {
            String resultado = "Rutina: " + nombre + "\n";
            resultado += "Ejercicios:\n";
            // Solo hasta el contador, no hasta length, para que no salga "- null"
            for (int i = 0; i < numEjercicios; i++) {
                resultado += "- " + ejercicios[i] + "\n";
            }

            resultado += "Estiramientos:\n";

            for (int i = 0; i < numEstiramientos; i++) {
                resultado += (i + 1) + ". " + estiramientos[i] + "\n";
            }

            return resultado;
        }
/**
 * Prepara la rutina para guardarla en un fichero: una cosa por línea,
 * con ESTIRAMIENTOS en medio y ===== al final.
 */
        public String toRawString() {
            String resultado = nombre + "\n";

            for (int i = 0; i < numEjercicios; i++) {
                resultado += ejercicios[i] + "\n";
            }

            resultado += "ESTIRAMIENTOS\n";

            for (int i = 0; i < numEstiramientos; i++) {
                resultado += estiramientos[i] + "\n";
            }

            resultado += "=====\n";

            return resultado;
        }
//Devuelve cuántos ejercicios caben como mucho en la rutina.
        public int getMaxEjercicios() {
            return maxEjercicios;
        }
   // Devuelve cuántos estiramientos caben como mucho en la rutina
        public int getMaxEstiramientos() {
            return maxEstiramientos;
        }
    }
