/**
 * @author Esteban Barrera
 */
public class Furro {
    String Nombre;
    int Edad;
    static String especie = "Lobo";

    public Furro(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Furro.especie = especie;
    }

    @Override
    public String toString() {
        return "Furros{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }


}
