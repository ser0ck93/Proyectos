package javaprimerospasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("hello wolrd");

		int edad = 21;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;
		System.out.println("El valor de la condicion es: "+ esPareja);
		if (edad >= 18 && esPareja) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no esta permitido a " + "entrar");
		}
	}}
