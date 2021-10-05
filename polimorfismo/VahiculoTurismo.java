public class VehiculoTurismo extends Vehiculo {

    private int numPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numPuertas) {

        super(matricula, marca, modelo);
        this.numPuertas = numPuertas;

    }

    public int getNumPuertas() { return numPuertas; }

    @Override // Sobrescribir el metodo
    public String mostrarDatos() {

        return "Matricula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nNumero de puertas: " + numPuertas;

    }
}