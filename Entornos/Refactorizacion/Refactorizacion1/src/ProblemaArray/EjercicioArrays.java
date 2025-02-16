package ProblemaArray;
import java.util.Arrays;
import java.util.List;

public class EjercicioArrays {

    public static void main(String[] args) {
        int numAlumnos = 40;
        //vector con las notas generadas
        Integer[] control = new Integer[numAlumnos];
        int[] listaClase;
        int[] aprobados = new int[numAlumnos];
        int[] suspensos = new int[numAlumnos];
        int countAprobados = 0;
        int countSuspensos = 0;

        //Genera notas random entre 1 y 10
        for(int i=0; i < control.length; i++){
            control[i] = (int)(Math.random()*11);
        }

        //buscamos al mayor
        int minNota= buscarMenor(control);

        //buscamos al menor
        int maxNota = buscarMayor(control);

        //creamos una lista de los alumnos de la clase
        listaClase = new int[numAlumnos];
        for (int i = 0; i < numAlumnos; i++){
            listaClase[i] = i+1;
        }

        //Empezamos el uso de listas para facilitar la tarea de índices.
        List<Integer> notas = Arrays.asList(control);

        //Comprobamos el resultado del ejercicio
        System.out.println("Mínimo es: " + minNota);
        System.out.println("Máximo es: " + maxNota);
        System.out.println("Indice del mínimo es : " + inMinNota(minNota, notas));
        System.out.println("Indice del máximo es : " + inMaxNota(maxNota, notas));
        System.out.println("Lista de clase :" + Arrays.toString(listaClase));
        System.out.println("Array de Notas :" + notas);

        //Creamos los array practicas y calificaciones
        int[] practicas = crearPracticas(numAlumnos);
        float[] calificaciones = crearCalificaciones(numAlumnos,practicas,control);

        System.out.println("Prácticas      :" + Arrays.toString(practicas));

        System.out.println("Calificaciones :" + Arrays.toString(calificaciones));

        //Sacamos la estadística de calificaciones
        //hacemos un array de 10 para la estadística.
        float [] estadistica = new float[10];

        estadistica(estadistica,control,calificaciones,numAlumnos);

        //Aprobados y suspensos


        for (int i=0; i<numAlumnos; i++){
            if (calificaciones[i] < 5){
                aprobados[i] = i;
                countAprobados += 1;
            }else{
                suspensos[i] = i;
                countSuspensos += 1;
            }
        }
        System.out.println("Relación de aprobados por nº de lista: "
                + Arrays.toString(aprobados));
        System.out.println("Relación de suspensos por nº de lista: "
                + Arrays.toString(suspensos));
        //Resumen de aprobados y suspensos

        System.out.println("Resumen  de aprobados por nº de lista: "
                + Arrays.toString(aprobados(countAprobados(numAlumnos,calificaciones,aprobados,countAprobados),aprobados)));
        System.out.println("Resumen  de aprobados por nº de lista: "
                + Arrays.toString(suspensos(countSuspensos(numAlumnos,calificaciones,aprobados,countSuspensos),suspensos)));

        /*6. Suponer un vector de Calificaciones de tamaño 40
        (máximo de alumnos por clase), pero que solo almacena las
        notas de 31 alumnos. Realizar un programa que permita insertar en
        la posición 4 del vector la calificación de un nuevo
        alumno en clase al que supuestamente le corresponde como nota un 6.*/
        double[] calif = notaNueva();

        System.out.println("Nota antigua alumno nº4: " + calif[3]);
        calif[3] = 6;
        System.out.println("Nota nueva   alumno nº4: " + calif[3]);
    }


    public static int buscarMenor(Integer[] control) {
        int postEval = 11;
        int minNota = 0;
        for (int preEval : control) {
            if (preEval < postEval) {
                minNota = preEval;
                postEval = preEval;
            }
        }

        return minNota;

    }

    public static int buscarMayor(Integer[] control) {
       int postEval = 0;
       int maxNota = 0;
        for (int preEval : control) {
            if (preEval > postEval) {
                maxNota = preEval;
                postEval = preEval;
            }
        }

        return maxNota;
    }

    public static int inMinNota(int minNota, List notas) {

        return notas.indexOf(minNota) + 1;
    }

    public static int inMaxNota(int maxNota, List notas) {

        return notas.indexOf(maxNota) + 1;
    }

    public static int[] crearPracticas(int numAlumnos) {

       int[] practicas = new int[numAlumnos];
            for(int i=0; i < practicas.length; i++){
            practicas[i] = (int)(Math.random()*11);
       }
        return practicas;
    }

    public static float[] crearCalificaciones(int numAlumnos, int[] practicas, Integer[] control) {

        float[] calificaciones = new float[numAlumnos];
        for(int i = 0; i<control.length; i++){
            calificaciones[i] =
                    (((float) control[i]
                            + (float) practicas[i])
                            / 2);
        }

        return calificaciones;
    }

    public static void estadistica(float[] estadistica, Integer[] control, float[] calificaciones, int numAlumnos) {

        for (int i=0; i<10; i++){
            float count = 0;
            for (int j=0; j<control.length; j++){
                if ((i < calificaciones[j]) && ((i+1) >= calificaciones[j] )) {
                    count += 1;
                }
            }
            if (count != 0){
                estadistica[i] = ( count / numAlumnos);
            }else{ estadistica[i] = 0;}
            double sol = (Math.round(estadistica[i] * 10000.0)) / 100.0;
            System.out.println("Estadística nota tramo <="
                    + (i+1) + " = "
                    + sol + "%");
        }
    }

    public static int countAprobados(int numAlumnos, float[] calificaciones, int[] aprobados, int countAprobados) {

        for (int i = 0; i < numAlumnos; i++) {
            if (calificaciones[i] < 5) {
                aprobados[i] = i;
                countAprobados += 1;
            }
        }
        return countAprobados;
    }

    public static int[] aprobados(int countAprobados, int[] aprobados) {
        int i = 0;
        int x = 0;
        int[] a = new int[countAprobados];
        while(i < aprobados.length){
            if(aprobados[i] != 0){
                a[x] = aprobados[i];
                i++;
                x++;
            }else{ i++; }
        }

        return a;
    }

    public static int countSuspensos(int numAlumnos, float[] calificaciones, int[] aprobados, int countSuspensos) {

        for (int i = 0; i < numAlumnos; i++) {
            if (calificaciones[i] > 5) {
                aprobados[i] = i;
                countSuspensos += 1;
            }
        }
        return countSuspensos;
    }

    public static int[] suspensos( int countSuspensos, int[] suspensos) {
        int i = 0;
        int x = 0;
        int[] s = new int[countSuspensos];

            while(i < suspensos.length){
            if(suspensos[i] != 0){
                s[x] = suspensos[i];
                i++;
                x++;
            }else{ i++; }
        }
        return s;

    }

    public static double[] notaNueva() {

        double[] calif = new double[40];

        for (int j=0; j<31; j++){
            calif[j] = (int)(Math.random()*11);
        }

        return calif;
    }
}
