/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author ProfDiurno
 */
public class Factorial {

    public static int calculo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo o 0");
        }

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        if (fact < 0) {
            throw new ArithmeticException("Overflow");
        }
        return fact;
    }
}
