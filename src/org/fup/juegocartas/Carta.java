/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fup.juegocartas;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una carta con valor y figura
 *
 * @author Laura Martinez Sandoval
 */
public class Carta {

    private String valor;
    private String pinta;
    private boolean  tapado;

    public Carta(String valor, String pinta, boolean tapado) {
        this.valor = valor;
        this.pinta = pinta;
        this.tapado = tapado;
    }
    
    public Carta(String valor, String pinta) {
        this.valor = valor;
        this.pinta = pinta;
    }

    public Carta() {
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the pinta
     */
    public String getPinta() {
        return pinta;
    }

    /**
     * @param pinta the pinta to set
     */
    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

    /**
     * @return the tapado
     */
    public boolean isTapado() {
        return tapado;
    }

    /**
     * @param tapado the tapado to set
     */
    public void setTapado(boolean tapado) {
        this.tapado = tapado;
    }
}
