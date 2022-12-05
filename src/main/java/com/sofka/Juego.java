package com.sofka;

public class Juego {
    private Integer vidas;
    private final Integer vidasIniciales;
    private static Integer record = 0;

    public Juego(Integer vidas) {
        this.vidas = vidas;
        this.vidasIniciales = vidas;
    }

    public void muestraVidasRestantes() {
        System.out.println("Vidas Restantes: " + vidas);
    }

    public boolean quitarVida() {
        vidas = vidas - 1;
        if (vidas <= 0) {
            System.out.println("Juego Terminado");
            return false;
        }
        return true;
    }

    public void reiniciarPartida() {
        vidas = vidasIniciales;
    }

    public void actualizaRecord() {
        if (vidas == record) {
            System.out.println("Se alcanzo el record");
        } else if (vidas > record) {
            record = vidas;
            System.out.println("Has batido el record con " + vidas + " vidas");
        }
    }
}