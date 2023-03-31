/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PereiraFernando_Gradle;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/*
Hecho por: Fernando José Pereira Salvador
1 DAM Presencial
EDD Proyecto Gradle
*/

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Pregunta que figura quieres calcular
            System.out.println("¿Qué figura quieres calcular?");
            // Diferentes figuras
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Cuadrado");
            System.out.println("5. Trapecio");
            
            // Introduce la opcion
            String opcion = scanner.nextLine();
            
            // Opcion 1: Círculo
            if (StringUtils.equals(opcion, "1")) {
                // Introducimos el radio
                System.out.println("Introduce el radio del círculo:");
                double radio = scanner.nextDouble();
                // Calculamos el area
                double area = FiguraGeometrica.areaCirculo(radio);
                System.out.println("El área del círculo es: " + area);
                
            // Opcion 2: Rectángulo
            } else if (StringUtils.equals(opcion, "2")) {
                // Introducimos la base del rectángulo
                System.out.println("Introduce la base del rectángulo:");
                double base = scanner.nextDouble();
                // Introducimos la altura del rectángulo
                System.out.println("Introduce la altura del rectángulo:");
                double altura = scanner.nextDouble();
                // Calculamos el area
                double area = FiguraGeometrica.areaRectangulo(base, altura);
                System.out.println("El área del rectángulo es: " + area);
                
            // Opcion 3: Triángulo
            } else if (StringUtils.equals(opcion, "3")) {
                // Introducimos la base del triángulo
                System.out.println("Introduce la base del triángulo:");
                double base = scanner.nextDouble();
                // Introducimos la altura del triángulo
                System.out.println("Introduce la altura del triángulo:");
                double altura = scanner.nextDouble();
                // Calculamos el area
                double area = FiguraGeometrica.areaTriangulo(base, altura);
                System.out.println("El área del triángulo es: " + area);
                
            // Opcion 4: Cuadrado
            } else if (StringUtils.equals(opcion, "4")) {
                // Introducimos el lado del cuadrado
                System.out.println("Introduce el lado del cuadrado:");
                double lado = scanner.nextDouble();
                // Calculamos el area del cuadrado
                double area = FiguraGeometrica.areaCuadrado(lado);
                System.out.println("El área del cuadrado es: " + area);
            
            // Opcion 5: Trapecio
            } else if (StringUtils.equals(opcion, "5")) {
                // Introducimos la base mayor del trapecio
                System.out.println("Introduce la base mayor del trapecio:");
                double baseMayor = scanner.nextDouble();
                // Introducimos la base menor del trapecio
                System.out.println("Introduce la base menor del trapecio:");
                double baseMenor = scanner.nextDouble();
                // Introducimos la altura del trapecio
                System.out.println("Introduce la altura del trapecio:");
                double altura = scanner.nextDouble();
                // Calculamos el area del trapecio
                double area = FiguraGeometrica.areaTrapecio(baseMayor, baseMenor, altura);
                System.out.println("El área del trapecio es: " + area);
            
            // Si ha introducido una opción diferente le decimos que no es válida
            } else {
                System.out.println("Opción no válida");
            }
        }
    }
}