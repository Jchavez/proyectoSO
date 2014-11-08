package proyectso;

import javax.swing.*;


/**
 *
 * @author Jonathan and Cristian
 */
public class ProyectSO extends JFrame{

    ProyectSO(){
        this.setLayout(null);
        this.setTitle("UMG * Proyecto SO * Jonathan Chávez 0900-11-2792 * Cristhian Guzman 0900-11-");
        this.setSize(1024, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation( this.EXIT_ON_CLOSE );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ProyectSO();
    }
}
