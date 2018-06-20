/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Chaves.Gerenciador;

/**
 *
 * @author Leonardo Fronza
 */
public class Teste {
    public static void main(String[] args) {
        Gerenciador g = new Gerenciador();
        
        for (int i = 0; i < g.getKeys().length; i++) {
            g.setKey();
        }
        System.out.println(g.toString());
    }
}
