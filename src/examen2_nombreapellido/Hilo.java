
package examen2_nombreapellido;

import java.util.Date;
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
    long tiempo;
    Date date;

    public Hilo(JProgressBar barra, int velocidad) {
        this.barra = barra;
        this.velocidad = velocidad;
       date = new Date();
    }

    public Hilo() {
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

 
    
    
    
    @Override
    public void run() {
        int progreso=0;
        long inicio = System.currentTimeMillis();
        Date dateInicio = new Date();
        dateInicio.getTime();
        while (barra.getValue()<100) {
            barra.setValue(progreso++);
            
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        Date dateFinal = new Date();
        dateInicio.getTime();
        long fin = System.currentTimeMillis();
        
        
        setTiempo(fin-inicio);
        
    }
    
}
