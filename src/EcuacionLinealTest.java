import java.util.Scanner;
public class EcuacionLinealTest {
    public static void main(String[] args) {

            Scanner w = new Scanner(System.in);

            EcuacionLineal ec = new EcuacionLineal(
                    w.nextDouble(), w.nextDouble(), w.nextDouble(),
                    w.nextDouble(), w.nextDouble(), w.nextDouble()
            );

            if (ec.tieneSolucion()) {
                System.out.println("x = " + ec.getX() + ", y = " + ec.getY());
            } else {
                System.out.println("La ecuación no tiene solución");
            }

            w.close();
        }
    }



