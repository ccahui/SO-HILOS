package Ejecicio;

public class  ElegirProducto implements Runnable{
	private Cliente cliente;

	public ElegirProducto(Cliente cliente) {

		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public void run() {
		
		System.out.println("ELECCION de Producto INICIO: Cliente "+cliente.getId() + " tiempo de eleccion--> "+cliente.getTiempoProducto()+"\t hilo "+ Thread.currentThread().getName() ); 
			esperarSegundos(cliente.getTiempoProducto());
		System.out.println("ELECCION de    Producto FIN: Cliente "+cliente.getId());
		
		//RECURSO QUE SE ESTA COMPARTIENDO
		Cliente.clientesTotales.encolar(cliente);
	}
	
	public void esperarSegundos(int segundos) {	
		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}


