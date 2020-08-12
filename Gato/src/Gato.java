
public class Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matriz = { { "1", "|", "2", "|", "3" }, { "-", "-", "-", "-", "-" }, { "4", "|", "5", "|", "6" },
				{ "-", "-", "-", "-", "-" }, { "7", "|", "8", "|", "9" } };

		String turno = "J1";

		Imprimir_Gato(matriz);
		turno = Reemplazar_Gato(9, matriz, turno);
		Imprimir_Gato(matriz);
		turno = Reemplazar_Gato(7, matriz, turno);
		Imprimir_Gato(matriz);
		turno = Reemplazar_Gato(5, matriz, turno);
		Imprimir_Gato(matriz);

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
			System.out.println("Escoje un número válido");
			return t;

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
		System.out.println("Prueba de commit");
	}

}
