package clase7_funciones;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {

        // Funciones

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }

        sendEmailToUser("ss.mscx@djfaklfdj.com");
        sendEmailToUser("ss.m scx@gmail.com", "Martin");

        var users = new ArrayList<>(Arrays.asList("asidf", "kdfjasdklf"));
        sendEmailToUser(users);
    }

        /// Funcion sin parametros y sin retorno
    public static void sendEmail(){
            System.out.println("Se envia el Email");
        }

        // Funcion con un parametro parametros

    public static void sendEmailToUser(String email){
        System.out.println("Se envia el Email a "+email);
    }

        // Funcion con varios parametro parametros

    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envia el Email a " + name + " " + email);
    }

    public static void sendEmailToUser(ArrayList<String> emails){
        for(String email: emails){
            System.out.println("Se envia el Email a " + email);
        }
    }
}
