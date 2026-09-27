import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RegistroParticipantes  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String>estudiantes = new TreeSet<>();
        System.out.println("=== Sistemas de registro de participantes ===");

        String [] identificadores ={"A0032", "A0015", "A0081", "A0032", "A0021",
                "A0015", "A0105", "A0007", "A0081", "A0044"};
        for (String id : identificadores) {
            estudiantes.add(id);}

            boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Mostrar número de estudiantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch(opcion){
                case "1":
                    System.out.print("Ingrese el identificador del estudiante: ");
                    String nuevoId = scanner.nextLine().trim();

                    boolean agregado = estudiantes.add(nuevoId);
                    if (agregado) {
                        System.out.println("Estudiante " + nuevoId + " registrado con éxito.");
                    } else {
                        System.out.println("El estudiante " + nuevoId + " ya se encuentra registrado.");
                    }
                    break;

                case "2":
                    System.out.print("Ingrese el identificador a buscar: ");
                    String idBuscar = scanner.nextLine().trim();
                    if (estudiantes.contains(idBuscar)) {
                        System.out.println("El estudiante " + idBuscar + " ESTÁ en el sistema.");
                    } else {
                        System.out.println("El estudiante " + idBuscar + " NO se encuentra en el sistema.");
                    }
                    break;

                case "3":
                    System.out.print("Ingrese el identificador a eliminar: ");
                    String idEliminar = scanner.nextLine().trim();
                    if (estudiantes.remove(idEliminar)) {
                        System.out.println("Estudiante " + idEliminar + " eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró al estudiante " + idEliminar + ".");
                    }
                    break;

                case "4":
                    System.out.println("\n--- Lista de Estudiantes ---");
                    if (estudiantes.isEmpty()) {
                        System.out.println("(No hay estudiantes registrados)");
                    } else {
                        for (String est : estudiantes) {
                            System.out.println("- " + est);
                        }
                    }
                    break;

                case "5":
                    System.out.println("Total de estudiantes registrados: " + estudiantes.size());
                    break;


                case "6":
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}
