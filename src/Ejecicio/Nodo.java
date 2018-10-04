package Ejecicio;

public class Nodo<T> {

	private Nodo<T> next;
	private T data;
	
	
	public Nodo(Nodo<T> next, T data) {
		super();
		this.next = next;
		this.data = data;
	}
	public Nodo(T data) {
		this(null,data);
	}
	public Nodo<T> getNext() {
		return next;
	}
	public void setNext(Nodo<T> next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
