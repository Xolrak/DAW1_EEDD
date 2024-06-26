package org.antonio;

public class Luffy implements Personaje {
    private String nombre;
    private int poder;

    public Luffy(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    //Setter para el nombre de Luffy
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }
    
    //Setter para el Poder del personaje
    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public void recibirDanio(int cantidadDanio) {
        this.poder -= cantidadDanio;
    }

    // Método para atacar a otro personaje
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }
}