package com.netshoes.exercise08;

public class TryCatchExamples {
	public static void main(String[] args) {
		try {
			String name = null;
			boolean result = name.isEmpty();
			System.out.println(result);
		} catch (NullPointerException e1) {
			System.out.print("deu nullPointer");
			fazAlgumaCoisa();
		} finally {
			System.out.println("Sempre executa independnete de cair no catch ou não");
		}

	}
	
	public static void fazAlgumaCoisa() {
		System.out.println("\nFazendo alguma coisa pq deu nullPointer");
	}
}

/* - Explique com suas palavras o que é NullPointerException?
 * - Insira um código que lance NullPointerException na linha 6
 * - Insira um código após o catch que sempre será executado, mesmo que o método 
 * fazAlgumaCoisa lance exception
 */

/* NullPointerException é uma exceção que ocorre quando o compilador tenta acessar um
 * espaço na memória heap que ainda não foi inicializado
 */
 
