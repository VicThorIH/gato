import java.util.Random;
import java.util.Scanner;

public class Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String[] matriz = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		int[][] convi = { {0,1,2} , {3,4,5} , {6,7,8} , {0,3,6}, {1,4,7}, {2,5,8} , {0,4,8} , {2,4,6} };

		String turno = "J1";
		boolean juego = true;
		Scanner leer = new Scanner(System.in);

		while (juego == true && checkfull(matriz) == false) {

			System.out.println("Es tu turno " + turno + " Elige un numero:");
			Imprimir_Gato(matriz);
			if (turno == "J2") {
				Random pcRand = new Random();
				int x = pcRand.nextInt(10) + 1;
				turno = Reemplazar_Gato(x, matriz, turno);
			} else {

				int numero = leer.nextInt();
				turno = Reemplazar_Gato(numero, matriz, turno);

			}

			juego = ganador(juego, matriz);
		}
		if (juego == false) {

			if (turno == "J1") {
				System.out.println("Ha ganado: J2 simon sobres zas eres bueno noo");
			} else {
				System.out.println("Ha ganado: J1 simon sobres zas eres bueno noo");
			}

		} else if (juego == true && checkfull(matriz) == true) {
			System.out.println("Mira pues... nadie gano que malos son");
		}

		Imprimir_Gato(matriz);

	}


	public static void IAPocoInteligente() {
		
	}
	



	public static boolean ganador(boolean flag, String[] matriz) {
		if (matriz[0] == matriz[1] & matriz[2] == matriz[0]) {

			flag = false;
		} else if (matriz[3] == matriz[4] & matriz[5] == matriz[3]) {
			flag = false;
		} else if (matriz[6] == matriz[7] & matriz[8] == matriz[6]) {
			flag = false;
		} else if (matriz[0] == matriz[3] & matriz[6] == matriz[0]) {
			flag = false;
		} else if (matriz[1] == matriz[4] & matriz[7] == matriz[1]) {
			flag = false;
		} else if (matriz[2] == matriz[5] & matriz[8] == matriz[2]) {
			flag = false;
		} else if (matriz[0] == matriz[4] & matriz[8] == matriz[0]) {
			flag = false;
		} else if (matriz[2] == matriz[4] & matriz[6] == matriz[2]) {
			flag = false;
		}
		return flag;
	}

	public static String Reemplazar_Gato(int n, String[] m, String t) {

		switch (n) {
		case 1:
			if (m[0] != "1") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[0] = "x";
					return "J2";
				} else {
					m[0] = "o";
					return "J1";
				}

			}

		case 2:

			if (m[1] != "2") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[1] = "x";
					return "J2";
				} else {
					m[1] = "o";
					return "J1";
				}

			}

		case 3:

			if (m[2] != "3") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[2] = "x";
					return "J2";
				} else {
					m[2] = "o";
					return "J1";
				}

			}

		case 4:

			if (m[3] != "4") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[3] = "x";
					return "J2";
				} else {
					m[3] = "o";
					return "J1";
				}

			}

		case 5:

			if (m[4] != "5") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[4] = "x";
					return "J2";
				} else {
					m[4] = "o";
					return "J1";
				}

			}

		case 6:

			if (m[5] != "6") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[5] = "x";
					return "J2";
				} else {
					m[5] = "o";
					return "J1";
				}

			}

		case 7:

			if (m[6] != "7") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[6] = "x";
					return "J2";
				} else {
					m[6] = "o";
					return "J1";
				}

			}

		case 8:

			if (m[7] != "8") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[7] = "x";
					return "J2";
				} else {
					m[7] = "o";
					return "J1";
				}

			}

		case 9:

			if (m[8] != "9") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[8] = "x";
					return "J2";
				} else {
					m[8] = "o";
					return "J1";
				}

			}

		default:
			System.out.println("Escoje un n�mero v�lido");
			return t;

		}
	}

	public static boolean checkfull(String[] matriz) {
		if (matriz[0] != "1" && matriz[1] != "2" && matriz[2] != "3" && matriz[3] != "4" && matriz[4] != "5"
				&& matriz[5] != "6" && matriz[6] != "7" && matriz[7] != "8" && matriz[8] != "9") {
			return true;
		} else {
			return false;
		}
	}

	public static void Imprimir_Gato(String[] m) {

		System.out.println(" " + m[0] + " | " + m[1] + " | " + m[2]);
		System.out.println("-----------");
		System.out.println(" " + m[3] + " | " + m[4] + " | " + m[5]);
		System.out.println("-----------");
		System.out.println(" " + m[6] + " | " + m[7] + " | " + m[8]);
		System.out.println();
	}

}