
public class Cajero extends Thread {

	private String nombre;
	private Cliente cliente;
	public Cajero(String nombre,Cliente cliente) {
		this.nombre = nombre;
		this.cliente = cliente;
	}
	public void run() {
		
		System.out.println("Atendiendo ... "+cliente.getNombre());
			esperar(cliente.getTiempo());
		System.out.println("Terminando ... "+cliente.getNombre());
		
	}
	public void esperar(int segundos) {
		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getNombre() {
		return nombre;
	}
	public static void main(String []args) {

		Cliente cli = new Cliente("Cliente01",2) ;
		Cliente cli2 = new Cliente("CLiente02",1);
		
		Cajero caj = new Cajero("Cajero01",cli);
		Cajero caj2 = new Cajero("Cajero02",cli2);

		
		caj.start();
		caj2.start();
	}
	
}
