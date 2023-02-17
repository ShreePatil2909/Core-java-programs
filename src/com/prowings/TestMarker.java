package com.prowings;

class Demo implements Deletable {

}

class Test extends Demo {

}

public class TestMarker {

	public static void main(String[] args) {

		String s = new String();
		Demo d = new Demo();
		TestMarker tm = new TestMarker();
		Test t = new Test();
//		delete(d);
		delete(t);
//		delete(s);

	}

	public static boolean delete(Object ob) {
		if (ob instanceof Deletable) {
			System.out.println("Delete success ");
			return true;
		} else {
			System.out.println("Not Delete ");
			return false;
		}
	}
}
