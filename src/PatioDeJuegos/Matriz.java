package PatioDeJuegos;

public class Matriz {


    public static void main(String[] args) {
        String[] user1 = {"1","pepe","perez"};
        String[] user2 = {"2","Camila","perez"};
        String[] user3 = {"3","Luisa","Castro"};

        String [][] users = new String [3][3];
        users[0]=user1;
        users[1]=user2;
        users[2]=user3;

        for(int i=0;i<users.length;i++){
            for(int x=0;x<users.length;x++){
                System.out.print(users[i][x] + "  ");
            }
            System.out.println(" ");
        }

    }
}
