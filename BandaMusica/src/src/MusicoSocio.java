package src;

public class MusicoSocio extends src.Musico{
    private int numeroSocio;

    public MusicoSocio(String nombre, String instrumento, int numeroSocio) {
        super(nombre, instrumento);
        this.numeroSocio = numeroSocio;
    }

    @Override
    public String toString() {
        return nombre + ", " + instrumento + ", " + numeroSocio;
    }
}
