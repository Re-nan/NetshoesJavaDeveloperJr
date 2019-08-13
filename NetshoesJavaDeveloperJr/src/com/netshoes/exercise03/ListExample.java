package com.netshoes.exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add(new Integer(12).intValue());
		lst.add(new String("Opaa"));
		lst.add(new Boolean(true));
		Arrays.sort(lst.toArray());
		for (int i = 0; i < lst	.size(); i++) {
			System.out.print(lst.get(i).toString());
		}
	}
}

/* - Este c�digo lan�a uma exception. Qual � a exception lan�ada e por que?
 * - Por que as linhas 10, 11 e 12 n�o d�o erro?
 */

/* RESPOSTAS
 * - Lan�a uma exce��o do tipo ClassCastException
 * - Por n�o ter um tipo definido na cria��o dessa lista, O java assume que essa lista �
 * do tipo Object, sendo assim podendo aceitar qualquer tipo de dado, por�m ao executar
 * o m�todo sort() da Classe Arrays ele n�o consegue fazer o cast dos tipos e ocorre a 
 * exce��o
 */



