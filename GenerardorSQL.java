import java.util.Random;

public class GenerardorSQL {

	public static void main(String[] args) {

		//log("Hola");
		int n;//cantidad datos a generar
		n = Integer.parseInt(args[0]); // con esto tomo por consola la cantidade Datos a generar

		GenerardorSQL objetoM = new GenerardorSQL();

		objetoM.menu();

	}

	private void menu(){
		//log("estoy en el menu");

	}

	private static void log(Object aMensajito){
		System.out.println(String.valueOf(aMensajito));
	}
	
}