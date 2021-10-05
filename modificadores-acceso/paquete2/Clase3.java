import paquete1.Clase1;

public class Clase3 {

    Clase1 objeto1 = new Clase1();

    objeto1.atributoPublico = 10;
    /**
     * Cualquier clase ya sea de 
     * otro directorio puede acceder al atributo.
     */

    // error -> ojeto1.atributo1 = 1;
    /**
     * marca error por que nesecita estar dentro del mismo paquete
     */
    
}