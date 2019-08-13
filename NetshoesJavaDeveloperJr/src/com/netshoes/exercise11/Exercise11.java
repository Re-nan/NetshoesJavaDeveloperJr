package com.netshoes.exercise11;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise11 {

	public static void main(String args[]) {
		double num = 1.999;
		BigDecimal x = BigDecimal.valueOf(num);
		x = x.setScale(2,RoundingMode.FLOOR);
		System.out.println(x);
	}
}

/* Insira o trecho de código para que o resultado exibido seja:
 * 1.99
 */