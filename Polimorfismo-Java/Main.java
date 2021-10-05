public class Main{
    public static void main(String args[]) {

        Vehiculo misVehiculos[] = new Vehiculo[4]; 

        misVehiculos[0] = new Vehiculo("GH67", "Nisan", "A5");
        misVehiculos[1] = new VehiculoTurismo("67DJ", "Audi", "S6D", 4);
        misVehiculos[2] = new VehiculoDeportivo("92KS", "Toyota", "9ED", 4);
        misVehiculos[3] = new VehiculoFurgoneta("01KJ", "Toyota", "0WX", 2000);

        for(int i = 0; i < misVehiculos.length; i++) {
            System.out.println(misVehiculos[i]);
        }
    }
}