package Poo;
import java.net.SocketTimeoutException;
import java.util.Scanner;
public class Person {

    Scanner scanner = new Scanner(System.in);
    //Atributos

    int id;
    String name;
    String lastName;
    String personType;
    String mail;
    String password;
    int file = 0;
    String [] user = new String [6];
    String [][] users = new String [file][6];


    //Metodos

    public void createPerson(){

        System.out.println("Numero de usuarios a registrar: ");
        file = scanner.nextInt();
        int i=1;

        while(i<file){
            System.out.println("Agrege el usuario "+i);
            System.out.println("Id: ");
            id = scanner.nextInt();
            scanner.nextLine();
            user[0] = id+"";
            System.out.println("Name: ");
            name = scanner.nextLine();
            user[1] = name;
            System.out.println("Last Name: ");
            lastName = scanner.nextLine();
            user[2] = lastName;
            System.out.println("Person type: ");
            personType = scanner.nextLine();
            user[3] = personType;
            System.out.println("Mail: ");
            mail = scanner.nextLine();
            user[4] = mail;
            System.out.println("Password: ");
            password = scanner.nextLine();
            user[5] = password;

            i++;

        }


    }

    public void readPerson(){
        for(int i=0;i<user.length;i++){
            System.out.println(user[i]);
        }
    }

    public void readUsers(){
        for(int i=0;i<users.length;i++){
            for(int x=0;x<users.length;x++){
                System.out.print(users[i][x] + " ");
            }
            System.out.println(" ");
        }
    }

    public void updatePerson(){

    }

    public void deletePerson(){

    }

}
