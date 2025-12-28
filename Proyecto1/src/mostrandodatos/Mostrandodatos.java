package mostrandodatos;

import java.util.Scanner;

public class Mostrandodatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner (System.in);
	System.out.println("Introduzca su nombre: ");
	String nombre = scanner.nextLine();
	System.out.println("Introduzca sus apellidos: ");
	String apellidos= scanner.nextLine();
	System.out.println(nombre+" "+ apellidos);
	}

}
