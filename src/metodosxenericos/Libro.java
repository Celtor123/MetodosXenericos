/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosxenericos;

/**
 *
 * @author csampedroromero
 */
public class Libro extends MetodosXenericos {
    String titulo;
    float precio;
    

    public Libro(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El Libro contiene: " + "titulo=" + titulo + ", precio=" + precio + '}';
    }
    
    
}
