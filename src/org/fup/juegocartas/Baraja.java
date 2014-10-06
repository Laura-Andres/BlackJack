/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fup.juegocartas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laura Martinez
 */
public class Baraja {

    private List<Carta> c = new ArrayList<Carta>();// private Carta[] c = new Carta[52];

    public Baraja() {

        String[] nume = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] fig = {"♥", "♠", "♣", "♦"};
        String f, n;
        for (int i = 0; i < 4; i++) {
            f = fig[i];
            for (int j = 0; j < 13; j++) {
                n = nume[j];
                Carta ctmp;
                ctmp = new Carta(f, n);
                c.add(ctmp);
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < c.size(); i++) {

            System.out.println(" --" + c.get(i).getValor() + " " + c.get(i).getPinta());
            /*  System.out.println(getC().get(i).getValor() + " " + getC().get(i).getPinta());*/
        }
    }

    /**
     * @return the c
     */
    public List<Carta> getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(List<Carta> c) {
        this.c = c;
    }
}
