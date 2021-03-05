package com.example.app;

import java.util.Random;

public class Nombres {

    
    
    
    public String generarPalabras(){



        String palabraAleatoria = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String palabraGenerada ="";
        int  n = (int) (Math.random() * 6) + 1;
        for (int i=0;i<=n;i++){

            int indice = (int) (Math.random() * 48) + 1;;
            char Aleatorio = palabraAleatoria.charAt(indice);
            palabraGenerada = palabraGenerada + Aleatorio;


        }
        return palabraGenerada;
        
        
        
        
    }
    
    
    
    
}
