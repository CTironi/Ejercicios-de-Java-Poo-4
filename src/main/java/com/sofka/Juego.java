package com.sofka;

public class Juego {
    public Integer vidas;

    public Juego(Integer vidas) {
        this.vidas = vidas;
    }
    public void muestraVidasRestantes() {
        System.out.println("Vidas Restantes: " + vidas);
    }

    public static void main(String[] args) {

        Juego juego = new Juego(5);

        juego.muestraVidasRestantes();

        if (juego.vidas > 0) {
            juego.vidas = juego.vidas - 1;
        }

        juego.muestraVidasRestantes();

        Juego juego_2 = new Juego(5);

        juego_2.muestraVidasRestantes();
        juego.muestraVidasRestantes();
    }
}