/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tempo;

import Forms.Clientes;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Leonardo Fronza
 */
public class Tclock extends Thread{
    double tempo;
    Clientes c;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            c.setTempo("" + getTempo());
        }
    };
    
    
    private Temporizador t;
         public Tclock(Clientes c, double tempo) {
             this.c = c;
             t = new Temporizador();
             this.tempo = tempo;
             t.start();
             start();
         }
         public double getTempo(){
             return t.getSecondsTillNow();
         }
         
         public synchronized void start() throws IllegalStateException{
             timer.scheduleAtFixedRate(task, 100, 100);            
         }
         public synchronized void parar(){
          timer.cancel();
          task.cancel();
          t.stop();
          c.getBotao().setSelected(true);
         }
}
