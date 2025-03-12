
import java.util.ArrayList;
import java.util.Iterator;

public class GestionarVehiculo {
	private ArrayList<Vehiculo> v1;
	private int numeroCoche = 0;
	private int numeroMoto = 0;

	public GestionarVehiculo() {
		this.v1 = new ArrayList<Vehiculo>();
	}

	public int getNumeroCoche() {
		return numeroCoche;
	}

	public void setNumeroCoche(int numeroCoche) {
		this.numeroCoche = numeroCoche;
	}

	public int getNumeroMoto() {
		return numeroMoto;
	}

	public void setNumeroMoto(int numerMoto) {
		this.numeroMoto = numerMoto;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {

		v1.add(vehiculo);
		if(vehiculo instanceof Coche) {
			numeroCoche++;
		}else {
			numeroMoto++;
		}
		
	

	}

	public boolean eliminarVehiculo(String nombre) {
		if (v1.isEmpty()) {
			return false;
		} else {
			Iterator<Vehiculo> it = v1.iterator();
			while (it.hasNext()) {
				Vehiculo vehiculo = it.next();// casting
				if (vehiculo.getNombre().equalsIgnoreCase(nombre)) {
					if (vehiculo instanceof Coche) {
						numeroCoche--;
					} else {
						numeroMoto--;
					}
					it.remove();
					return true;

				}
			}
			return false;
		}
	}

	public int numeroTotal() {
		
		return numeroCoche + numeroMoto;
	}

	public void listarVehiculo() {
		if (v1.isEmpty()) {
			System.out.println("No hay ningun vehiculo registrado!!");

		} else {
			for (Vehiculo vehiculo : v1) {
				if (vehiculo instanceof Coche) {
					Coche coche = (Coche) vehiculo;// casting subclass para usar su metodo
					coche.mostrarInfo();
				} else {
					Moto moto = (Moto) vehiculo;
					moto.mostrarInfo();
				}
			}
		}
	}
}
