package com.netshoes.exercise01;

public class Test implements Runnable {

	public void run() {
		System.out.println("Qual � a musica?");
		throw new RuntimeException("Opa, temos um problema! ");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Test());
		t.start();
		System.out.println("Executou o Final do M�todo.");
	}
}


// - Explique com suas palavras o que acontece quando o c�digo acima � executado.

/* RESPOSTAS
 * � criado na mem�ria stack uma ref�ncia t para um objeto Thread na mem�ria heap
 * que instancia a classe Test que implmenta a interface Runnable, a refer�ncia t executa o m�todo start() 
 * chamando o m�todo run() da classe Test que foi sobrescrito de Runnable. Nele, � exibido no console a mensagem 
 * Qual � a musica? seguida da mensagem Executou o Final do M�todo seguido da exce��o disparada
 */ 
