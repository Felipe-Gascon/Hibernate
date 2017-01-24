
public class Item {

	//private int ID;
	private String nombre;
	private int cantidad;
	
	public Item(){
		
	}
	public Item (String nombre, int cantidad) {
		
		
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
/*	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	/*public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + cantidad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (ID != other.ID)
			return false;
		if (cantidad != other.cantidad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	*/
	
	
}
