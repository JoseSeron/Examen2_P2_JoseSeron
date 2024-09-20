
package examen2_nombreapellido;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author joser
 */
public class Hilo implements Runnable{
    
    JProgressBar barra;
    int velocidad;

    public Hilo(JProgressBar barra, int velocidad) {
        this.barra = barra;
        this.velocidad = velocidad;
    }

    public Hilo() {
    }

 
    
    
    
    @Override
    public void run() {
        int progreso=0;
        while (barra.getValue()<100) {
            barra.setValue(progreso++);
            
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
