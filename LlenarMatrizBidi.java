public class LlenarMatrizBidi {
    public static void main (String args[]){

        double acumulado;
        double interes = 0.10;

        double [][] saldo = new double[6][5];

        for (int i = 0; i < 6; i++) {

            saldo[i][0] = 10000;

            acumulado = 10000;

            for (int j = 1; j < 5; j++) {

                acumulado = acumulado+(acumulado*interes);
                saldo[i][j] = acumulado;
            }

            interes = interes+0.01;

        }

        for(double fila[]:saldo){

            System.out.println();
            for (double columna:fila) {
                System.out.printf("%1.2f",columna);
                System.out.print("  ");
            }

        }

    }
}
