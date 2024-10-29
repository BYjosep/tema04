package com.BYjosep04.tema04.metodos;

import java.util.Random;

public class Ejercicio11 {
    public static void main(String[] args) {
        quiniela();
    }

    /**
     * Funcion para imprimir una quiniela de 15 partidos
     * El resultado de la quiniela es random entre 0 y 2
     * siendo O el empate representado como x
     */
    public static void quiniela(){
        int partido;
        Random random= new Random();
        for (int i = 0; i <=15 ; i++) {
            partido= random.nextInt(0,3);
            switch (partido){
                case 0-> System.out.printf("Partido %-6d x\n",i );
                case 1-> System.out.printf("Partido %-6d 1\n",i );
                case 2-> System.out.printf("Partido %-6d 2\n",i );
            }
        }

    }
}
