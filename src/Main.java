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
        return personas;
    }

    // Método que calcula el promedio de edad
    public static double calcularEdadPromedio(Persona[] personas) {
        int sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        return (double) sumaEdades / personas.length;
    }

    // Método que cuenta cuántas personas tienen género Masculino
    public static int contarMasculinos(Persona[] personas) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("M")) {
                contador++;
            }
        }
        return contador;
    }

    // Método principal
    public static void main(String[] args) {
        Persona[] personas = capturarNombreYGenero();

        double promedio = calcularEdadPromedio(personas);
        System.out.println("\nPromedio de edad: " + promedio);

        int cantidadMasculinos = contarMasculinos(personas);
        System.out.println("Cantidad de personas con género Masculino: " + cantidadMasculinos);

        // Calcular y mostrar la cantidad de personas de género Femeninos
        int cantidadFemeninos = contarFemeninos(personas);
        System.out.println("Cantidad de personas con género Femenino: " + cantidadFemeninos);
    }

    private static int contarFemeninos(Persona[] personas) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("F")) {
                contador++;
            }
        }
        return contador;
    }
}
