import java.util.*;

public class Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] matriz = { { "1", "|", "2", "|", "3" }, { "-", "-", "-", "-", "-" }, { "4", "|", "5", "|", "6" },
				{ "-", "-", "-", "-", "-" }, { "7", "|", "8", "|", "9" } };

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
			}else {
				
				int numero = leer.nextInt();
				turno = Reemplazar_Gato(numero, matriz, turno);
				
			}
			
			
			juego = ganador(juego, matriz);
		}
		if (juego == false) {
			
			if (turno == "J1") {
				System.out.println("Ha ganado: J2 simon sobres zas eres bueno noo");
			}else {
				System.out.println("Ha ganado: J1 simon sobres zas eres bueno noo");
			}
			
			
			
		} else if (juego == true && checkfull(matriz) == true) {
			System.out.println("Mira pues... nadie gano que malos son");
		}

		Imprimir_Gato(matriz);

	}

	public static boolean ganador(boolean flag, String[][] matriz) {
		if (matriz[0][0] == matriz[0][2] & matriz[0][0] == matriz[0][4]) {
			flag = false;
		} else if (matriz[2][0] == matriz[2][2] & matriz[2][0] == matriz[2][4]) {
			flag = false;
		} else if (matriz[4][0] == matriz[4][2] & matriz[4][0] == matriz[4][4]) {
			flag = false;
		} else if (matriz[0][0] == matriz[2][0] & matriz[0][0] == matriz[4][0]) {
			flag = false;
		} else if (matriz[0][2] == matriz[2][2] & matriz[0][2] == matriz[4][2]) {
			flag = false;
		} else if (matriz[0][4] == matriz[2][4] & matriz[0][4] == matriz[4][4]) {
			flag = false;
		} else if (matriz[0][0] == matriz[2][2] & matriz[0][0] == matriz[4][4]) {
			flag = false;
		} else if (matriz[0][4] == matriz[2][2] & matriz[0][4] == matriz[4][0]) {
			flag = false;
		}
		return flag;
	}

	public static String Reemplazar_Gato(int n, String[][] m, String t) {

		switch (n) {
		case 1:
			if (m[0][0] != "1") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[0][0] = "x";
					return "J2";
				} else {
					m[0][0] = "o";
					return "J1";
				}

			}

		case 2:

			if (m[0][2] != "2") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[0][2] = "x";
					return "J2";
				} else {
					m[0][2] = "o";
					return "J1";
				}

			}

		case 3:

			if (m[0][4] != "3") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[0][4] = "x";
					return "J2";
				} else {
					m[0][4] = "o";
					return "J1";
				}

			}

		case 4:

			if (m[2][0] != "4") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[2][0] = "x";
					return "J2";
				} else {
					m[2][0] = "o";
					return "J1";
				}

			}

		case 5:

			if (m[2][2] != "5") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[2][2] = "x";
					return "J2";
				} else {
					m[2][2] = "o";
					return "J1";
				}

			}

		case 6:

			if (m[2][4] != "6") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[2][4] = "x";
					return "J2";
				} else {
					m[2][4] = "o";
					return "J1";
				}

			}

		case 7:

			if (m[4][0] != "7") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[4][0] = "x";
					return "J2";
				} else {
					m[4][0] = "o";
					return "J1";
				}

			}

		case 8:

			if (m[4][2] != "8") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[4][2] = "x";
					return "J2";
				} else {
					m[4][2] = "o";
					return "J1";
				}

			}

		case 9:

			if (m[4][4] != "9") {
				System.err.println("Escoje otro numero");
				return t;
			} else {
				if (t == "J1") {
					m[4][4] = "x";
					return "J2";
				} else {
					m[4][4] = "o";
					return "J1";
				}

			}

		default:
			System.out.println("Escoje un n�mero v�lido");
			return t;

		}
	}

	public static boolean checkfull(String[][] matriz) {
		if (matriz[0][0] != "1" && matriz[0][2] != "2" && matriz[0][4] != "3" && matriz[2][0] != "4"
				&& matriz[2][2] != "5" && matriz[2][4] != "6" && matriz[4][0] != "7" && matriz[4][2] != "8"
				&& matriz[4][4] != "9") {
			return true;
		} else {
			return false;
		}
	}

	public static void Imprimir_Gato(String[][] matriz) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

}
