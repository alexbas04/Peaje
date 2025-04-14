import java.util.ArrayList;

public class Coche {
    private String matricula;
    private double tamanyo;
    private ArrayList <Multa> multas;

    public Coche(String matricula, double tamanyo) {
        this.matricula = matricula;
        this.tamanyo = tamanyo;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getTamanyo() {
        return tamanyo;
    }

    public void setMultas(Multa multa) {
        multas.add(multa);
    }
}
