package PatioDeJuegos;

import java.util.Scanner;

public class FuncionesVoid {
    static Scanner sc = new Scanner(System.in);
    static String [] datosUsuario = new String[5];
    static String numDoc;
    static String nombre;
    static String apellido;
    static String correo;
    static String contrasenna;


    /*---------------------------------------main-------------------------------------------*/

    public static void main(String[] args) {
        /*print("Hola, soy el valor que pasó como parametro");
        String n = "Ana";
        print("Nombre: "+n);*/

        registrarUsuario();
        inciarSesion();
        imprimirDatos();


    }
    //Funcion void sin argumentos
    public static void print() {
        String texto = "Hola mundo";
        System.out.println(texto);
    }
    //Funcion void que reciba parametros
    public static void print(String txt){
        System.out.println(txt);
    }

    public static void registrarUsuario(){
        print("Ingrese el documento de identidad: ");
        numDoc = sc.nextLine();
        datosUsuario[0] = numDoc;
        print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        datosUsuario[1] = nombre;
        print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        datosUsuario[2] = apellido;
        print("Ingrese el correo: ");
        correo= sc.nextLine();
        datosUsuario[3] = correo;
        print("Ingrese la contraseña: ");
        contrasenna = sc.nextLine();
        datosUsuario[4]= contrasenna;
    }

    public static void imprimirDatos(){
        print("----------------------------------------------------------------------------");
        for(int i =0; i < datosUsuario.length; i++){
            print(datosUsuario[i]);
        }
    }

    public static boolean inciarSesion(){
        print("Ingrese el correo registrado: ");
        String correoReg = sc.nextLine();
        print("Ingrese la contraseña registrada: ");
        String contReg = sc.nextLine();

        if(contReg.equals(datosUsuario[3]) && contrasenna.equals(datosUsuario[4])){
            print("Credenciales correctas.");
            return true;
        } else{
            print("Credenciales invalidas");
            return false;
        }
    }


}
