package src;

import java.math.BigDecimal;

public class MusicoRefuerzo extends src.Musico {
    private BigDecimal salario;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal salario) {
        super(nombre, instrumento);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre + ", " + instrumento + ", " + salario;

    }
}
