package org.example;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        boolean existe = false;
        for (Libro lib : this.libros) {
            if (lib.getTitulo().equals(libro.getTitulo()) && lib.getIsbn().equals(libro.getIsbn())) {
                lib.setCantidadDisponible(lib.getCantidadDisponible() + 1);
                existe = true;
                break;
            }
        }
        if (!existe) {
            this.libros.add(libro);
        }
    }
    public void mostrarLibrosDisponibles(){
        for (Libro lib : libros) {
            if (lib.getCantidadDisponible() > 0) {
                System.out.println(lib.toString());
            }
        }
    }
    public void buscarLibroPorAutor(String autor) {
        boolean encontrado = false;
        for (Libro lib : this.libros) {
            if (lib.getAutor().equals(autor)) {
                System.out.println("El autor: " + autor + " tiene el siguiente libro");
                System.out.println(lib.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el libro del autor: " + autor);
        }
    }

    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro lib : this.libros) {
            if (lib.getTitulo().equals(titulo)) {
                System.out.println("El libro buscado es: " + titulo);
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el libro: " + titulo);
        }
    }
    public void eliminarLibro(String titulo) {
        boolean encontrado = false;
        for (Libro lib : this.libros) {
            if (lib.getTitulo().equals(titulo)) {
                libros.remove(lib);
                System.out.println("El libro: " + titulo + " ha sido eliminado exitosamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro: " + titulo + " no se encuentra en la biblioteca.");
        }
    }
    public void prestarLibro(String titulo){
        for (Libro lib : this.libros) {
            if (lib.getDisponible() && lib.getTitulo().equals(titulo)) {
                System.out.println("El libro: "+lib.getTitulo()+ " se ha prestado");
                lib.prestarLibro(titulo);
                break;
            }
            else{
                System.out.println("No se ha encontrado el libro: "+lib.getTitulo());
            }
        }
    }
    public void devolverLibro(String titulo){
        for (Libro lib : this.libros) {
            if (lib.getTitulo().equals(titulo)) {
                lib.devolver(lib.getTitulo());
                break;
            }else {
                System.out.println("El libro: "+lib.getTitulo()+ "se encuentra prestado");
            }

        }
    }
}
