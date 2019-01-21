package Models;

public class ArrayListCustom<T> {
	
	//  FIELDS
	private Object[] list;
	private int size;
	
	//  CONSTRUCTOR
	public ArrayListCustom() {
		this.list = new Object[2];
		this.size = list.length;
	}
	
	//  GETTERS
	public int getSize() {
		return this.size;
	}
	
	public Object[] getList() {
		return this.list;
	}
	
	//  METHOD ADD (receives generic parameter)
	public void add(T a) {
		int i = 0;
		boolean added = false;
		if(this.list[size - 1] == null) {
			for(i=0; i<this.list.length; i++) {
				if(this.list[i] == null && !added) {
					list[i] = a;
					added = true;
				}
			}
		} else {
			this.size = this.size + 2;
			Object[] list1 = new Object[this.size];
			for (i = 0; i < this.list.length; i++) {
				list1[i] = list[i];
			}
			for(i=0; i<list1.length; i++) {
				if(list1[i] == null && !added) {
					list1[i] = a;
					added = true;
				}
			}
			this.list = list1;
		}
	}
	

	@SuppressWarnings("unchecked")
	public T get(int a) {
		try {
			return (T) this.list[a];
		}
		catch(RuntimeException e) {
			System.out.println("El número ingresado es mayor a la cantidad de elementos existentes en el array.");
		}
		return null;
	}
	
	public void remove(int a) {
		try {
			this.list[a] = null;
			System.out.println("El elemento se ha eliminado correctamente");
		}
		catch(RuntimeException e) {
			System.out.println("El número ingresado es mayor a la cantidad de elementos existentes en el array.");
		}
	}
	
	public String getObject(int i) {
		String s = this.list[i].toString();
		return s;
	}
	
	@Override
	public String toString() {
		String s = new String();
		int i;
		for(i = 0; i< this.list.length; i++) {
			if(this.getList()[i] != null) {
				s = s + "" + this.getList()[i] + " ; ";
				//s = s.concat(String.valueOf(this.getObject(i)) + " ; ");	
			}
		}
		return s;
	}
	
	public void remove(T t) {
		int i;
		for(i = 0; i < this.list.length ; i++) {
			if(this.getList()[i].equals(t)) {
				this.getList()[i] = null;
				System.out.println("El objeto fue encontrado y eliminado.");
			}
		}
	}
}
