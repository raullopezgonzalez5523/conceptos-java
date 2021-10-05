public class Clase1 {

    int atributo1;
    /**
     * atributo1 no tiene modificador de acceso
     * por lo tanto las clases que se encuentren en el
     * mismo paquete solo pueden acceder a el.
     */

    public int atributoPublico;
    /**
     * atributoPublico ahora tiene el modificador de acceso
     * publico, por lo que cualquier clase ya sea de 
     * otro directorio puede acceder al atributo.
     */

    private int atributoPrivate;
    /**
     * atributoPrivate tiene el modificador de acceso 
     * private, solo la misma clase del atributo
     * puede tener acceso a el y poder modificarlo
     */

    protected int atributoProtected;
    /**
     * El atributo solo es visible en la clase en donde se define 
     * y en cualquiera de sus subclases (herencia)
     */
    
}