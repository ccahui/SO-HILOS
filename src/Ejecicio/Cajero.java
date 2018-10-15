package Ejecicio;

public class Cajero implements Runnable{
	private Cliente cliente;

	public Cajero(Cliente cliente) {

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
		System.out.println("CAJERO atencion INICIO: Cliente "+cliente.getId() + " tiempo de caja --> "+cliente.getTiempoCaja()+"\t hilo "+Thread.currentThread().getName() ); 
			esperarSegundos(cliente.getTiempoCaja());
		System.out.println("Cajero atencion    FIN: Cliente "+cliente.getId() +"\t hilo "+Thread.currentThread().getName());

		Cliente.clientesTotales.desencolar();
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


