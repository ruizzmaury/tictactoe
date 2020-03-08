/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Mauri
 */
public class TicTacToe {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tablero t = new Tablero();
        t.crearTablero();
        Ficha ficha = new Ficha();
        System.out.println("hola");


        System.out.println("Jugador1 elige ficha: \n"
                + " - Pulsa 1 para O \n"
                + " - Pulsa 2 para X \n");
        
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ficha.asignarFichaUser(Ficha.O);
                break;
            case 2:
                ficha.asignarFichaUser(Ficha.Tipo.X);
                break;
        }
        
        
        System.out.println("Jugador2 elige ficha: \n"
                + " - Pulsa 1 para O \n"
                + " - Pulsa 2 para X \n");
        
        opcion = sc.nextInt();
         
        
        
        switch (opcion) {
            case 1: 
                ficha.asignarFichaUser(Ficha.O);
                break;
            case 2:
                ficha.asignarFichaUser(Ficha.X);
                break;
        }
        
    }

}
