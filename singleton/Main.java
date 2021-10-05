public class Main {
 
    public static void main(String[] args) {
     
        Configurador configurador = Configurador.getConfigurador("miurl", "mibaseDatos");
     
        System.out.println(configurador.getUrl());
        System.out.println(configurador.getBaseDatos());
    }
}