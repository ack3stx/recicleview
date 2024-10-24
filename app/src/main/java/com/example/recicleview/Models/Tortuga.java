package com.example.recicleview.Models;
import android.graphics.Color;

import com.example.recicleview.adapters.TortugaAdapter;

import java.io.Serializable;

public class Tortuga implements Serializable {

    private String Nombre;
    private String Descripcion;
    private String Arma;
    private int color;
    private int imagentortuga;

    public Tortuga(String nombre, String descripcion, String arma, int color,int imagentortuga) {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Arma = arma;
        this.color = color;
        this.imagentortuga = imagentortuga;
    }

    public void Settortuga(int imagentortuga){
        this.imagentortuga = imagentortuga;
    }
    public int getTortuga() {
        return imagentortuga;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String arma) {
        Arma = arma;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
