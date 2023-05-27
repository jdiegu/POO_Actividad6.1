
package crud;

import jopi.JOPI;

public class Menu {
   
    
    public void menu(){
        Archivo arch = new Archivo();
        
        int op;
        String[] opciones = { "CREAR","AGREGAR","TERMINAR" } ;
        
        do{
            op = salida.Menu.menuBotones( opciones , "OPCIONES");
            switch(op){
                case 0:
                    arch.creaArchivo();
                    break;
                case 1:
                     arch.agregadatos();
                     break;
            }
            
        }while(op != 2);
    }
    
}
