import java.util.Scanner;

public class Rectangulo {
    public int ancho;
    public int altura;

    public Rectangulo(int ancho, int altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        int ancho = 3;
        int altura = 5;
        String cuadrado = "";

        for (int fila = 0; fila < ancho; fila++) {
            String forma = "";
            for (int columna = 0; columna < altura; columna++) {
                if (fila == 0 || fila == ancho - 1 || columna == 0 || columna == altura - 1) {
                    forma += "*";
                } else {
                    forma += " ";
                }
            }
            cuadrado += forma + "\n";
        }
        return cuadrado;
    }
}




