import java.util.ArrayList;
import java.util.Iterator;

public class GestionarVehiculo {
	private ArrayList<Vehiculo>vehiculo;
	private int contadorCOche = 0;
	private int contadorMoto = 0;

	public GestionarVehiculo() {
		this.vehiculo = new ArrayList<>();
	}

	
	public int getContadorCOche() {
		return contadorCOche;
	}

	public void setContadorCOche(int contadorCOche) {
		this.contadorCOche = contadorCOche;
	}

	public int getContadorMoto() {
		return contadorMoto;
	}

	public void setContadorMoto(int contadorMoto) {
		this.contadorMoto = contadorMoto;
	}

	boolean agregarVehiculo(Vehiculo v) {
		
		return vehiculo.add(v);
	}

	boolean eliminarVehiculo(String nombre) {
		if(vehiculo.isEmpty()) return false;
		Iterator<Vehiculo> it = vehiculo.iterator();
		while (it.hasNext()) {
			Vehiculo v1 = it.next();
			if (v1.getNombre().equalsIgnoreCase(nombre)) {
				if(v1 instanceof Coche) {
					contadorCOche--;
				}else {
					contadorMoto--;
				}
				it.remove();
				return true;
			}
		}
		return false;
	}

	int ContadorVehiculo() {

		if (vehiculo.isEmpty()) {
			return 0;
		} else {
			for (Vehiculo v : vehiculo) {
				if (v instanceof Coche) {
					contadorCOche++;
				} else {
					contadorMoto++;
				}

			}
			return contadorCOche + contadorMoto;
		}
	}

	void mostrarInfo() {
		if (vehiculo.isEmpty()) {
			System.out.println("La lista no tiene ningun vehivulo registrado!!");
			
		} else {
			for (Vehiculo v : vehiculo) {
				if (v instanceof Coche) {
					Coche coche = (Coche) v;
					coche.mostrarInfo();
				} else {
					Moto moto = (Moto) v;
					moto.mostrarInfo();
				}
			}
		}
	}

}
