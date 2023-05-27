
package crud;
import jopi.JOPI;
public class Alumno {
    
    protected String nControl, nombre, semestre, promedio;
    
    public Alumno(){
        this.nControl = JOPI.cadena("Digita el no. de control");
        this.nombre = JOPI.cadena("¿Cuál es tu nombre? ");
        this.semestre = JOPI.cadena("¿En qué semestre estás? ");
        this.promedio = JOPI.cadena("¿De cuánto es tu promedio?");
    }
    
    public String getDatos(){
        String msg = this.nControl+" , ";
        msg += this.nombre + " , " ;
        msg += this.semestre + " , " ;
        msg += this.promedio;
        
        return msg;
    }
    
}
