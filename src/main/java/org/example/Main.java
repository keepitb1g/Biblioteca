package org.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("biblioteca");
        Libro libro1 = new Libro("Astrofisica para gente apurada", "Neil Tyson","Ciencias","111222333",1,true);
        Libro libro2 = new Libro("Bailar en las nubes", "Vanina Starkoff","Cuento","22211133",4,true);
        Libro libro3 = new Libro("El principito", "Antoine","Cuento","333111222",1,true);
        Libro libro4 = new Libro("Palabras de Caramelo", "Gonzalo Moure","Cuento","111333222",1,true);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.mostrarLibrosDisponibles();


        biblioteca.prestarLibro("Astrofisica para gente apurada");
        biblioteca.mostrarLibrosDisponibles();

        biblioteca.devolverLibro("Astrofisica para gente apurada");
        biblioteca.mostrarLibrosDisponibles();

        biblioteca.buscarLibroPorTitulo("El principito");
        biblioteca.buscarLibroPorAutor("Antoine");

        biblioteca.eliminarLibro("El principito");
        biblioteca.mostrarLibrosDisponibles();
    }
}