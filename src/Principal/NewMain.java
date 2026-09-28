/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;
import Vista.FormVideojuegos;
/**
 *
 * @author mirel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FormVideojuegos fm=new FormVideojuegos();
        fm.setVisible(true);
        fm.setTitle("REGISTRO DE VIDEOJUEGOS");
        fm.setLocationRelativeTo(null);
    }
    
}
