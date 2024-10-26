package com.BYjosep04.tema04;

import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        int nota;
        String text;
        Random random = new Random();
        for (int i = 0; i <= 50; i++) {
            nota = random.nextInt(0, 11);
            text = calificador(nota);
            System.out.println(text);
        }
    }

    /**
     * Apartir de una nota numerica retorna su equvalente alfabetico
     *
     * @param nota se introduce una nota en formato numerico
     * @return mediante el enumerado Nota devuelve el string necesario
     */
    public static String calificador(int nota) {
        String notaAlfabetica = "hola";


        switch (nota) {
            case 0, 1, 2, 3, 4 -> notaAlfabetica = String.valueOf(Notas.INSUFICIENTE);
            case 5 -> notaAlfabetica = String.valueOf(Notas.SUFICIENTE);
            case 6 -> notaAlfabetica = String.valueOf(Notas.BIEN);
            case 7, 8 -> notaAlfabetica = String.valueOf(Notas.NOTABLE);
            case 9, 10 -> notaAlfabetica = String.valueOf(Notas.EXELENTE);
            default -> notaAlfabetica = String.valueOf(Notas.ERROR);
        }
        return notaAlfabetica;
    }

    public enum Notas {
        INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXELENTE, ERROR
    }
}
