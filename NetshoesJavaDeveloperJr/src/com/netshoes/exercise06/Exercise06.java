package com.netshoes.exercise06;

public class Exercise06 {
	
	public static void main(String[] args) {
		Father f = new Father();
		String result = f.validadeYear("19");
		System.out.println(result);
	}
}
	/*
	public  class Man {
		protected boolean isOld(int x) {
			return x > 70;
		}
	}

	public class Father extends Man {
		
		public String validadeYear(String year) {
			int x = Integer.parseInt(year);
			if(isOld(x)) {
				return "idoso";
			}else {
				return "jovem";
			}
		}
	}
	*/
	
	/* - Escreva um m�todo p�blico que retorne uma String e receba uma String como 
	 *  par�metro.
	 * - O m�todo criado deve chamar isOld da classe Man
	 * - Se o retorno do m�todo isOld for true, seu m�todo deve retornar �idoso� 
	 * sen�o deve retornar �jovem�
     * 
	 */
