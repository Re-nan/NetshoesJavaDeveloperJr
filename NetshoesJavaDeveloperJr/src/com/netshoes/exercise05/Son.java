package com.netshoes.exercise05;

public class Son extends Father {
	private Son() {
		super("Father ");
		new Father("Son ");
	}

	public static void main(String[] args) {
		new Son();
	}
}			

/*
public class Man {
 	Man() {
 		System.out.print("Man ");
 	}
 }

 public class Father extends Man {
 	Father(String type) {
 		System.out.print(type);
 	}
 }

 public class Son extends Father {
 	Son() {
 	super("Father ");
 	new Father("Son ");
 }

 public static void main(String[] args){
 	new Son();
 }
 
*/

//- Explique com suas palavras o que acontece quando a linha 29 é executada.
//- O que aconteceria se a classe Son tivesse apenas um construtor privado?

/* RESPOSTAS
 * É chamado o contrutor da Classe Pai Father passando "Father" como parametro
 * e exibido "Father" no console
 *   
 * Não mudaria nada na execução, pois mesmo estando como private o construtor pode 
 * ser utilizado em qualquer lugar dentro da sua classe
 */ 