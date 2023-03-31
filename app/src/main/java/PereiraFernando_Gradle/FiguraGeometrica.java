/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PereiraFernando_Gradle;

/**
 *
 * @author fernando
 */

// Funciones para calcular las areas de las funciones geométricas

public class FiguraGeometrica {

    /**
     * Calcula el area del circulo
     * 
     * @param radio El radio del circulo
     * @return El área del circulo
     */
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    
    /**
     * Calcula el area del rectangulo
     * 
     * @param base La base del rectangulo
     * @param altura La altura del rectangulo
     * @return El área del rectangulo
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }
    
    /**
     * Calcula el area del triangulo
     * 
     * @param base La base del triangulo
     * @param altura La altura del triangulo
     * @return El área del triangulo
     */
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    /**
     * Calcula el area del cuadrado
     * 
     * @param lado El lado del cuadrado
     * @return El área del cuadrado
     */
    public static double areaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }
    
    /**
     * Calcula el area del trapecio
     * 
     * @param baseMayor La base mayor del trapecio
     * @param baseMenor La base menor del trapecio
     * @param altura La altura del trapecio
     * @return  El área del trapecio
     */
    public static double areaTrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
}
