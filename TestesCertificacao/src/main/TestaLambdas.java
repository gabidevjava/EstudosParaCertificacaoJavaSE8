package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Pessoa {
	
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String toString() {
		return nome;
	}
	
}

/*@FunctionalInterface
interface Matcher<T> {
	
	boolean test(T t);
	
}*/

class FiltradorDePessoas {
	
	List<Pessoa> filtra(List<Pessoa> todas, Predicate<Pessoa> matcher) {
		
		List<Pessoa> resultado = new ArrayList<Pessoa>();
		
		for(Pessoa pessoa : todas) {
			if(matcher.test(pessoa))
				resultado.add(pessoa);
		}
		
		return resultado;
	}
}

public class TestaLambdas {
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("Gabriela", 22),
				new Pessoa("José", 33)); 
		
		/*Predicate<Pessoa> criterio = p -> p.idade >= 18;*/
		
		
/*		Predicate<Pessoa> criterio = new Predicate<Pessoa>() {
			
			@Override
			public boolean test(Pessoa pessoa) {
				return pessoa.idade >= 18;
			}
			
		};*/
		
		FiltradorDePessoas filtrador = new FiltradorDePessoas();
		List<Pessoa> resultado = filtrador.filtra(pessoas, p -> p.idade >= 18);
		System.out.println(resultado);
		
/*		Predicate<Pessoa> p = new Predicate<Pessoa>() {
			public boolean test(Pessoa p) {
				return p.idade >= 18;
			}
			
		};*/
		
	}

}
