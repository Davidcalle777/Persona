import java.util.Scanner;

public class Main {

    // Método que captura 5 personas y retorna el arreglo
    public static Persona[] capturarNombreYGenero() {
        Scanner scanner = new Scanner(System.in);

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

            personas[i] = new Persona(nombre, apellido, genero, edad);
        }

        System.out.println("\n== Nombres y Géneros de las personas ingresadas ==");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + " | Género: " + persona.getGenero());
        }

        scanner.close();

        return personas; // ahora retorna el arreglo
    }

    // Método que calcula el promedio de edad
    public static double calcularEdadPromedio(Persona[] personas) {
        int sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        return (double) sumaEdades / personas.length;
    }

    // Método principal
    public static void main(String[] args) {
        Persona[] personas = capturarNombreYGenero(); // recibe las personas

        double promedio = calcularEdadPromedio(personas); // calcula promedio

        System.out.println("\nPromedio de edad: " + promedio); // muestra resultado
    }
}
