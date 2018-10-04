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
		System.out.println("Cajero" + Thread.currentThread().getName()+" Atiende al cliente "+cliente.getId() + " tiempo --> "+cliente.getTiempoCaja() ); 
			esperarSegundos(cliente.getTiempoCaja());
		System.out.println("Cajero" +Thread.currentThread().getName()+" Finaliza su atencion al cliente "+cliente.getId());

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


