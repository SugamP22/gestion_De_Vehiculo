
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);// para numeros
	private static Scanner sl = new Scanner(System.in);// para letras
	private static GestionarVehiculo gestion = new GestionarVehiculo();

	public static void main(String[] args) {
		int opcion = 0;
		do {
			menu();

			try {
				opcion = sc.nextInt();
				switchMain(opcion);
			} catch (Exception e) {
				System.out.println("!! Entrada Invalido😒😒😒😒 !!");
				sc.next();
			}
		} while (opcion != 5);
		System.out.println("Gracias Por su Participación!!");
	}

	private static void switchMain(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("|*|  Agregar Vehiculo  |*|");
			agregarVehiculo();
			break;
		case 2:
			System.out.println("|*|  Eliminar Vehiculo  |*|");
			emiminarVehiculo();
			break;
		case 3:
			System.out.println("|*|  Total numero de Vehiculo  |*|");
			calcularNumero();
			break;
		case 4:
			System.out.println("|*|  listar Vehiculo  |*|");
			ListarVehiculo();
			break;
		case 5:
			System.out.println("|*|  Saliendo....  |*|");
			break;
		default:
			System.out.println("|*| Ingresa un numero entre(1-5) S|*|");
			break;
		}

	}

	private static void ListarVehiculo() {
		gestion.listarVehiculo();
	}

	private static void calcularNumero() {
		System.out.printf("Numero Vehiculo Total: %d\n", gestion.numeroTotal());
		System.out.printf("Numero Coche Registrado: %d\n", gestion.getNumeroCoche());
		System.out.printf("Numero Moto Registrado: %d\n", gestion.getNumeroMoto());		

	}

	private static void emiminarVehiculo() {
		System.out.print("Introduce un nombre:");
		String nombre = sl.nextLine();
		if (gestion.eliminarVehiculo(nombre)) {
			System.out.println("!!  Eliminado con exito😊😊  !!");
		} else {
			System.out.println("!! El nombre noo coincide con ninguno Vehiculo registrado !!");
		}

	}

	private static void agregarVehiculo() {
		boolean flag = false;
		while (!flag) {
			menu2();
			try {
				int opcion = sc.nextInt();
				if (opcion < 1 || opcion > 2) {
					throw new IllegalArgumentException("😍😍 Ingresa un numero entres  [1 y 2] 😍😍");
				}
				System.out.println("Introduce un nombre vehiculo:");
				String nombre = sl.nextLine();
				System.out.println("Introduce el año de garantía:");
				int garantia = sc.nextInt();

				if (opcion == 1) {
					System.out.println("Ingresa el numero Puerta que tiene tu coche:");
					int puertas = sc.nextInt();
					gestion.agregarVehiculo(new Coche(nombre, garantia, puertas));
					flag = true;

				} else {
					System.out.println("¿Tienes Casco contigo(Sí/NO)?");
					boolean casco = sc.next().equalsIgnoreCase("Sí");
					gestion.agregarVehiculo(new Moto(nombre, garantia, casco));
					flag = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("!! Entrada Invalido !!");
				sc.next();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println("Vehiculo añadido con exito!!");

	}

	private static void menu2() {
		System.out.println("|| Elige uno tipo de Vehiculo ||");
		System.out.println("1. Coche");
		System.out.println("2. Moto");
		System.out.print(">>>>>>>>>");
	}

	private static void menu() {
		System.out.println(":::: Menú Pricipal :::::");
		System.out.println("1. Agregar Vehiculo");
		System.out.println("2. Eliminar Vehiculo");
		System.out.println("3. Calcular NumeroTotal");
		System.out.println("4. Listar Vehiculo");
		System.out.println("5. Salir");
		System.out.print(">>>>>>>>>>>>>");

	}
}
