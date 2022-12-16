import javax.swing.*;

public class ComprobarEmail {

    public static void main (String args[]){

        boolean arroba = false;

        String email = JOptionPane.showInputDialog("Ingresa tu correo");

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                arroba = true;
            }
        }

        if (arroba==true){
            System.out.println("Correo valido");
        }else{
            System.out.println("Correo invalido");
        }
    }
}
