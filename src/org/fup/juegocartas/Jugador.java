/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fup.juegocartas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laura Martinez Sandoval
 */
public class Jugador {

    private String nombre;
    private int fichas;
    private ArrayList<Carta> cartas = new ArrayList<Carta>();
    private ArrayList<Carta> cb = new ArrayList<Carta>();
    private ArrayList<Integer> totales = new ArrayList<Integer>();
    public Dealer d1 = new Dealer();
    private Mesa m = new Mesa();
    private Integer totalesj;
 

    public Jugador(String nombre, int fichas) {
        this.nombre = nombre;
        this.fichas = fichas;

    }

    public Jugador() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fichas
     */
    public int getFichas() {
        return fichas;
    }

    /**
     * @param fichas the fichas to set
     */
    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    /**
     * @return the cartas
     */
    public void PedirCarta(Carta micarta) {
       /* if (getCartas().size() > 6) {
            System.out.println("Ha completado el numero maximo de CARTAS (7)...");
        } else {*/
            getCartas().add(micarta);
       // }
    }

    public void imprimir() {
        for (int i = 0; i < getCartas().size(); i++) {
            System.out.println(getCartas().get(i).getValor() + "" + getCartas().get(i).getPinta());
        }

    }

    public boolean pensar(List<Carta> cartasDest) {
        
       totalesj=0;
        int valorDealer = 0;
        int sum = 0;
        int as = 0;
        int fig = 0;
        int ass = 0;
        //carta del dealer 
        //int tam= m.getCartasdest().size();
      /*  for (int i = 0; i <= 1; i++) {
            //carta del dealer
            dvalor = cartasDest.get(0).getValor();
            dpinta = cartasDest.get(0).getPinta();
            if (dpinta != "K" && dpinta != "Q" && dpinta != "J" && dpinta != "A") {
                valorDealer = Integer.parseInt(dpinta) + valorDealer;
            }
            if (dpinta == "K" || dpinta == "Q" || dpinta == "J") {
                valorDealer = 10+ valorDealer;
            }
            if (dpinta == "A") {
                valorDealer = 1 +valorDealer;
            }
           /*  if (dpinta != "K" || dpinta != "Q" || dpinta != "J" || dpinta != "A") {
                valorDealer = Integer.parseInt(dpinta) + valorDealer;
            }

            //  System.out.println("Dealer : "+dvalor + " " + dpinta);
        }*/

    
       
         for (int i = 0; i <cartasDest.size(); i++) 
        {
            String fi = cartasDest.get(i).getPinta();
            if (fi != "K" && fi != "Q" && fi != "J" && fi != "A") {

                sum = sum + Integer.parseInt(fi);
            }
            if (fi == "K" || fi == "Q" || fi == "J") {
                fig = fig + 1;
                sum = sum + 10;
            }
            if (fi.equals("A")) {
                ass = ass + 1;
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
       //------------     
        if (sum == 21) {
//getTotales().add(sum);  
setTotalesj(sum);
//setTotales( sum);
           // System.out.println("GANO...!!!!!");
            return false;

        }
        if (sum <= 11) {
            //getTotales().add(sum);
           setTotalesj(sum);
            return true;
            
        } else {
            //if(Integer.parseInt(dpinta)>=6 ){
            if (valorDealer < 6 || valorDealer > 2) {
               // getTotales().add(sum);
               setTotalesj(sum);
                return false;
            } else {
              //getTotales().add(sum);
               setTotalesj(sum); 
          
                return true;
            }
        }
    }
    /*public int Totales(){
        int valor=0;
     for(int f= 0;f<1;f++){
      valor=  totales.get(f);
      }
    return valor;
    }*/

    /**
     * @return the cartas
     */
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    /**
     * @param cartas the cartas to set
     */
    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

        /**
     * @return the cb
     */
    public ArrayList<Carta> getCb() {
        return cb;
    }

    /**
     * @param cb the cb to set
     */
    public void setCb(ArrayList<Carta> cb) {
        this.cb = cb;
    }

    public void im2() {
        System.out.print("desde jugador");
        for (int y = 1; y < getCb().size(); y++) {
            System.out.print("### " + getCb().get(y).getValor() + "" + getCb().get(y).getPinta() + " ");
        }
    }
    
     
   /* public void mostrar() {
        int j=2;
       
        for (int i = 0; i < m.getJugadores().size(); i++) {
            System.out.print("\nJugador n° " + (i+1)+": " + m.getJugadores().get(i).getNombre() + " Fichas: " + m.getJugadores().get(i).getFichas());
            int g=j+2;
         while(j< g ){
            // boolean va=getCartasjug().get(j).isTapado();
            if(m.getCartasjug().get(j).isTapado()==true){
            System.out.print("("+ m.getCartasjug().get(j).getPinta() + "" +  m.getCartasjug().get(j).getValor() + ")");
            }
             else{
             System.out.print(m.getCartasjug().get(j).getPinta() + "" +  m.getCartasjug().get(j).getValor()+ " ");
             }
           j=j+1; 
                
            }
        }
       
    }*/

    /**
     * @return the totales
     */
    public ArrayList<Integer> getTotales() {
        return totales;
    }

    /**
     * @param totales the totales to set
     */
    public void setTotales(ArrayList<Integer> totales) {
        this.totales = totales;
    }

    /**
     * @return the totalesj
     */
    public Integer getTotalesj() {
        return totalesj;
    }

    /**
     * @param totalesj the totalesj to set
     */
    public void setTotalesj(Integer totalesj) {
        this.totalesj = totalesj;
    }

    /**
     * @return the totaljug
     */
  
}
