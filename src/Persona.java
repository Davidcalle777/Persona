public class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    // Getters necesarios para que el código funcione
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    // Método opcional para mostrar todos los datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Género: " + genero);
        System.out.println("Edad: " + edad);
    }
}
