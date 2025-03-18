import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();

        listaTareas.add(new Tarea("Tender la ropa", "Pedro", 1, "Casa"));
        listaTareas.add(new Tarea("Estudiar programación", "Pedro", 2, "Biblioteca"));
        System.out.println("Lista de tareas: ");
        System.out.println(listaTareas);

        System.out.println("Marcar tarea Tender la ropa como completada");
        completarTarea("Tender la ropa", listaTareas);
        System.out.println("\n"+listaTareas);

        System.out.println("Eliminar la tarea Tender la ropa:\n");

        eliminarTarea("Tender la ropa", listaTareas);

        System.out.println(listaTareas);
    }

    public static void eliminarTarea(String nombre, ArrayList<Tarea> listaTareas) {

        for (int i = 0; i < listaTareas.size(); i++) {
            if (nombre.equals(listaTareas.get(i).getNombre())) {
                listaTareas.remove(i);
            }
        }
    }

    public static void completarTarea(String nombre, ArrayList<Tarea> tarea) {

        for (int i = 0; i < tarea.size(); i++) {

            if (nombre.equals(tarea.get(i).getNombre())) {
                if (tarea.get(i).isTerminada()) {
                    System.out.println("La tarea ya se encuentra terminada");
                }
                else {
                    tarea.get(i).setTerminada(true);
                }
            }
        }
    }
}