/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ledesma 
 */
public class Calculadora {

    // Métodos para dos parámetros
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    // Sobrecarga de métodos para tres parámetros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    // Sobrecarga de métodos para cuatro parámetros
    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int restar(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Pruebas con dos parámetros
        System.out.println("Suma (2 parametros): " + calc.sumar(1, 2));
        System.out.println("Resta (2 parametros): " + calc.restar(5, 3));
        System.out.println("Multiplicacion (2 parametros): " + calc.multiplicar(2, 4));
        System.out.println("Division (2 parametros): " + calc.dividir(10, 2));

        // Pruebas con tres parámetros
        System.out.println("Suma (3 parametros): " + calc.sumar(1, 2, 3));
        System.out.println("Resta (3 parametros): " + calc.restar(10, 3, 2));
        System.out.println("Multiplicacion (3 parametros): " + calc.multiplicar(2, 3, 4));

        // Pruebas con cuatro parámetros
        System.out.println("Suma (4 parametros): " + calc.sumar(1, 2, 3, 4));
        System.out.println("Resta (4 parametros): " + calc.restar(20, 5, 3, 2));
        System.out.println("Multiplicacion (4 parametros): " + calc.multiplicar(2, 2, 2, 2));
    }
}
