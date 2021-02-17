package test;

import java.util.Arrays;


public class Arranjo {
	
	public static int[] a = new int[] {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	public static int[] clone_a = a.clone();
	
	public static void main(String[] args) {
		// A array é ordenada com o metodo abaixo.
		Arrays.sort(clone_a);
				
		System.out.println(clone_a[a.length-1]);
		System.out.println(soma());
	}

	public Integer menor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Integer maior() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Integer soma() {
		
		int somaTotal = 0;
		
		for(int valor : a) {
			somaTotal += valor;
		}
		
		return somaTotal;
	}

	public Integer repeticoes(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
