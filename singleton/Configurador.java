/**
 * Una clase que siga el patrón Singleton tiene la peculiaridad de que solo 
 * puede instanciar un único objeto .Este tipo de clases son habituales en 
 * temas como configurar parámetros generales de la aplicación ya que una 
 * vez instanciado el objeto los valores se mantienen y son compartidos  
 * por toda la aplicación.
 */
public class Configurador {
 
    private String url;
    private String baseDatos;
    
    
    /** 
    * Necesitaremos disponer de una variable estatica privada 
    * que almacene una referencia al objeto que vamos a crear a traves del 
    * constructor.
    */
    private static Configurador miconfigurador;
     
    
    // constructor
    /**
    * Para conseguir que una clase sea de tipo Singleton necesitamos en primer 
    * lugar que su constructor sea privado. De esa forma ningún programa será 
    * capaz de construir objetos de esta tipo. 
    */
    private Configurador(String url, String baseDatos){
        
        this.url=url;
        this.baseDatos=baseDatos;
    }


    // metodos set
    public void setUrl(String url) {
        this.url = url;
    }
     
    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

    // metodos get
    public String getUrl() { return url; }
    public String getBaseDatos() { return baseDatos; }
     

    /**
     * Por ultimo un método estático publico que se encarga de instanciar el 
     * objeto la primera vez y almacenarlo en la variable estática.
     */
    public static Configurador getConfigurador(String url, String baseDatos) {
        
        if (miconfigurador == null) {
            miconfigurador = new Configurador(url, baseDatos);
        }

        return miconfigurador;
    }
    
}