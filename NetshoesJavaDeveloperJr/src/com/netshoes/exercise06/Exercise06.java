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
	
	/* - Escreva um método público que retorne uma String e receba uma String como 
	 *  parâmetro.
	 * - O método criado deve chamar isOld da classe Man
	 * - Se o retorno do método isOld for true, seu método deve retornar “idoso” 
	 * senão deve retornar “jovem”
     * 
	 */
