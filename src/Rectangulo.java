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
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ancho: ");
        int ancho = sc.nextInt();
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();
        String cuadrado = "";

        for (int fila = 0; fila < altura; fila++) {
            String forma = "";
            for (int columna = 0; columna < ancho; columna++) {
                if (fila == 0 || fila == altura - 1 || columna == 0 || columna == ancho - 1) {
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




