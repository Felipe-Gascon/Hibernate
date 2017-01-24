import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int ID;
	private Date fecha;
	private List<Item> items = new ArrayList<Item>();
	public Pedido(){
		
	}
	public Pedido(int iD, Date fecha) {
		super();
		ID = iD;
		this.fecha = fecha;
		
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
