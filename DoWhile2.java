import javax.swing.*;

public class DoWhile2 {

    public static void main (String args[]){

        String genero = "";

        do {
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
        }while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")==false);


        if (genero.equalsIgnoreCase("M")){
            System.out.println("Eres mujer");
        }else if(genero.equalsIgnoreCase("H")){
            System.out.println("Eres hombre");
        }
    }
}
