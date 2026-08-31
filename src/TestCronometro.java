import java.util.Random;
public class TestCronometro {
        public static void main(String[] args) {

            final int TAMANO = 100000;

            int[] arreglo = new int[TAMANO];

            Random rand = new Random();

            for (int i = 0; i < TAMANO; i++) {
                arreglo[i] = rand.nextInt(1000000);
            }

            Cronometro crono = new Cronometro();

            crono.inicia();

            ordenacionSeleccion(arreglo);

            crono.detener();

            System.out.println("Tiempo de ordenación por selección: "
                    + crono.lapsoDeTiempo() + " ms");
        }

        public static void ordenacionSeleccion(int[] arr) {

            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {

                int minIdx = i;

                for (int j = i + 1; j < n; j++) {

                    if (arr[j] < arr[minIdx]) {
                        minIdx = j;
                    }
                }

                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }

