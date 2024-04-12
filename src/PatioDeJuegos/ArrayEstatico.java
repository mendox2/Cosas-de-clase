package PatioDeJuegos;

public class ArrayEstatico {
    public static void main(String[] args) {
        //Un array puede estar inicializado o ser declarado.
        int size = 5; //Se puede hacer dinamico (más o menos) con una variable que guarde el tamaño
        //Del array
        String carros [] = new String[size]; //Declarado

        //String [] carros = {"Bmw", "Jaguar", "Bentley", "Ferrari"}; //Inicializado
        System.out.println(carros.length);
        System.out.println(carros[2]);
        carros[2] = "Bentley continental";
        System.out.println(carros[2]);
        carros[4] = "Toyota";
        System.out.println(carros[4]);

        int edades [] = new int[6];
        edades[0] = 21;
        edades[1] = 22;
        edades[2] = 23;
        edades[3] = 24;
        edades[4] = 25;
        edades[5] = 26;

        for(int i = 0; i < edades.length; i++){
            System.out.println(edades[i]);
        }


    }
}
