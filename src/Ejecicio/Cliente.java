package Ejecicio;

import java.util.ArrayList;

public class Cliente {
public static Cola<Cliente> clientesTotales = new Cola<Cliente>();
	private int id;
	private int tiempoCaja;
	private int tiempoProducto;
	
	public Cliente(int id,int tiempoCaja,int tiempoProducto) {
		this.id = id;
		this.tiempoCaja = tiempoCaja;
		this.tiempoProducto = tiempoProducto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getTiempoCaja() {
		return tiempoCaja;
	}

	public void setTiempoCaja(int tiempo) {
		this.tiempoCaja = tiempo;
	}
	public int getTiempoProducto() {
		return tiempoProducto;
	}

	public void setTiempoProducto(int tiempo) {
		this.tiempoProducto = tiempo;
	}
	@Override
	public String toString() {
		return "Cajero "+id+" TiempoCaja"+tiempoCaja+" TiempoProducto";
	}
	
}
