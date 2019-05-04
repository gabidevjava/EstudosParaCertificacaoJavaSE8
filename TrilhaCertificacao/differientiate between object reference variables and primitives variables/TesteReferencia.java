class B {

int v = 15;

}

public class TesteReferencia {

	public static void main(String[] args) {
	
		B x = new B();
		B y = x;
		System.out.println("x " + x + " y " + y);
		y.v++;
		System.out.println(y.v);
		x.v++;
		System.out.println(x.v);
		B z = y;
		z.v--;
		System.out.println(z.v);
		System.out.println(x.v + y.v + z.v);
	
	}

}
