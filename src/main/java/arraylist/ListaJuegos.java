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
public class ListaJuegos {
    
    private ArrayList<Juego> steam;
    
    public ListaJuegos() {
        this.steam = new ArrayList<>();
    }

    public void insertarJuegos(Juego juego){
        steam.add(juego);
    }

    public void imprimirJuegos(){
        steam.forEach(System.out::println);
    }

    public boolean borrarJuegos(Juego juego){
        if(steam.remove(juego)){
            return true;
        }
        return false;
    }

    public int numeroJuegos(){
        return steam.size();
    }

    //BUSCAR DATOS
    public ArrayList<Juego> buscarPorTitulo(String titulo){ //BUSQUEDA POR DIRECTOR
        ArrayList<Juego> juegoBuscado = new ArrayList<>();

        for (Juego juego: steam) {
            if(juego.getTitulo().equalsIgnoreCase(titulo)){
                juegoBuscado.add(juego);
            }
        }
        return juegoBuscado;
    }

    public ArrayList<Juego> buscarPorPegi(int pegi){ //BUSQUEDA POR TITULO
        ArrayList<Juego> juegoBuscado = new ArrayList<>();

        for (Juego juego: steam) {
            if(juego.getPegi() == pegi){
                juegoBuscado.add(juego);
            }
        }
        return juegoBuscado;
    }

    public ArrayList<Juego> buscarPrecio(double precio){ //BUSQUEDA POR IDIOMA
        ArrayList<Juego> juegoBuscado = new ArrayList<>();

        for (Juego juego: steam) {
            if(juego.getPrecio() == precio){
                juegoBuscado.add(juego);
            }
        }
        return juegoBuscado;
    }

    public ArrayList<Juego> buscarPorGenero(String genero){ //BUSQUEDA POR TIPO DE PELICULA
        ArrayList<Juego> juegoBuscado = new ArrayList<>();

        for (Juego juego: steam) {
            if(juego.getGenero().equalsIgnoreCase(genero)){
                juegoBuscado.add(juego);
            }
        }
        return juegoBuscado;
    }
    
}
