package crud;
import jopi.JOPI;
import java.io.File;        
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Archivo {
    
    String nombreArchivo;
    
   public String creaAlumno(){
       Alumno a = new Alumno();
       return a.getDatos();
   }
   
   public void creaArchivo(){
       RandomAccessFile archivo;
       nombreArchivo = JOPI.cadena("Nombre del archivo?");
       
        File f = new File(nombreArchivo+".dat");
        f.delete();

        try{
            archivo = new RandomAccessFile(nombreArchivo+".dat", "rw");
            archivo.seek(0);
            archivo.writeBytes(creaAlumno()+"\n");
            archivo.close();
        }
        catch (FileNotFoundException e) {
                System.out.println("Error el archivo no se pudo crear");
        }
        catch (IOException e) {
            System.out.println("Error no se pudo cerrar el archivo");
        }

   }

   public void agregadatos(){
       RandomAccessFile archivo;
         try{
            archivo = new RandomAccessFile(nombreArchivo+".dat", "rw");
            archivo.seek(archivo.length());
            archivo.writeBytes(creaAlumno()+"\n");
            archivo.close();
        }
        catch (FileNotFoundException e) {
                System.out.println("Error el archivo no se pudo crear");
        }
        catch (IOException e) {
            System.out.println("Error no se pudo cerrar el archivo");
        }
   }
   
    public void elimina(int elim) {
          
       try{
            File arch = new File(nombreArchivo+".dat");
            File archAux = new File(nombreArchivo+"Aux.dat");
            archAux.delete();
            RandomAccessFile archivo = new RandomAccessFile(nombreArchivo+".dat","rw");
            RandomAccessFile archivoAux = new RandomAccessFile(nombreArchivo+"Aux.dat","rw");
            archivo.seek(0);
            archivoAux.seek(0);
            int cont=1;
            String linea;
            
            while( ( linea = archivo.readLine() ) != null){

               if( cont != elim)
                   archivoAux.writeBytes(linea+"\n" );
               
               cont++;  
            } 
            
            archivo.close();
            archivoAux.close();
            
            arch.delete();
            boolean rename = archAux.renameTo( arch );
          
            System.out.println("rename = "+ rename); // se logro renombrar
            
       } catch (FileNotFoundException e) {
                System.out.println("Error el archivo no se pudo crear");
        }
        catch (IOException e) {
            System.out.println("Error no se pudo cerrar el archivo");
        }
        
   }
   
}
