package org.example;

public class Heroe {

    private String nombre;
    private int poder=900; //0 -100

    public Heroe() {
    }

    public Heroe(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if (poder>0 && poder<=100) {
            this.poder = poder;
        }else{
            System.out.println("poder incorrecto");
        }

    }

    public String saludar(String nombre){

        return("te vencere "+nombre);


    }




}
