package org.example;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private int cantidadDisponible;
    private boolean disponible;

    public Libro(String titulo, String autor, String editorial, String isbn, int cantidadDisponible, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = editorial;
        this.isbn = isbn;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Título: "+this.titulo+"Autor: "+this.autor+"Género: "+this.genero+"ISBN: "+this.isbn+"Cantidad disponible: "+this.cantidadDisponible;
    }
    public void prestarLibro(String titulo){
        if (this.disponible){
            this.cantidadDisponible--;
            if(this.cantidadDisponible == 0){
                this.disponible = false;
                }System.out.println("Se ha prestado el libro"+titulo);
            } else{
            System.out.println("El libro "+titulo+"no esta disponible");
        }
    }
    public void devolver(String titulo){
        if (this.cantidadDisponible== 0){
            this.disponible = true;
        }this.cantidadDisponible++;
        System.out.println("El libro "+titulo+"se ha devuelto");
    }
}
