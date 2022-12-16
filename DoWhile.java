import java.util.Scanner;

public class DoWhile {

    public static void main (String args[]){

        Scanner in = new Scanner(System.in);

        int aleatorio = (int)(Math.random()*10);
        System.out.println(aleatorio);

        int numero = 0;

        do {
            System.out.println("Ingresa un numero entre 1 a 10");
            numero = in.nextInt();

            if (numero > aleatorio){
                System.out.println("El numero es mayor al aleatorio");
            } else if (numero < aleatorio) {
                System.out.println("El numero es menor al aleatorio");
            }

        }while (numero!=aleatorio);

        System.out.println("Es correcto");
    }
}
