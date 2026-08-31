import java.util.Scanner;
public class Ecuacioncuadraticatest {

    public static void main(String[] args) {

        Scanner w = new Scanner(System.in);

        Ecuacioncuadratica ec = new Ecuacioncuadratica(
                w.nextInt(), w.nextInt(), w.nextInt()
        );

        if (ec.getDiscriminante() > 0) {
            System.out.println("La ecuación tiene dos raíces: "
                    + ec.getRaiz1() + " y " + ec.getRaiz2());

        } else if (ec.getDiscriminante() == 0) {
            System.out.println("La ecuación tiene una raíz: "
                    + ec.getRaiz1());

        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        w.close();
    }
}
