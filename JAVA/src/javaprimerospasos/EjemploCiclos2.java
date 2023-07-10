package javaprimerospasos;

public class EjemploCiclos2 {
	public static void main(String[] args) {

		int contador = 0;
		int total =0;
		while (contador <= 10) { // mientras que (condicion)
			total = total + contador;	
			contador++; // ejecuta esto
		}
		System.out.println(total);
	}
}