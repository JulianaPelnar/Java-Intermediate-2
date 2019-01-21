package Models;

public class Main {

	public static void main(String[] args) {
		ArrayListCustom<Double>  list = new ArrayListCustom<Double>();
		list.add(7.5);
		list.add(6.5);
		list.add(5.5);
		list.add(4.5);
		list.add(3.5);
		list.add(2.5);
		System.out.println(list.getList()[1].toString());
		System.out.println(list.toString());
		list.remove(3.5);
		System.out.println(list.toString());
		int i;
		for(i =0; i < list.getList().length; i++) {
			System.out.println(list.getList()[i]);
		}
	}

}
