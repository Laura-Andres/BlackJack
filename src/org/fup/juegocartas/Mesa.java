/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fup.juegocartas;

import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;
import java.lang.reflect.Array;

/**
 *
 * @author Laura MArtinez
 */
public class Mesa {

    private List<Jugador> jugadores = new ArrayList<Jugador>();
    private ArrayList<Carta> cartasjug = new ArrayList<Carta>();
    private ArrayList<Carta> cartasdest = new ArrayList<Carta>();
    private ArrayList<Carta> cartasTap = new ArrayList<Carta>();
    private ArrayList<Carta> cartasAdicionales = new ArrayList<Carta>();
    private ArrayList<Carta> copiaBaraja = new ArrayList<Carta>();
    private ArrayList<Integer> Total = new ArrayList<Integer>();
    private ArrayList<Carta> cartasjugA = new ArrayList<Carta>();
    private ArrayList<Carta> cartasDealer = new ArrayList<Carta>();
    private ArrayList<Carta> cartas1 = new ArrayList<Carta>();
    private ArrayList<Carta> cartas2 = new ArrayList<Carta>();
    private ArrayList<Carta> cartas3 = new ArrayList<Carta>();
    private int[] totalesJuego = new int[5];
    private int totaljug;
    private int posi;
    Dealer d = new Dealer();
    Baraja b = new Baraja();
      int di, j1, j2, j3;

    public Mesa() {
    }

    public void sentarJugador(Jugador j) {
        getJugadores().add(j);

    }

    /* public void mostrar() {
     int j = 2;

     for (int i = 0; i < getJugadores().size(); i++) {
     System.out.print("\nJugador n° " + (i + 1) + ": " + getJugadores().get(i).getNombre() + " Fichas: " + getJugadores().get(i).getFichas());
     int g = j + 2;
     while (j < g) {
     // boolean va=getCartasjug().get(j).isTapado();
     if (getCartasjug().get(j).isTapado() == true) {
     System.out.print("(" + getCartasjug().get(j).getPinta() + "" + getCartasjug().get(j).getValor() + ")");
     } else {
     System.out.print(getCartasjug().get(j).getPinta() + "" + getCartasjug().get(j).getValor() + " ");
     }
     j = j + 1;

     }
     }

     }*/
    public void mostrarPrueb() {

        int tam = getJugadores().size();
        if (tam > 0) {
            for (int i = 0; i < tam; i++) {
                System.out.print("\nJugador n° " + (i + 1) + ": " + getJugadores().get(i).getNombre() + " Fichas: " + getJugadores().get(i).getFichas());
                /*if(i==0 )
                 {
                 for(int j=0; j<cartasDealer.size(); j++ ){
                 if (cartasDealer.get(j).isTapado() == true) {
                 System.out.print("(" + cartasDealer.get(j).getPinta() + "" + cartasDealer.get(j).getValor() + ")");
                 } else {
                 System.out.print(cartasDealer.get(j).getPinta() + "" + cartasDealer.get(j).getValor() + " ");
                 }
                 }
                 }*/
                if (i == 0) {
                    int tam1 = getCartas1().size();
                    if (tam1 > 0) {
                        for (int j = 0; j < tam1; j++) {
                            if (getCartas1().get(j).isTapado() == true) {
                                System.out.print("(" + getCartas1().get(j).getPinta() + "" + getCartas1().get(j).getValor() + ")");
                            } else {
                                System.out.print(getCartas1().get(j).getPinta() + "" + getCartas1().get(j).getValor() + " ");
                            }
                        }
                    }
                }
                if (i == 1) {
                    int tam2 = getCartas2().size();
                    if (tam2 > 0) {
                        for (int j = 0; j < tam2; j++) {
                            if (getCartas2().get(j).isTapado() == true) {
                                System.out.print("(" + getCartas2().get(j).getPinta() + "" + getCartas2().get(j).getValor() + ")");
                            } else {
                                System.out.print(getCartas2().get(j).getPinta() + "" + getCartas2().get(j).getValor() + " ");
                            }
                        }
                    }
                }
                if (i == 2) {
                    int tam3 = getCartas3().size();
                    if (tam3 > 0) {
                        for (int j = 0; j < tam3; j++) {
                            if (getCartas3().get(j).isTapado() == true) {
                                System.out.print("(" + getCartas3().get(j).getPinta() + "" + getCartas3().get(j).getValor() + ")");
                            } else {
                                System.out.print(getCartas3().get(j).getPinta() + "" + getCartas3().get(j).getValor() + " ");
                            }
                        }
                    }
                }

            }
        }
    }

