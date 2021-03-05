package com.example.app;

import java.util.Random;

public class Nombres {

    
    
    
    public String generarPalabras(){


        int n = 300;
        String palabraAleatoria = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String palabraGenerada ="";
        n = (int) (Math.random() * n) + 1;
        for (int i=0;i<=n;i++){

            int indice = (int) (Math.random() * 48) + 1;;
            char Aleatorio = palabraAleatoria.charAt(indice);
            palabraGenerada = palabraGenerada + Aleatorio;


        }
        return palabraGenerada;
        
        
        
        
    }
    
    
    
    
}
