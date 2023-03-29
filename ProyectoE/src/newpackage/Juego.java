package newpackage;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Juego {

    private int numero1;
    private int numero2;

    public Juego() {
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero() {
        return numero1;
    }

    public void setNumero(int numero) {
        this.numero1 = numero;
    }

    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador Uno  inserte un numero :"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador Dos inserte un numero para adivinar:"));
        int cont = 0;

        do {
            cont++;
            if (numero1 == numero2) {
                System.out.println("*** WINNER *** ");
                System.out.println("El numero a adivinar era el:" + numero1);
                System.out.println("Usted acerto en el intento numero; " + cont);
                break;
            } else if (numero1 < numero2) {
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador Dos inserte otro numero que sea menor al anterior :"));

            } else if (numero1 > numero2) {
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador Dos inserte otro numero que sea mayor al anterior :"));
            }
            if (cont == 10) {
                System.out.println("*** PERDIO ***");
                System.out.println("El numero escondido era el : " + numero1);
                System.out.println("GAME OVER");
            }
        } while (cont != 10);

    }

}
