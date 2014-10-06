/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fup.juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Laura Martinez
 */
public class Dealer {

    private Baraja b = new Baraja();
    private List<Carta> cartasd = new ArrayList<Carta>();
    private List<Carta> barajaCop = new ArrayList<Carta>();
    private int totaldealer; 
    //  private Carta c= new Carta();
//private Jugador u = new Jugador();

    public Dealer() {
    }

    public void revolver(int num) {
        for (int i = 0; i < num; i++) {
            Collections.shuffle(getB().getC());
        }
    }

    public Carta sacarCarta(boolean tapar) {
        Carta y = getB().getC().remove(0);
        y.setTapado(tapar);
        Carta x = new Carta(null, null);
        getB().getC().add(x);
        return y;
    }

    public void imprimir() {
        barajaCop.clear();
        for (int i = 0; i < b.getC().size(); i++) {
            String val = b.getC().get(i).getValor();
            String pint = b.getC().get(i).getPinta();
            Carta cart = new Carta(val, pint);
            System.out.print(val + "" + pint + " ");
            barajaCop.add(cart);

        }

    }

    /**
     * @return the b
     */
    public Baraja getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Baraja b) {
        this.b = b;
    }

    /*public boolean pensar() {
        int sum = 0;
        int as = 0;
        for (int i = 0; i < getCartasd().size(); i++) {
            String fi = getCartasd().get(i).getPinta();
            if (fi != "K" && fi != "Q" && fi != "J" && fi != "A") {
                sum = sum + Integer.parseInt(fi);
            }
            if (fi == "K" || fi == "Q" || fi == "J") {
                sum = sum + 10;
            }
            if (fi.equals("A")) {
                as = 1;
                if (sum == 10) {
                    sum = sum + 11;
                }
                if (sum < 10) {
                    sum = sum + 1;
                }
                if (sum == 0) {
                    sum = 11;
                }
            }




            fi = "";

            if (as == 1) {
                if (sum == 11) {
                    sum = 21;
                }
            }

        }
        if (sum == 21) {

            //   System.out.println("GANO...!!!!!");
            totaldealer= sum;
            return false;
        }
        if (sum <= 17) {
            //   System.out.println(sum);
             totaldealer= sum;
            return true;
            
        } else {
            //       System.out.println(sum);
             totaldealer= sum;
            return false;
        }

    }*/
    
    public boolean pensar( List<Carta> cartasDest) {
        int sum = 0;
        int as = 0;
        for (int i = 0; i < cartasDest.size(); i++) {
            String fi = cartasDest.get(i).getPinta();
            if (fi != "K" && fi != "Q" && fi != "J" && fi != "A") {
                sum = sum + Integer.parseInt(fi);
            }
            if (fi == "K" || fi == "Q" || fi == "J") {
                sum = sum + 10;
            }
            if (fi.equals("A")) {
                as = 1;
                if (sum == 10) {
                    sum = sum + 11;
                }
                if (sum < 10) {
                    sum = sum + 1;
                }
                if (sum == 0) {
                    sum = 11;
                }
            }
          fi = "";

            if (as == 1) {
                if (sum == 11) {
                    sum = 21;
                }
            }

        }
        if (sum == 21) {

            //   System.out.println("GANO...!!!!!");
            totaldealer= sum;
            return false;
        }
        if (sum <= 17) {
            //   System.out.println(sum);
             totaldealer= sum;
            return true;
            
        } else {
            //       System.out.println(sum);
             totaldealer= sum;
            return false;
        }

    }

    /**
     * @return the cartasd
     */
    public List<Carta> getCartasd() {
        return cartasd;
    }

    /**
     * @param cartasd the cartasd to set
     */
    public void setCartasd(List<Carta> cartasd) {
        this.cartasd = cartasd;
    }

    public void PedirCarta(Carta micarta) {
        if (cartasd.size() > 6) {
            System.out.println("Ha completado el numero maximo de CARTAS (7)...");
        } else {
            cartasd.add(micarta);
        }
    }

    public void imprimirD() {
        for (int i = 0; i < cartasd.size(); i++) {
            if (cartasd.get(i).isTapado() == true) {

                System.out.print("\nDealer: (" + cartasd.get(i).getValor() + " " + cartasd.get(i).getPinta() + ")");
            } else {
                System.out.print(" " + cartasd.get(i).getValor() + " " + cartasd.get(i).getPinta());
            }

        }

    }

    /**
     * @return the barajaCop
     */
    public List<Carta> getBarajaCop() {
        return barajaCop;
    }

    /**
     * @param barajaCop the barajaCop to set
     */
    public void setBarajaCop(List<Carta> barajaCop) {
        this.barajaCop = barajaCop;
    }

    public void imprimirCopia() {
        for (int y = 0; y < getBarajaCop().size(); y++) {
            String v = getBarajaCop().get(y).getValor();
            String p = getBarajaCop().get(y).getPinta();
            Carta ct = new Carta(v, p);
            Jugador jugad = new Jugador();
            System.out.print(v + "" + p + " ");
            jugad.getCb().add(ct);

        }
    }

    /**
     * @return the totaldealer
     */
    public int getTotaldealer() {
        return totaldealer;
    }

    /**
     * @param totaldealer the totaldealer to set
     */
    public void setTotaldealer(int totaldealer) {
        this.totaldealer = totaldealer;
    }
}
