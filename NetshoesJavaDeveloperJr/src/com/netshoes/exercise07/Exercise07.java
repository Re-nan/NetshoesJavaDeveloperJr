package com.netshoes.exercise07;

public class Exercise07 {

	public static void main(String[] args) {
		Big b = new Big();
		b.name = "a";
	}
	
}
/*  Dado o c�digo abaixo:
 *  
 *  package com;
 *  
 *  class Big {
 * 	  public String name = "hello";
 *  }
 * 
 * Quem pode acessar e alterar a vari�vel desta classe? Justifique sua resposta.
 * a) Qualquer classe pode instanciar e alterar a vari�vel name
 * b) Qualquer classe dentro do mesmo package
 * c) Qualquer classe que chame o m�todo setName(String name)
 * 
 * Justifique:
 */

/* RESPOSTAS
 * A - qualquer classe pode alterar o valor da vari�vel desde que importe o
 * pacote e instancie/herde a classe, e altere a variavel dentro de um bloco 
 * de um m�todo
 * 
 */

