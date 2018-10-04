package Ejecicio;

public class Cola<T> {

	private Nodo<T> header;
	private Nodo<T> fin;
	private int size;

	public Cola() {
		header = null;
		fin = null;
		size = 0;
	}
	public boolean isEmpty() {
		return header == null;
	}

	public void encolar(T data) {
		Nodo<T> nuevo = new Nodo<T>(data);
		if (header == null) {
			header = nuevo;
		} else {
			fin.setNext(nuevo);
		}
		fin = nuevo;
		size++;
	}

	public T desencolar() {
		if (header != null) {
			size--;
			T data = header.getData();
			if (header == fin) {
				header = null;
				fin = null;
			} else {
				header = header.getNext();
			}
			return data;
		}
		return null;
	}

	public int size() {
		return size;
	}

	public static void main(String args[]) {
		Cola<Integer> a = new Cola<Integer>();
		a.encolar(5);
		System.out.println(a.desencolar());
		System.out.println(a.desencolar());
		System.out.println(a.desencolar());
		System.out.println(a.desencolar());
		System.out.println(a.fin);
		a.encolar(4);
		System.out.println(a.size);

	}
}
