
package pablogdb.diact1_2;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {
    public static ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>();
    
    public static void main(String[] args) {
        try{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
           
        });
        
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new frmError().setVisible(true);
                }
            });
        }
        
    }

}
