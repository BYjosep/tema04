package com.BYjosep04.tema04;

import java.util.Random;

public class Ejercicio11 {
    public static void main(String[] args) {
        quiniela();
    }
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
