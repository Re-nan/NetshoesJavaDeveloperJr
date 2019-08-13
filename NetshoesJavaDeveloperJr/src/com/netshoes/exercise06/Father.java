package com.netshoes.exercise06;

public class Father extends Man {

	public String validadeYear(String year) {
		int x = Integer.parseInt(year);
		if (isOld(x)) {
			return "idoso";
		} else {
			return "jovem";
		}
	}

}
