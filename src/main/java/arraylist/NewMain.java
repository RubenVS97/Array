/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author diabl
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaJuegos steam = new ListaJuegos();
        
        steam.insertarJuegos(new Juego("Dark souls", 16, "Acción", 20));
        steam.insertarJuegos(new Juego("The last of us", 18, "Aventura", 25));
        steam.insertarJuegos(new Juego("The binding of isaac", 18, "Aventura", 15));
        steam.insertarJuegos(new Juego("The Witcher 3", 16, "Aventura", 30));
        steam.insertarJuegos(new Juego("SuperLiminal", 8, "Puzzle", 15));
        
        ArrayList<Juego>  busquedaTitulo = steam.buscarPorTitulo("Dark souls");
        
        
        ArrayList<Juego>  busquedaPegi = steam.buscarPorPegi(18);
        
        System.out.println(steam.numeroJuegos());
        
        busquedaPegi.forEach(System.out::println);
    }
    
}
