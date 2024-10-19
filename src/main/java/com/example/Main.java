package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.agregarMaterial(new Libro("Harry potter y la orden del fenix", "J.K Rowlling", 2007, "93635374494958575", 420));
        

        biblioteca.agregarMaterial(new Revista("un capuchino mortal", "cleo coyle", 1999, 10, "Enero"));

        biblioteca.agregarMaterial(new Audiovisual("Los juegos del hambre", "Jon kilik", 2, "DVD", 160));

        

    }
}