package com.example.app;

import java.util.Random;

public class Nombres {

    
    
    
    public String generarPalabras(int tamano){

        String palabraAleatoria = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String palabraGenerada ="";

        for (int i=0;i<=tamano;i++){

            int indice = (int) (Math.random() * 24) + 1;;
            char Aleatorio = palabraAleatoria.charAt(indice);
            palabraGenerada = palabraGenerada + Aleatorio;


        }
        return palabraGenerada;
        
        
        
        
    }
    
    
    
    
}
