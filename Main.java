import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sl = new Scanner(System.in);
	private static GestionarVehiculo gestionar = new GestionarVehiculo();
	private static Vehiculo v1;

	public static void main(String[] args) {
		int opcion = 0;
		do {
			menu();
			try {
				opcion = sc.nextInt();
				switchMain(opcion);
			} catch (InputMismatchException e) {
				System.out.println("🚩🚩  Entrada Invalida Ingresa numero!!  🚩🚩");
				sc.next();
			}
		} while (opcion != 5);
		System.out.println("😊😊Gracias por su participcion....😊😊");
	}

	private static void switchMain(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("||  Agregar Vehiculo   ||");
			agregarVehiculo();
			break;
		case 2:
			System.out.println("||  Eliminar Vehiculo  ||");
			eliminarVehiculo();

			break;
		case 3:
			System.out.println("||  Mostrar estadísticas(NumerosDEVehiculo)  ||");
			numeroTotal();
			break;
		case 4:
			System.out.println("||  listar Vehiculos ||");
			mostrarinfoVehiculo();
			break;
		case 5:
			System.out.println("Saliendo....");
			break;
		default:
			System.out.println("!!  Ingresa un numero entre 1 y 5  !!");
			break;
		}

	}

	private static void mostrarinfoVehiculo() {
		gestionar.mostrarInfo();
			
		
	}

	private static void numeroTotal() {
		if (gestionar.ContadorVehiculo() == 0) {
			System.out.println("La lista no tiene ningun vehivulo rehistrado!!");

		} else {
			System.out.printf("Numero Total de Vehiculo es %d",
					gestionar.getContadorCOche() + gestionar.getContadorMoto());
			System.out.printf("Numero Total de Coche es %d", gestionar.getContadorCOche());
			System.out.printf("Numero Total de Moto es %d", gestionar.getContadorMoto());
		}

	}

	private static void eliminarVehiculo() {
		System.out.print("Introduce un nombre:");
		String nombre = sl.nextLine();
		if (gestionar.eliminarVehiculo(nombre)) {
			System.out.println("!! Vehiculo eliminado con exito !!");
		} else {
			System.out.println("!! Nombre no coincide coon ningun Vehiculo !!");
		}

	}

	private static void agregarVehiculo() {
		boolean flag = false;
		while (!flag) {
			System.out.println("Introduce un nombre del Vehiculo");
			String nombre = sl.nextLine();
			System.out.println("Introduce el Velocidad Actual");
			int velocidad = sc.nextInt();
			System.out.println("QUe tipo de Vehiculo quieres introducir:");
			System.out.println("1. Coche");
			System.out.println("2. Moto");
			System.out.print(">>>>>>>>>>");
			try {
				int opcion = sc.nextInt();
				System.out.println("=======================");
				if (opcion < 1 || opcion > 2) {
					throw new IllegalArgumentException("Ingresa un numero entre 1 y 2");
				} else {
					if (opcion == 1) {
						System.out.println("Introduce el numero de puertas:");
						int puertas = sc.nextInt();
						v1 = new Coche(nombre, velocidad, puertas);
						if (gestionar.agregarVehiculo(v1)) {
							System.out.println("!! Vehiculo agregado con exito !!");
						} else {
							System.out.println("Tuvo un problema al hora del agregar Vehiculo");
						}
						flag = true;

					} else {
						System.out.println("¿Tienes casco(Sí/NO)?");
						boolean casco = sl.next().equalsIgnoreCase("Sí");
						v1 = new Moto(nombre, velocidad, casco);
						if (gestionar.agregarVehiculo(v1)) {
							System.out.println("!! Vehiculo agregado con exito !!");
						} else {
							System.out.println("Tuvo un problema al hora del agregar Vehiculo");
						}
						flag = true;

					}
				}

			} catch (InputMismatchException e) {
				System.out.println("Entrada invalido");
				sc.next();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

		}

	}

	private static void menu() {
		System.out.println("::::: Menú Principal :::::");
		System.out.println("******************************");
		System.out.println("1. Agregar Vehiculo ");
		System.out.println("2. Eliminar Vehiculo");
		System.out.println("3. Mostrar estadísticas(NumerosDEVehiculo)");
		System.out.println("4. listar Vehiculos");
		System.out.println("5. Salir ");
		System.out.print(">>>>>>>>>>");
	}
}
