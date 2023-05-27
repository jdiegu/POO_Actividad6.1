
package crud;

import jopi.JOPI;

public class Menu {
   
    
    public void menu(){
        Archivo arch = new Archivo();
        
        int op;
        String[] opciones = { "CREAR","AGREGAR", "ELIMINAR" ,"TERMINAR" } ;
        
        do{
            op = salida.Menu.menuBotones( opciones , "OPCIONES");
            switch(op){
                case 0:
                    arch.creaArchivo();
                    break;
                case 1:
                     arch.agregadatos();
                     break;
                case 2:
                    arch.elimina(JOPI.entero("Registro a eliminar?"));
                    break;
            }
            
        }while(op != 3);
    }
    
}
