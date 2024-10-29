package com.BYjosep04.tema04.fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio3 {
    public static enum Planeta{
        MERCURIO,VENUS,TIERRA,MARTE,JUPITER,SATURNO,URANO,NEPTUNO
    }
    public static void main(String[] args) {
        String nacimiento;
        Planeta eleccion;
        int planeta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento de la siguiente forma: dd/mm/yyyy");
        nacimiento = scanner.nextLine();
        System.out.println("Ingrese el planeta:");
        System.out.println("1. Mercurio, 2.Venus, 3.La Tierra, 4.Marte, 5.Jupiter, 6.Saturno, 7.Urano,8.Neptuno");
        planeta = Integer.parseInt(scanner.nextLine());
        scanner.close();
        switch (planeta){
            case 1-> eleccion= Planeta.MERCURIO;
            case 2-> eleccion= Planeta.VENUS;
            case 3-> eleccion= Planeta.TIERRA;
            case 4-> eleccion= Planeta.MARTE;
            case 5-> eleccion= Planeta.JUPITER;
            case 6-> eleccion= Planeta.SATURNO;
            case 7-> eleccion= Planeta.URANO;
            case 8-> eleccion= Planeta.NEPTUNO;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(nacimiento,formatter);


    }

    public static /*double*/void calculadorPlanetario(LocalDate fechaNacimiento, Planeta planeta){
    long dias =Ejercicio2.diasEdad(fechaNacimiento);
    float calculo=0;
        switch (planeta.ordinal()){
        case 0 -> System.out.println("Mercurio"); //calculo=  dias/(float)87.9;
    }
    //return calculo;
    }
}
