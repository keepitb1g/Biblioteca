package org.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("biblioteca");
        Libro libro1 = new Libro("A", "B","C","123123",1,true);
        biblioteca.agregarLibro(libro1);
        biblioteca.mostrarLibrosDisponibles();
    }
}