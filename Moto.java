
public class Moto extends Vehiculo implements MetodoVehiculo {
	private boolean casco;

	Moto(String nombre, int garantia, boolean casco) {
		super(nombre, garantia);
		this.casco = casco;
	}

	public boolean isCasco() {
		return casco;
	}

	public void setCasco(boolean casco) {
		this.casco = casco;
	}

	@Override
	public String toString() {
		return super.toString() + ", Tipo=moto, casco=" + casco + "]";
	}

	@Override
	public void mostrarInfo() {
		System.out.println(this.toString());
		
	}

}
