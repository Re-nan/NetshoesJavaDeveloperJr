package com.netshoes.exercise01;

public class Test implements Runnable {

	public void run() {
		System.out.println("Qual é a musica?");
		throw new RuntimeException("Opa, temos um problema! ");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Test());
		t.start();
		System.out.println("Executou o Final do Método.");
	}
}


// - Explique com suas palavras o que acontece quando o código acima é executado.

/* RESPOSTAS
 * É criado na memória stack uma refência t para um objeto Thread na memória heap
 * que instancia a classe Test que implmenta a interface Runnable, a referência t executa o método start() 
 * chamando o método run() da classe Test que foi sobrescrito de Runnable. Nele, é exibido no console a mensagem 
 * Qual é a musica? seguida da mensagem Executou o Final do Método seguido da exceção disparada
 */ 
