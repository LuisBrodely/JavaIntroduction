import javax.swing.*;

public class ComprobarEmail {

    public static void main (String args[]){

        int arroba = 0;
        boolean punto = false;

        String email = JOptionPane.showInputDialog("Ingresa tu correo");

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                arroba ++;
            }

            if(email.charAt(i) =='.'){
                punto = true;
            }
        }

        if (arroba==1 && punto==true){
            System.out.println("Correo valido");
        }else{
            System.out.println("Correo invalido");
        }
    }
}
