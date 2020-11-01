package ejercicio_3_objetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_objetos {

	public static void main(String[] args) {

		boolean ciclo = true;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			int lado = 0;

			System.out.println(" ========================================================== ");
			System.out.println(" Men� principal");
			System.out.println(" Introducir la longitud de uno de los lados de la figura");
			System.out.println(" ========================================================== ");

			// Se lee la opcion que selecciono el usuario
			try {
				lado = Integer.parseInt(reader.readLine());
				ciclo = menuCalculo(lado);
			} catch (NumberFormatException e1) {
				System.out.println("Favor de introducir un numero");
			} catch (IOException e1) {
				System.out.println("Erro en la lactura del valor. El programa se termino.");
				return;
			}
		} while (ciclo);
	}

	public static boolean menuCalculo(int lado) {
		Cubo cubo = new Cubo();
		Cuadrado cuadrado = new Cuadrado();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean menu_calculo = true;
		do {
			int opcion = 0;

			System.out.println(" ========================================================== ");
			System.out.println(" Men� Calculo");
			System.out.println(" 1) Calcular el Area de un Cuadrado");
			System.out.println(" 2) Calcular el Perimetro de un Cuadrado");
			System.out.println(" 3) Calcular el Volumen de un Cubo");
			System.out.println(" 4) Calcular el Perimetro de un Cubo");
			System.out.println(" 5) Regresar al men� principal");
			System.out.println(" 6) Salir del programa");
			System.out.println(" ========================================================== ");

			// Se lee la opcion que selecciono el usuario
			try {
				opcion = Integer.parseInt(reader.readLine());
			} catch (IOException e1) {
				System.out.println("Erro en la lactura del valor. El programa se termino.");
				return false;
			}
			switch (opcion) {
			case 1:
				System.out.println("Resultado: " + cuadrado.calcularArea(lado));
				menu_calculo = menuResultado();
				break;
			case 2:
				System.out.println("Resultado: " + cuadrado.calcularPerimetro(lado));
				menu_calculo = menuResultado();
				break;
			case 3:
				System.out.println("Resultado: " + cubo.calcularVolumen(lado));
				menu_calculo = menuResultado();
				break;
			case 4:
				System.out.println("Resultado: " + cubo.calcularPerimetro(lado));
				menu_calculo = menuResultado();
				break;
			case 5:
				menu_calculo = false;
				break;
			case 6:
				System.out.println("El programa se termino");
				return false;
			default:
				System.out.println("Favor de seleccionar una de las opciones del men�");
			}

		} while (menu_calculo);
		return true;
	}

	public static boolean menuResultado() {
		boolean menu_resultado = true;
		boolean regreso = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			int opcion = 0;
			System.out.println(" ========================================================== ");
			System.out.println(" Men� de Resultados");
			System.out.println(" 1) Regresar al men� de calculos");
			System.out.println(" 2) Regresar al men� inicial (Volver a ingresar el valor del lado)");
			System.out.println(" ========================================================== ");
			// Se lee la opcion que selecciono el usuario
			try {
				opcion = Integer.parseInt(reader.readLine());
			} catch (IOException e1) {
				System.out.println("Erro en la lactura del valor. El programa se termino.");
				return false;
			}	
			switch (opcion) {
			case 1:
				menu_resultado = false;
				regreso = true;
				break;
			case 2:
				menu_resultado = false;
				regreso = false;
				break;
				default:
					System.out.println("Favor de introduccir una opci�n valida");
			}
			
		} while (menu_resultado);
		return regreso;
	}
}
