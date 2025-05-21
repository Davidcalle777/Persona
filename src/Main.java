import java.util.Scanner;

public class Main {

    // Método que captura 5 personas y retorna solo nombre y género
    public static void capturarNombreYGenero() {
        Scanner scanner = new Scanner(System.in);

        // Arreglo para guardar 5 objetos Persona
        Persona[] personas = new Persona[5];

        System.out.println("== Ingreso de datos de 5 personas ==");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nPersona " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Género: ");
            String genero = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            // Crear persona y agregar al arreglo
            personas[i] = new Persona(nombre, apellido, genero, edad);
        }

        // Mostrar solo nombre y género de las 5 personas
        System.out.println("\n== Nombres y Géneros de las personas ingresadas ==");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + " | Género: " + persona.getGenero());
        }

        scanner.close();
    }

    // Método principal
    public static void main(String[] args) {
        capturarNombreYGenero();
    }
}
