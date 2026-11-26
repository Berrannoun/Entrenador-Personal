public class Rutina {
    private String nombre;
    private String[] ejercicios;
    private String[] estiramientos;
    private int maxEjercicios;
    private int maxEstiramientos;
    private int numEjercicios;
    private int numEstiramientos;


    public Rutina(String nombre, int maxEjercicios, int maxEstiramientos) {
        this.nombre = nombre;
        this.maxEjercicios = maxEjercicios;
        this.maxEstiramientos = maxEstiramientos;

        ejercicios = new String[maxEjercicios];
        estiramientos = new String[maxEstiramientos];

        numEjercicios = 0;
        numEstiramientos = 0;
    }

    public String getNombre() {
     return nombre;
    }

    public String[] getEjercicios() {
        String[] copia = new String[numEjercicios];

        for (int i = 0; i < numEjercicios; i++) {
            copia[i] = ejercicios[i];
        }

        return copia;
    }

    public String[] getEstiramientos() {
        String[] copia = new String[numEstiramientos];

        for (int i = 0; i < numEstiramientos; i++) {
            copia[i] = estiramientos[i];
        }

        return copia;
    }

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


    public boolean ejerciciosCompletos() {
        return numEjercicios == maxEjercicios;}

    public boolean estiramientosCompletos() {
        return numEstiramientos == maxEstiramientos;}

    public int numEjercicios() {
        return numEjercicios;
    }

    public int numEstiramientos() {
       return numEstiramientos;
    }

    @Override
    public String toString() {
        String resultado = "Rutina: " + nombre + "\n";
        resultado += "Ejercicios:\n";

        for (int i = 0; i < numEjercicios; i++) {
            resultado += "- " + ejercicios[i] + "\n";
        }

        resultado += "Estiramientos:\n";

        for (int i = 0; i < numEstiramientos; i++) {
            resultado += (i + 1) + ". " + estiramientos[i] + "\n";
        }

        return resultado;
    }

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

    public int getMaxEjercicios() {
        return maxEjercicios;
    }

    public int getMaxEstiramientos() {
        return maxEstiramientos;
    }
}
