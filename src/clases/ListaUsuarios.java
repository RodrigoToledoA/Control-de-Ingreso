/*
 * RESUELVE EL PUNTO 1
 */

package clases;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * Clase FileJob. Sirve para realizar la escritura y lectura de archivos
 * @author Cardozo - Gonzalez - Guignard - Rodenas 1k12-2013
 */
public abstract class ListaUsuarios {
    
    private static final String archivo = "Usuariso.qr";
    private static FileInputStream fis = null;
    private static ObjectInputStream ois = null;
    private static FileOutputStream fos = null;
    private static ObjectOutputStream oos = null;
    public final static int CANTIDAD = 100;
    
    private static Usuario[] lista = new Usuario[CANTIDAD];
    
//Se carga un nuevo usuario a la lista de objetos cuardados.
    public static boolean addUser(Usuario p) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = p;
                return true;
            }
        }
        return false;
    }

    public static Usuario[] getLista() {
        return lista;
    }
    
//Se encarga de guardar la lista de usuarios los usuarios que hay
    public static boolean guardarUsuario() {

        boolean saved = false;
        
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            //Esta es otra forma de hacer un for, la sintaxis es la siguiente:
            //for (Clase aux:array), recorre el array y se lo asigna al auxiliar.
            oos.writeObject(lista);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
            return false;
        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo");
            return false;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    oos = null;
                }
                if (fos != null) {
                    fos.close();
                    fos = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }        

        System.out.println("Guardado Correctamente");
        return true;
    }

    /*
     * Devuelve un arraylist con las ventas en disco
     */
//Carga la lista de todos los usuarios que alguna vez se cargaron
public static boolean levantarObjetoEntero() {
        Usuario[] aux=null;

        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);

            aux = (Usuario[]) ois.readObject();
            System.out.println(aux);

        }  catch (Exception e1) {
            System.out.println("Error!!!" + e1);
            return false;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        lista = aux;
        return true;
    }

   
}
