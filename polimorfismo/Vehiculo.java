 public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;

    public Vehiculo() {}

    public Vehiculo(String matricula, String marca, String modelo) {

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;

    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() { return matricula; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public String mostrarDatos() {
        return "Matricula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo;
    }

 }