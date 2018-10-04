
public class Cliente {
	
	private String nombre;
	private int tiempo;
	
	public Cliente(int tiempo) {
		nombre = "Cliente";
		this.tiempo = tiempo;
	}
	
	public Cliente(String nombre,int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	@Override
	public String toString() {
		return nombre+" "+tiempo;
		
	}
	public String getNombre() {
		return nombre;
	}
	public int getTiempo (){
		return tiempo;
	}
	

}
