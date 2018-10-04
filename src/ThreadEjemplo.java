
public class ThreadEjemplo extends Thread {

	public ThreadEjemplo(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i = 0;i < 5; i++) {
 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Nombre "+getName()+" Time "+System.currentTimeMillis());
			
			
			}
		System.out.println("Termino Hilo "+getName());
	}
	public static void main(String args []) {
		
		Thread a = new ThreadEjemplo("Primero");
		Thread b = new ThreadEjemplo("Segundo");
	
		a.start();
		b.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Termino MAIN");
	}
}
