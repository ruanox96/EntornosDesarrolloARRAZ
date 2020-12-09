package debug;

public class Menormayor_primo {

	public static int[] primos(int numero) {

		int k = 0;
		int primos[] = new int[3];
		for (int i = numero - 1; i > 1 && k < 3; i--) {
			if (esPrimo(i)) {
				primos[k] = i;
				k++;
			}
		}

		ordenaArray(primos);

		return primos;

	}

	public static boolean esPrimo(int numero) {

		for (int j = 2; j <= numero / 2; j++) {
			if (numero % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void ordenaArray(int array[]) {
		int aux = 0;
		for (int i = 0; i <= array.length / 2; i++) {
			// vamos guardando la posición que vamos a intercambiar desde el final
			aux = array[array.length - i - 1];
			// como ya tenemos guardada la posición longiutd-i-1, ya podemos guardar en esa
			// posición un valor
			array[array.length - i - 1] = array[i];
			// guardamos en las posiciones iniciales el valor de aux que ya estaba guardado
			array[i] = aux;
		}
	}

	public static int[] mayorMenor(int a, int b, int c) {

		int array[] = new int[2];

		if (a > b && a > c) {
			array[0] = a;
		}
		if (c > b && c > a) {
			array[0] = c;
		}
		if (b > a && b > c) {
			array[0] = b;
		}

		if (a < b && a < c) {
			array[1] = a;
		}
		if (c < b && c < a) {
			array[1] = c;
		}
		if (b < a && b < c) {
			array[1] = b;
		}

		return array;
	}

}
