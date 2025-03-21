import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Tarea> tareas = new ArrayList<>();

        tareas.add(new Tarea("Estudiar programación", "Pedro", 1, "Casa"));
        tareas.add(new Tarea("Tender la ropa", "Pedro", 1, "Casa"));
        tareas.add(new Tarea("Ir a clase", "Jorge", 1, "Instituto"));

        System.out.println("Lista de tareas: ");
        mostrarTareas(tareas);

        System.out.println("Buscar tarea con responsable Jorge: ");
        ArrayList<Tarea> tareasResponsable = buscarTarea("Jorge", tareas);

        for (int i = 0; i < tareasResponsable.size(); i++) {

            System.out.println(tareasResponsable.get(i).toString());
        }

        System.out.println("Marcar tarea como completada");

        completarTarea("Ir a clase", tareas);
        mostrarTareas(tareas);
        completarTarea("Ir a clase", tareas);

        System.out.println("Eliminar tareas: ");
        eliminarTarea("Ir a clase", tareas);
        mostrarTareas(tareas);
    }

    public static void eliminarTarea(String nombre, ArrayList<Tarea> lista) {

        for (int i = 0; i < lista.size(); i++) {

            if (nombre.equals(lista.get(i).getNombre())) {

                lista.remove(i);
                break;
            }
        }

    }

    public static void mostrarTareas(ArrayList<Tarea> lista){

        System.out.println("---- Lista de tareas ----");
        for (Tarea tarea : lista) {
            System.out.println("-" + tarea.toString());
        }
    }

    public static ArrayList<Tarea> buscarTarea(String responsable, ArrayList<Tarea> lista) {
        ArrayList<Tarea> tareasRespon = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {

            if (responsable.equals(lista.get(i).getResponsable())) {

                tareasRespon.add(lista.get(i));
            }
        }

        return tareasRespon;
    }

    public static void completarTarea(String nombre, ArrayList<Tarea> lista) {

        for (int i = 0; i < lista.size() ; i++) {

            if (nombre.equals(lista.get(i).getNombre())) {

                if (!lista.get(i).isTerminado()) {

                    lista.get(i).setTerminado(true);
                } else {

                    System.out.println("La tarea ya está completada");

                }
            }
        }
    }
}