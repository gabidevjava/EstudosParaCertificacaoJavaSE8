public class TestaExceptions {
	
	public static void main(String [] args) {
	
		String nome = null;
		
		try {
			nome.toLowerCase();		
		} catch(NullPointerException ex){
			System.out.println("peguei a exception");		
		}
		
		System.out.println("terminei");
		
	}

}
