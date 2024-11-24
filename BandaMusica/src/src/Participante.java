package src;

public abstract class Participante {
    protected String nombre;
    protected String instrumento;

    public Participante(String nombre, String instrumento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }
    @Override
    public abstract String toString();
}

