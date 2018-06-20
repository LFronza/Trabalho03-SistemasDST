/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chaves;

import java.util.Random;

/**
 *
 * @author Leonardo Fronza
 */
public class Chave {
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    private void genKey(){
        setKey(new RandomString(10, new Random()).nextString());
        
    }

    public Chave() {
        genKey();
    }
    
    
}
