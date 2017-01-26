import org.hibernate.Session;

public class Principal {

	public static void main(String[] args) {
		
		Session session = HibernateUtilities.getSessionFactory().openSession();		
		
		session.beginTransaction();
		
		Pedido p = new Pedido();
		
		p.getItems().add(new Item(1, "Galletas", 22));
		p.getItems().add(new Item(2, "Jamones", 20));
		p.getItems().add(new Item(3, "Yerba", 33));
		session.save(p);
		
		
		
		session.getTransaction().commit();	
		
		Pedido p2=session.get(Pedido.class,1);
		System.out.println("Hemos recuperado el pedido con ID:"+p2.getID());
		
		for(Item items:p2.getItems()){
			System.out.println("Obtengo: "+items.getNombre()+" Cantidad: "+items.getCantidad());
		}
		session.close();
		HibernateUtilities.getSessionFactory().close();

	}

}
