package com.netshoes.exercise02;

public class UserInput {
	public static class TextInput {

		StringBuilder values = new StringBuilder();

		public void add(char c) {
			values.append(c);
		}

		public String getValue() {
			return values.toString();
		}
	}

	public static class NumericInput extends TextInput {

		public void add(char c) {
			if (isNumeric(String.valueOf(c))) {
				add(c);
			}
		}

		public static boolean isNumeric(String str) {
			return str.matches("-?\\d+(\\.\\d+)?");
		}
	}

	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());
	}
}

/* RESPOSTAS
 * - Por que o c�digo lan�a uma exception StackOverflowError?
 * - Qual outra express�o regular poderia ser utilizada na linha 24 para garantir que a String � um n�mero inteiro
 * e positivo?
 */

/* - Pelo fato do m�todo add() de NumericInput ser chamado recursivamente estourando a mem�ria
 * - A express�o: \\d+
 */

