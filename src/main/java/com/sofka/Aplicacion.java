package com.sofka;

public class Aplicacion {
    public static void main(String[] args) {

        System.out.println("Se crea una nueva Instancia del juego con 5 vidas");
        Juego juego = new Juego(5);

        juego.muestraVidasRestantes();

        System.out.println("Se le quita 1 vida y la mostramos");
        juego.quitarVida();

        juego.muestraVidasRestantes();

        System.out.println("Reiniciamos la partida y mostramos que el juego tiene el valor inicial de 5");
        juego.reiniciarPartida();

        juego.muestraVidasRestantes();

        System.out.println("Creamos un segundo juego con 10 vidas y mostramos");
        Juego juego_2 = new Juego(10);

        juego_2.muestraVidasRestantes();

        System.out.println("Volvemos a mostrar la vida del juego 1 para comparar");
        juego.muestraVidasRestantes();

        System.out.println("Actualizamos el record del juego 1, como el record inicia en 0 y el valor de este es 5 lo batira");
        juego.actualizaRecord();

        System.out.println("Actualizamos el record del juego 2 y como este es de 10(mayor q 5) lo volvera a batir");
        juego_2.actualizaRecord();

        System.out.println("Actualizamos el record del juego 1 nuevamente para confirmar que este es menor que el juego 2 y no va a devolvernos nada");
        juego.actualizaRecord();

        System.out.println("Creamos un juego 3 con 10 de vida y actualizmaos su record para confirmar que este alcanza el record del juego 2");
        Juego juego_3 = new Juego(10);

        juego_3.actualizaRecord();
    }
}
