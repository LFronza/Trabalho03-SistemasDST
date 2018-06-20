/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Chaves.*;
import java.time.LocalDateTime;

/**
 *
 * @author Leonardo Fronza
 */
public class Cliente {
    private LocalDateTime hora;
    private Chave key;

    public Chave getKey() {
        return key;
    }

    public void setKey(Chave key) {
        this.key = key;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora() {
        LocalDateTime.now();
    }
    
 
}