    public void juego(Carta c) {
        getCartasjug().add(c);
        boolean va = c.isTapado();
        if (va == false) {
            getCartasdest().add(c);
        }
        if (va == true) {
            getCartasTap().add(c);
        }

    }

    public void juegoPrueb(Carta c, int jug) {

        if (jug == 0) {
            getCartasDealer().add(c);
        }
        if (jug == 1) {
            getCartas1().add(c);
        }
        if (jug == 2) {
            getCartas2().add(c);
        }
        if (jug == 3) {
            getCartas3().add(c);
        }
    }

    public void juegoAdicional(Carta c) {
        getCartasjugA().add(c);
    }

    public void juegoDealer(Carta c) {
        getCartasDealer().add(c);
    }

    public void Imp() {
        for (int y = 0; y < getCartasjug().size(); y++) {
            System.out.print("N° " + y + " -" + getCartasjug().get(y).getPinta() + "" + getCartasjug().get(y).getValor() + " ");
        }
    }

    public void mostrarDest() {

        for (int i = 0; i < getCartasdest().size(); i++) {
            System.out.println(getCartasdest().get(i).getValor() + " " + getCartasdest().get(i).getPinta() + " " + getCartasdest().get(i).isTapado());
        }
    }

    public void mostrarTap() {

        for (int i = 0; i < getCartasTap().size(); i++) {
            System.out.println(getCartasTap().get(i).getValor() + " " + getCartasTap().get(i).getPinta() + " " + getCartasTap().get(i).isTapado());
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * @return the cartasjug
     */
    public ArrayList<Carta> getCartasjug() {
        return cartasjug;
    }

    /**
     * @param cartasjug the cartasjug to set
     */
    public void setCartasjug(ArrayList<Carta> cartasjug) {
        this.cartasjug = cartasjug;
    }

    /**
     * @return the cartasdest
     */
    public ArrayList<Carta> getCartasdest() {
        return cartasdest;
    }

    /**
     * @return the cartasTap
     */
    public ArrayList<Carta> getCartasTap() {
        return cartasTap;
    }

    /**
     * @return the cartasAdicionales
     */
    public ArrayList<Carta> getCartasAdicionales() {
        return cartasAdicionales;
    }

    /**
     * @return the copiaBaraja
     */
    public ArrayList<Carta> getCopiaBaraja() {
        return copiaBaraja;
    }

    /**
     * @param cartasdest the cartasdest to set
     */
    public void setCartasdest(ArrayList<Carta> cartasdest) {
        this.cartasdest = cartasdest;
    }

    
    public void Jugar() {
        
        int totalpard = 0;
        int totalJugador = 0;
        
        Jugador jug = new Jugador();
        d.revolver(5);
        System.out.println("Baraja Desorganizada...");//***
        d.imprimir();
        Carta cartaDealer = d.sacarCarta(true);
        d.PedirCarta(cartaDealer);
        juegoPrueb(cartaDealer, 0);
        cartaDealer = d.sacarCarta(false);
        d.PedirCarta(cartaDealer);
        juegoPrueb(cartaDealer, 0);
        d.imprimirD();
        System.out.print(d.pensar(cartasDealer));
        totalpard = d.getTotaldealer();
        totalesJuego[0] = totalpard;
        for (int i = 0; i < 2; i++) {
            Jugador jugad = new Jugador("Jugador" + (i + 1), 3000);
            sentarJugador(jugad);
             if (i == 0) {
                Carta micarta = d.sacarCarta(true);
                jug.PedirCarta(micarta);
                juegoPrueb(micarta, 1);
                micarta = d.sacarCarta(false);
                jug.PedirCarta(micarta);
                juegoPrueb(micarta, 1);
            }
            if (i == 1) {
                Carta micarta = d.sacarCarta(true);
                jug.PedirCarta(micarta);
                juegoPrueb(micarta, 2);
                micarta = d.sacarCarta(false);
                jug.PedirCarta(micarta);
                juegoPrueb(micarta, 2);
            }
            if (i == 2) {
                Carta micarta = d.sacarCarta(true);
                jug.PedirCarta(micarta);
                juegoPrueb(micarta, 3);
                micarta = d.sacarCarta(false);
                jug.PedirCarta(micarta);
                juegoPrueb(micarta, 3);
            }
        }

        mostrarPrueb();
        System.out.println("Total Dealer:  " + d.getTotaldealer());
        int tam = getJugadores().size() + 1;
        boolean retorno;
        for (int s = 0; s < tam; s++) {
            totalJugador = 0;
            int tmp = s;
            int pos = (tmp + 1);
            if (s == 0) {

                retorno = getJugadores().get(s).pensar(cartas1);
                totalJugador = getJugadores().get(s).getTotalesj();
                totalesJuego[1] = totalJugador;

                if (retorno == true) {
                    Carta micarta = d.sacarCarta(false);
                    getJugadores().get(s).PedirCarta(micarta);
                    juegoPrueb(micarta, pos);
                    getJugadores().get(s).pensar(cartas1);
                    totalesJuego[1] = totalJugador;
                    System.out.println("Jugador1 ---- fin total:  " + totalJugador);
                } else {

                    System.out.println("Jugador1  total:  " + totalJugador);
                }
                //DEALER
                if (totalpard < 17 && totalpard < totalJugador) {
                    cartaDealer = d.sacarCarta(true);
                    d.PedirCarta(cartaDealer);
                    juegoPrueb(cartaDealer, 0);
                    d.pensar(cartasDealer);
                    totalpard = d.getTotaldealer();
                    totalesJuego[0] = totalpard;
                    System.out.println("total dealer......." + totalpard);
                }
                if (totalpard > totalJugador) {
                    getJugadores().remove(s);
                    totalesJuego[1] = 0;
                    System.out.println(" SALE .. Jugador1");
                }
                if (totalJugador == 21 && totalpard < totalJugador) {
                    System.out.println(" GANO!!!.. Jugador1 ");
                }
                if (totalpard == 21 && totalJugador < totalpard) {
                    totalesJuego[1] = 0;
                    getJugadores().remove(s);
                    System.out.println(" SALE .. Jugador1");
                }
            }
            if (s == 1) {
int valor= getJugadores().size();
if (tam>0){
    boolean retornoDos;
                retornoDos = getJugadores().get(s).pensar(cartas2);
                totalJugador = getJugadores().get(s).getTotalesj();
                totalesJuego[2] = totalJugador;
                if (retornoDos == true) {
                    Carta micarta = d.sacarCarta(false);
                    getJugadores().get(s).PedirCarta(micarta);
                    juegoPrueb(micarta, pos);
                    totalJugador = getJugadores().get(s).getTotalesj();
                    totalesJuego[2] = totalJugador;
                    System.out.println("Jugador2------fin total:  " + totalJugador);
                } else {
                    System.out.println("Jugador2  total:  " + totalJugador);
                }
                //DEALER
                if (totalpard < 17 && totalpard < totalJugador) {
                    cartaDealer = d.sacarCarta(true);
                    d.PedirCarta(cartaDealer);
                    juegoPrueb(cartaDealer, 0);
                    d.pensar(cartasDealer);
                    totalpard = d.getTotaldealer();
                    totalesJuego[0] = totalpard;
                    System.out.println("total dealer......." + totalpard);
                }
                if (totalpard > totalJugador) {
                    // getJugadores().remove(s);
                    totalesJuego[2] = 0;
                    System.out.println(" SALE .. Jugador2");
                }
                if (totalJugador == 21 && totalpard < totalJugador) {
                    System.out.println(" GANO!!!.. Jugador2");
                }
                if (totalpard == 21 && totalJugador < totalpard) {
                    totalesJuego[2] = 0;
                    // getJugadores().remove(s);
                    System.out.println(" SALE .. Jugador2");
                }
            }}
               }
              
         
         /* for (int i=0; i<totalesJuego.length; i++){
              System.out.println("vec " + totalesJuego[i]);
          }*/
          
    
        
        //System.out.print( calcularMayor(totalesJuego)+" pos " + getPosi());
        
        if(getPosi()==0)
        {
            System.out.println("GANO DEALER......");
        }
        if(getPosi()==1)
        {
            System.out.println("GANO JUGADOR1......");
        }
        if(getPosi()==2)
        {
            System.out.println("GANO JUGADOR2......");
        }
       }
        
        
    

   

    public int calcularMayor(int[] arreglo ) 
{ 
int resultado = arreglo[0]; 
for(int i=0; i<arreglo.length; i++) 
{ 
if(arreglo[i] > resultado) 
{ 
resultado = arreglo[i]; 
setPosi(i);
} 
} 

return resultado; 
} 

     /**
     * @return the Total
     */
    
    public ArrayList<Integer> getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(ArrayList<Integer> Total) {
        this.Total = Total;
    }

    /**
     * @return the cartasjugA
     */
    public ArrayList<Carta> getCartasjugA() {
        return cartasjugA;
    }

    /**
     * @param cartasjugA the cartasjugA to set
     */
    public void setCartasjugA(ArrayList<Carta> cartasjugA) {
        this.cartasjugA = cartasjugA;
    }

    /**
     * @return the cartasDealer
     */
    public ArrayList<Carta> getCartasDealer() {
        return cartasDealer;
    }

    /**
     * @param cartasDealer the cartasDealer to set
     */
    public void setCartasDealer(ArrayList<Carta> cartasDealer) {
        this.cartasDealer = cartasDealer;
    }

    /**
     * @return the cartas1
     */
    public ArrayList<Carta> getCartas1() {
        return cartas1;
    }

    /**
     * @param cartas1 the cartas1 to set
     */
    public void setCartas1(ArrayList<Carta> cartas1) {
        this.cartas1 = cartas1;
    }

    /**
     * @return the cartas2
     */
    public ArrayList<Carta> getCartas2() {
        return cartas2;
    }

    /**
     * @param cartas2 the cartas2 to set
     */
    public void setCartas2(ArrayList<Carta> cartas2) {
        this.cartas2 = cartas2;
    }

    /**
     * @return the cartas3
     */
    public ArrayList<Carta> getCartas3() {
        return cartas3;
    }

    /**
     * @param cartas3 the cartas3 to set
     */
    public void setCartas3(ArrayList<Carta> cartas3) {
        this.cartas3 = cartas3;
    }

    /**
     * @param total the total to set
     */
    /**
     * @return the totaljug
     */
    public int getTotaljug() {
        return totaljug;
    }

    /**
     * @param totaljug the totaljug to set
     */
    public void setTotaljug(int totaljug) {
        this.totaljug = totaljug;
    }

    /**
     * @return the totalesJuego
     */
    public int[] getTotalesJuego() {
        return totalesJuego;
    }

    /**
     * @param totalesJuego the totalesJuego to set
     */
    public void setTotalesJuego(int[] totalesJuego) {
        this.totalesJuego = totalesJuego;
    }

    /**
     * @return the posi
     */
    public int getPosi() {
        return posi;
    }

    /**
     * @param posi the posi to set
     */
    public void setPosi(int posi) {
        this.posi = posi;
    }
}
