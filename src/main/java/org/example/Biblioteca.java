package org.example;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        for (Libro lib : this.libros) {
            if (lib.getTitulo()==null && lib.getIsbn()==null) {
                libros.add(lib);
                break;
            }
            else{
                if (lib.getIsbn().equals(libro.getIsbn())) {
                    lib.setCantidadDisponible(lib.getCantidadDisponible()+1);
                    break;
                }
            }
        }
    }
    public Libro buscarLibro(String titulo, String isbn) {
        for (Libro lib : this.libros) {
            if (lib.getTitulo().equals(titulo) && lib.getIsbn().equals(isbn)) {
                return lib;
            }break;
        }
        return null;
    }
    public void mostrarLibrosDisponibles(){
        for (Libro lib : libros) {
            System.out.println(lib.toString());
        }
    }
    public void buscarLibroPorTitulo(String titulo) {
        for (Libro lib : this.libros) {
            if (lib.getTitulo().equals(titulo)) {
                System.out.println("El libro: "+titulo);
                lib.toString();
                System.out.println();
            } else {
                System.out.println("No se ha encontrado el libro: "+titulo);
            }
        }
    }
    public void buscarLibroPorAutor(String autor) {
        for (Libro lib : this.libros) {
            if (lib.getAutor().equals(autor)) {
                System.out.println("El autor: "+autor+"tiene el siguiente libro");
                lib.toString();
                break;
            }else {
                System.out.println("No se ha encontrado el libro del autor: "+autor);
            }
        }
    }
    public void eliminarLibro(String titulo){
        for (Libro lib : this.libros) {
            if (lib.getTitulo().equals(titulo) && lib.getCantidadDisponible()==0) {
                libros.remove(lib);
                System.out.println("El libro: "+titulo+"ha sido eliminado exitosamente.");
                break;
            }else {
                System.out.println("El libro: "+titulo+"no se encuentra en la biblioteca.");
            }
        }
    }
    public void prestarLibro(String titulo){
        for (Libro lib : this.libros) {
            if (lib.getDisponible() && lib.getTitulo().equals(titulo)) {
                System.out.println("El libro: "+lib.getTitulo()+ "se ha prestado");
                lib.setDisponible(false);
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
