public class ArraysBidimensionales {

    public static void main (String args[]){

        int[][] matrix = new int[4][5];

        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[0][3] = 40;
        matrix[0][4] = 50;

        matrix[1][0] = 60;
        matrix[1][1] = 70;
        matrix[1][2] = 80;
        matrix[1][3] = 90;
        matrix[1][4] = 100;

        matrix[2][0] = 100;
        matrix[2][1] = 90;
        matrix[2][2] = 80;
        matrix[2][3] = 70;
        matrix[2][4] = 60;

        matrix[3][0] = 50;
        matrix[3][1] = 40;
        matrix[3][2] = 30;
        matrix[3][3] = 20;
        matrix[3][4] = 10;

        for (int fila[] : matrix) {

            System.out.println();

            for (int columna: fila) {
                System.out.print(columna + " ");
            }

        }

    }
}
