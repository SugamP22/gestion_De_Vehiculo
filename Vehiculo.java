  abstract class Vehiculo {
	protected String nombre;
	protected int estadoAceleracion;

	Vehiculo(String nombre, int estadoAceleracion) {
		this.nombre = nombre;
		setEstadoAceleracion(estadoAceleracion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstadoAceleracion() {
		return estadoAceleracion;
	}

	public void setEstadoAceleracion(int estadoAceleracion) {
		if (estadoAceleracion > 200) {
			this.estadoAceleracion = 200;
		} else if (estadoAceleracion < 20) {
			this.estadoAceleracion = 20;
		} else {
			this.estadoAceleracion = estadoAceleracion;
		}
	}
	
	

	

	abstract void mostrarInfo();

	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", estadoAceleracion=" + estadoAceleracion + "]";
	}
	
}
