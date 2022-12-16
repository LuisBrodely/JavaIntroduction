public class Matrices {

    public static void main (String args[]){


        int[] matriz = new int[100];

        for (int i = 0; i < matriz.length; i++) {

            matriz[i] = (int)(Math.random()*100);
        }

        for(int index: matriz){
            System.out.println(index);
        }
    }
}
