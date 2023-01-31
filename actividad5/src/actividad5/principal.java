package actividad5;

import java.util.Scanner;

public class principal {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        double length;
        String operation;
        
		while (true) {
		System.out.println("1. Trabajar con un círculo");
		System.out.println("2. Trabajar con un cuadrado");
		System.out.println("3. Salir");
		System.out.print("Escoge una opción: ");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		
		case 1:
		System.out.println("Ingresa el radio del círculo: ");
	    length = scanner.nextDouble();
	    System.out.println("¿Qué operación deseas realizar? ¿perímetro, área o circunferencia? : ");
        operation = scanner.next();
        circulo crql = new circulo ((double) length);
        if (operation.equals("circunferencia")) {
            System.out.println("La circunferencia del círculo es: " + crql.calcularCircunferencia());
        } else if (operation.equals("área")) {
            System.out.println("El área del círculo es: " + crql.calcularArea());
        } else {
            System.out.println("Operación inválida para un círculo");
        }
		break;
		
		case 2:
		System.out.println("Ingresa el lado del cuadrado: ");
		length = scanner.nextDouble();
		System.out.println("¿Qué operación deseas realizar? ¿perímetro, área o circunferencia? : ");
        operation = scanner.next();
        cuadrado cuadra = new cuadrado ((double) length);
        if (operation.equals("diagonal")) {
            System.out.println("La diagonal del cuadrado es: " + cuadra.calcularDiagonal());
        } else if (operation.equals("perímetro")) {
            System.out.println("El perímetro del cuadrado es: " + cuadra.calculaPerimetroCuadrado());
        } else if (operation.equals("área")) {
            System.out.println("El área del cuadrado es: " + cuadra.calcularAreaCuadrado());
        } else {
            System.out.println("Operación inválida para un cuadrado");
        }
		break;
		
		case 3:
		System.out.println("Exiting...");
		System.exit(0);
		break;
		default:
		System.out.println("Invalid choice. Please enter a valid choice.");
		break;
		}
		}
    }
}
