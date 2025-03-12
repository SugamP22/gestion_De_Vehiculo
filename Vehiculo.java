public abstract class Vehiculo {
	protected String nombre;
	protected int garantia;

	Vehiculo(String nombre, int garantia) {
		this.nombre = nombre;
		this.garantia = garantia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", garantia=" + garantia ;
	}
	
}
