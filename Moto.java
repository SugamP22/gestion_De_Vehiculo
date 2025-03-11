
public class Moto extends Vehiculo {
	private boolean casco;

	Moto(String nombre, int estadoAceleracion, boolean casco) {
		super(nombre, estadoAceleracion);
		this.casco = casco;
	}

	public boolean isCasco() {
		return casco;
	}

	public void setCasco(boolean casco) {
		this.casco = casco;
	}

	@Override
	void mostrarInfo() {

		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return super.toString() + "Moto [casco=" + casco + "]";
	}

}
