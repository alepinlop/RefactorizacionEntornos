/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refactorizacionentornos;

/**
 *
 * @author aleja
 */
public class Calculadora {
    public void calcular() {
        sumar(5, 10);
        multiplicar(15, 20);
    }

    private void sumar(int a, int b) {
        int suma = a + b;
        System.out.println("Suma: " + suma);
    }

    private void multiplicar(int a, int b) {
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion);
    }
}