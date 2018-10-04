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
		
		System.out.println("Eleccion de Productos" + Thread.currentThread().getName()+" Eligiendo Cliente "+cliente.getId() + " tiempo --> "+cliente.getTiempoProducto()); 
			esperarSegundos(cliente.getTiempoProducto());
		System.out.println("Eleccion de Productos" +Thread.currentThread().getName()+" Finaliza eleccion Cliente "+cliente.getId());
		
		Cliente.clientesTotales.encolar(cliente);
	}
	public void esperarSegundos(int segundos) {	
		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}


