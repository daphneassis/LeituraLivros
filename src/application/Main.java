package application;

import entities.Livro;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa[] p = new Pessoa[3];
		Livro[] l= new Livro[3];
		
		p[0]= new Pessoa("Ana", 34, 'f');
		p[1]= new Pessoa("Márcia", 38, 'f');
		p[2]= new Pessoa("Ricardo", 31, 'm');
		l[0]= new Livro("Assassinato", "Agatha", 293, p[0]);
		l[1]= new Livro("Revanche", "Sydney", 591, p[1]);
		l[2]= new Livro("Morte no Nilo", "Rudpolph", 300, p[2]);
		
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
		
		l[0].abrir();
		l[0].folhear(20);
		System.out.println(l[0].detalhes());

		
	}

}
