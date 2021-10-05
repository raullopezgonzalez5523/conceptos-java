public class Estudiante extends Persona {

    private String codigoEstudiante;
    private float notaFinal;

    public Estudiante(
        String nombre, 
        String apellido, 
        int edad, 
        String codigoEstudiante, 
        float notaFinal)  {

        super(nombre, apellido, edad);
        
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal; 

    }

    public Stirng mostrarDatos() {

        return "Nombre: " + getNombre() +
                "\nApellido: " + getApellido() + 
                "\nEdad: " + getEdad()  +
                "\nCodigo de estudiante: " + codigoEstudiante + 
                "\nNota final: " + notaFinal

    }

}