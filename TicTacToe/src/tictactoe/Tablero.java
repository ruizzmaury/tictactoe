/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Mauri
 */
public class Tablero {

    public Tablero() {
    }

    private int[][] casilla;

    public Tablero(int[][] casilla) {
        this.casilla = casilla;
    }

    public int[][] getCasilla() {
        return casilla;
    }

    public void setCasilla(int[][] casilla) {
        this.casilla = casilla;
    }

    public void crearTablero() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("[]");
            }
            System.out.println("\n");
        }
    }

    public void ponerFicha(int f, int c, Jugador jugador) {
                
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (x == f && y == c) {
                    switch (jugador.getTipo()) {
                        case "O":
                            System.out.print("[O]");
                            break;
                        case "X":
                            System.out.print("[X]");
                            break;
                    }

                }
                System.out.print("[]");
            }
            System.out.println("\n");
        }
    }

}
