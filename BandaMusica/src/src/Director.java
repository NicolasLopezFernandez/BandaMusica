package src;

public class Director extends src.Participante {
    public Director(String nombre) {
        super(nombre, "src.Director");
    }
    @Override
    public String toString() {
        return "src.Director: " + nombre;
    }
}
