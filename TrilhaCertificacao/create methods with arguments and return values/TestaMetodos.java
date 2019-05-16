class A {
    void nada(int i) {
        if(i >= 0) {
            return;

            // não compila, pois nunca chegará aqui
            System.out.println("era positivo ou zero"); 
        }
        System.out.println("negativo");
    }
}

public class TestaMetodos {

	public static void main(String[] args) {
		
	
	}


}
