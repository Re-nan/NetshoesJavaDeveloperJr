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
			System.out.println("Sempre executa independnete de cair no catch ou n�o");
		}

	}
	
	public static void fazAlgumaCoisa() {
		System.out.println("\nFazendo alguma coisa pq deu nullPointer");
	}
}

/* - Explique com suas palavras o que � NullPointerException?
 * - Insira um c�digo que lance NullPointerException na linha 6
 * - Insira um c�digo ap�s o catch que sempre ser� executado, mesmo que o m�todo 
 * fazAlgumaCoisa lance exception
 */

/* NullPointerException � uma exce��o que ocorre quando o compilador tenta acessar um
 * espa�o na mem�ria heap que ainda n�o foi inicializado
 */
 
