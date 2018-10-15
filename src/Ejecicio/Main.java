package Ejecicio;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {

	public static void main(String args[]) {
		
		ArrayList<Cliente> array = new ArrayList<Cliente>();
		int nClientes = 5;
		int nCajas = 2;
		
		Cliente cliente;
		int tiempoCaja;
		int tiempoProducto;
		
		for(int i = 0;i < nClientes; i++) {
			tiempoCaja = random(4,6);
			tiempoProducto = random(1,3);
			
			cliente = new Cliente(i,tiempoCaja,tiempoProducto);
			array.add(cliente);
		}
		
		ExecutorService executorProducto = Executors.newFixedThreadPool(nClientes);
		
		ExecutorService executorCaja = Executors.newFixedThreadPool(nCajas);
		
		for(Cliente aux:array) {
			ElegirProducto elegirProducto = new ElegirProducto(aux);
			executorProducto.execute(elegirProducto);
		}
		
		executorProducto.shutdown();
		while(!executorProducto.isTerminated() ) {
			
			if(!Cliente.clientesTotales.isEmpty()) {
				Cajero cajero = new Cajero(Cliente.clientesTotales.desencolar());
				executorCaja.execute(cajero);
			}
		}
		executorCaja.shutdown();
	}
	public static int random(int i,int j){
		int valor = (int)(Math.random()*(j-i+1) +i);
		return valor;
	}
	public static void esperarSegundos(int segundos) {	

		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
