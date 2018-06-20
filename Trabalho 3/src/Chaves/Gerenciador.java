/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chaves;

import Apps.*;

/**
 *
 * @author Leonardo Fronza
 */
public class Gerenciador {

    private Chave[] keys = new Chave[5];

    public Chave[] getKeys() {
        return keys;
    }

    public void setKeys(Chave[] keys) {
        this.keys = keys;
    }

    public void setKey() {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == null) {
                keys[i] = new Chave();
                break;
            }
        }
    }

    public void expireKey(Cliente cliente) {
        keys[findKey(cliente.getKey())] = null;
    }

    private int findKey(Chave key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == key) {
                return i;
            }
        }
        throw new RuntimeException("Chave não encontrada");
    }

    @Override
    public String toString() {
        String saida = "";
        for (int i = 0; i < keys.length; i++) {
            saida += keys[i].getKey() + " ";
        }
        return saida;
    }
    
}
