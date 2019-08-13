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

/* - Este código lança uma exception. Qual é a exception lançada e por que?
 * - Por que as linhas 10, 11 e 12 não dão erro?
 */

/* RESPOSTAS
 * - Lança uma exceção do tipo ClassCastException
 * - Por não ter um tipo definido na criação dessa lista, O java assume que essa lista é
 * do tipo Object, sendo assim podendo aceitar qualquer tipo de dado, porém ao executar
 * o método sort() da Classe Arrays ele não consegue fazer o cast dos tipos e ocorre a 
 * exceção
 */



