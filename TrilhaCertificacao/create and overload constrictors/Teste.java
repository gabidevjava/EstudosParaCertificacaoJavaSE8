public class Teste {
	
	public static void main(String[] args) {
		
		void desativa(Cliente... clientes) {
    	System.out.println("varargs");
}
		void desativa() {
    	System.out.println("sem argumento");
}
		void metodo() {
    	desativa(); // imprime sem argumento
}
	
	} 

}
