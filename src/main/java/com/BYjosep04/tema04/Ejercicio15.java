package com.BYjosep04.tema04;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    public static final int DELAY = 500;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        String salida;

        salida = juegoOnce();
        System.out.println(salida);
        System.out.println("Hasta pronto!!");
        scanner.close();


    }

    public static String juegoOnce() {
        Scanner scanner = new Scanner(System.in);
        boolean plantado = false;
        int puntosPlayer = 0;
        int porrasPlayer = 0;
        int puntosCPU    = 0;
        int porrasCPU    = 0;
        int opcion, tiradaCPU, tiradaPlayer;
        char plantarse;
        String salida = "ERROR";
        do {
            System.out.println("***************************");
            System.out.println("*** JUEGO DE DADOS ONCE ***");
            System.out.println("***************************");
            System.out.println("1. Nueva partida ...");
            System.out.println("0. Salir");
            System.out.print("\nElige una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
            if (opcion == 1) {
                porrasCPU = 0;
                porrasPlayer = 0;
                puntosCPU = 0;
                puntosPlayer = 0;
                do {
                    System.out.println("Jugador lanza el dado al aire ...");
                    tiradaPlayer = random.nextInt(1, 7);
                    System.out.println("\n*****");
                    System.out.println("* " + tiradaPlayer + " *");
                    System.out.println("*****");
                    puntosPlayer += tiradaPlayer;
                    System.out.println("\nTu puntuación actual es " + puntosPlayer);
                    if (puntosPlayer < 11) {
                        System.out.print("¿Deseas plantarte con " + puntosPlayer + " puntos? (s/n): ");
                        plantarse = scanner.nextLine().charAt(0);
                        plantado = plantarse == 's' || plantarse == 'S';
                        if (plantado) {
                            plantado = false;
                            // Ahora la CPU intenta igualar o mejorar el resultado del jugador
                            while (puntosCPU < puntosPlayer) {
                                System.out.println("CPU lanza el dado al aire ...");
                                tiradaCPU = random.nextInt(1, 7);
                                System.out.println("\n?????");
                                System.out.println("? " + tiradaCPU + " ?");
                                System.out.println("?????\n");
                                puntosCPU += tiradaCPU;
                                System.out.println("La puntuación actual de la CPU es " + puntosCPU);
                            }
                            if (puntosCPU > 11) {
                                System.out.println("CPU se ha pasado. Porra para Player!!");
                                porrasPlayer++;
                                puntosCPU = 0;
                                puntosPlayer = 0;
                            } else if (puntosCPU > puntosPlayer) { // Gana CPU
                                if (puntosCPU == 11) {
                                    once();
                                    System.out.println("\nDoble porra para CPU\n");
                                    porrasCPU += 2;
                                } else {
                                    System.out.println("CPU ha mejorado tu puntuación. Porra para CPU!!");
                                    porrasCPU++;
                                }
                                puntosCPU = 0;
                                puntosPlayer = 0;
                            } else { // Empate
                                System.out.println("Empate!! Porra para los dos");
                                puntosCPU = 0;
                                puntosPlayer = 0;
                                porrasCPU++;
                                porrasPlayer++;
                            }
                            quienGana(porrasPlayer, porrasCPU);
                            scanner.nextLine();
                        }
                    } else if (puntosPlayer == 11) {
                        // Al obtener 11 el jugador suma automáticamente 2 porras
                        porrasPlayer += 2;
                        puntosCPU = 0;
                        puntosPlayer = 0;
                        once();
                        System.out.println("\n¡Bonificación! Doble porra");

                        quienGana(porrasPlayer,porrasCPU);
                        scanner.nextLine();
                    } else {
                        // El jugador se ha pasado
                        System.out.println("Ohh!! Te has pasado");
                        System.out.println("Porra para la CPU");
                        porrasCPU += 1;
                        puntosCPU = 0;
                        puntosPlayer = 0;
                        quienGana(porrasPlayer, porrasCPU);
                        scanner.nextLine();
                    }
                } while (porrasPlayer < 5 && porrasCPU < 5);
                if (porrasCPU >= 5) {
                    salida = "\nCPU gana la partida!!! por " + porrasCPU + " porras a " + porrasPlayer + "\n";
                } else if (porrasPlayer >= 5) {
                    salida = "\nPlayer gana la partida!!! por " + porrasPlayer + " porras a " + porrasCPU + "\n";
                }
            }
        } while (opcion != 0);
        return salida;
    }
    public static void quienGana(int porrasPlayer, int porrasCPU){
        System.out.println("\n**********************");
        System.out.println("* " + porrasPlayer + " PLAYER  -  CPU " + porrasCPU + " *");
        System.out.println("**********************");
        System.out.print("\nPulsa intro para continuar...");
    }

    public static void once(){
        System.out.println("\n$$$$$$$$$$$$$$$$");
        System.out.println("$$$$ ¡ONCE! $$$$");
        System.out.println("$$$$$$$$$$$$$$$$");
    }
}
