package com.company;

public class main {

	public static void main(String[] args) {
		Motor v8 = new Motor();
		
		Acelerador x = new Acelerador();
		
		x.enlazarObservador(v8);
		
		x.pisarElAcelerador();

	}

}
