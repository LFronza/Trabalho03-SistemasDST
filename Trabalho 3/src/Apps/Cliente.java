/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import Chaves.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Leonardo Fronza
 */
public class Cliente {

    private Chave key;

    public Chave getKey() {
        return key;
    }

    public void setKey(Chave key) {
        this.key = key;
    }

    public String getHora() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date).toString();
    }

    public void setHora() {
        LocalDateTime.now();
    }

}
