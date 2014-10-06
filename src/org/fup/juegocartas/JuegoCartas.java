/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fup.juegocartas;

import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;

/**
 *
 * @author Laura Martinez Sandoval
 */
public class JuegoCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Carta c = new Carta();
      Baraja b = new Baraja();
      Dealer d= new Dealer();
      Mesa mes= new Mesa();
      Jugador j= new Jugador();
      
      mes.Jugar();
 
      
     
              
    }
}
